package com.coureon.client.example;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.logging.Logger;

import com.coureon.client.api.ShipmentConnector;
import com.coureon.client.model.Message;
import com.coureon.client.model.Response;
import com.coureon.client.model.Shipment;
import com.coureon.client.model.ShipmentView;

public class CreateShipment {
    private static final Logger LOG = Logger.getLogger(CreateShipment.class.getSimpleName());

    public static void main(String[] args) throws IOException {
        ShipmentConnector shipmentConnector = new ShipmentConnector("<PUT VALID API KEY HERE>");

        Shipment shipment = ShipmentDataProvider.createInternationalShipment();

        ShipmentView shipmentView = new ShipmentView();
        shipmentView.setShipment(shipment);

        Response<ShipmentView> response = shipmentConnector.createShipment(shipmentView);

        LOG.info(MessageFormat.format("Responsestatus: {0}", response.getStatus()));
        for (Message message : response.getMessages()) {
            LOG.info(MessageFormat.format("Response message key:{0}, ", message.getKey()));
        }
    }
}