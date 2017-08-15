package com.coureon.client.example;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.logging.Logger;

import com.coureon.client.api.LabelConnector;
import com.coureon.client.api.ShipmentConnector;
import com.coureon.client.model.DownloadUrls;
import com.coureon.client.model.LabelTask;
import com.coureon.client.model.LabelTaskResponse;
import com.coureon.client.model.Message;
import com.coureon.client.model.Response;
import com.coureon.client.model.ResponseStatus;
import com.coureon.client.model.Shipment;
import com.coureon.client.model.ShipmentView;

public class PrintInternationalShipmentWithoutCustoms {
    private static final Logger LOG = Logger.getLogger(CreateShipment.class.getSimpleName());

    public static void main(String[] args) throws IOException, InterruptedException {
        ShipmentConnector shipmentConnector = new ShipmentConnector("<PUT VALID API KEY HERE>");
        LabelConnector labelConnector = new LabelConnector("<PUT VALID API KEY HERE>");

        Shipment shipment = ShipmentDataProvider.createInternationalShipment();
        shipment.setSelectedRateCode("bpost_scan_dpd_pickup");

        ShipmentView shipmentView = new ShipmentView();
        shipmentView.setShipment(shipment);

        Response<LabelTask> labelResponse = shipmentConnector.createAndPrint(shipmentView);

        LOG.info(MessageFormat.format("(createAndPrint) Status: {0}", labelResponse.getStatus()));
        for (Message message : labelResponse.getMessages()) {
            LOG.info(MessageFormat.format("(createAndPrint) Response message key:{0}, ", message.getKey()));
        }

        if (ResponseStatus.OK.equals(labelResponse.getStatus())) {
            Response<LabelTaskResponse> taskResponse = null;
            do {
                taskResponse = labelConnector.getLabelTask(labelResponse.getContent().getTaskId());
                if (taskResponse.getContent().getProgress().getRunning()) {
                    LOG.info("Label print has not finished yet, waiting another 500ms");
                    Thread.sleep(500);
                }
            } while (taskResponse.getContent().getProgress().getRunning());

            LOG.info(MessageFormat.format("Responsestatus: {0}", taskResponse.getStatus()));
            for (Message message : taskResponse.getMessages()) {
                LOG.info(MessageFormat.format("Response message key:{0}, ", message.getKey()));
            }

            for (DownloadUrls url : taskResponse.getContent().getDownloadResult().getDownloadUrls()) {
                LOG.info(url.getUrl());
            }
        }

    }
}