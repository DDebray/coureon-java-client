package com.coureon.client.example;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.joda.time.DateTime;

import com.coureon.client.api.LabelConnector;
import com.coureon.client.api.ShipmentConnector;
import com.coureon.client.model.Currency;
import com.coureon.client.model.CustomsInfo;
import com.coureon.client.model.CustomsItem;
import com.coureon.client.model.CustomsType;
import com.coureon.client.model.DownloadUrls;
import com.coureon.client.model.LabelTask;
import com.coureon.client.model.LabelTaskResponse;
import com.coureon.client.model.MassUnit;
import com.coureon.client.model.Message;
import com.coureon.client.model.Response;
import com.coureon.client.model.ResponseStatus;
import com.coureon.client.model.Shipment;
import com.coureon.client.model.ShipmentPackage;
import com.coureon.client.model.ShipmentView;
import com.coureon.client.model.TermsOfTrade;

public class PrintInternationalShipmentWithCustoms {
    private static final Logger LOG = Logger.getLogger(CreateShipment.class.getSimpleName());

    public static void main(String[] args) throws IOException, InterruptedException {
        ShipmentConnector shipmentConnector = new ShipmentConnector("<PUT VALID API KEY HERE>");
        LabelConnector labelConnector = new LabelConnector("<PUT VALID API KEY HERE>");

        Shipment shipment = ShipmentDataProvider.createInternationalShipment();
        shipment.setSelectedRateCode("bpost_scan_dpd_dropoff");

        ShipmentPackage shipmentPackage = shipment.getPackages().get(0);

        CustomsInfo customsInfo = new CustomsInfo();
        customsInfo.setAttestationNumber("");
        customsInfo.setCustomsType(CustomsType.OTHER);
        customsInfo.setCustomsTypeDescription("");
        customsInfo.setDescription("");
        customsInfo.setEoriNumber("DE123456789012345");
        customsInfo.setInvoiceDate(DateTime.now().toString());
        customsInfo.setInvoiceNumber("1234567890");
        customsInfo.setOriginCountry("DE");
        customsInfo.setTermsOfTrade(TermsOfTrade.DDP);

        List<CustomsItem> customsItems = new ArrayList<>();
        CustomsItem itemOne = new CustomsItem();
        itemOne.setCommodityCode("9706000000");
        itemOne.setCustomsCurrency(Currency.EUR);
        itemOne.setCustomsValue(150d);
        itemOne.setTitle("Alter Brieföffner aus Silber");
        itemOne.setOriginCountry("DE");
        itemOne.setWeight(300d);
        itemOne.setMassUnit(MassUnit.G);
        itemOne.setItemCount(1);
        customsItems.add(itemOne);

        CustomsItem itemTwo = new CustomsItem();
        itemOne.setCommodityCode("9102120000");
        itemOne.setCustomsCurrency(Currency.EUR);
        itemOne.setCustomsValue(50d);
        itemOne.setTitle("Suunto Traverse Alpha");
        itemOne.setOriginCountry("DE");
        itemOne.setWeight(250d);
        itemOne.setMassUnit(MassUnit.G);
        itemOne.setItemCount(2);
        customsItems.add(itemTwo);

        customsInfo.setCustomsItems(customsItems);
        shipmentPackage.setCustomsInfo(customsInfo);

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