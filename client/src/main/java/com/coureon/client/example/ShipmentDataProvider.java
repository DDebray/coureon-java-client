package com.coureon.client.example;

import java.util.Collections;

import org.joda.time.DateTime;

import com.coureon.client.model.Address;
import com.coureon.client.model.DistanceUnit;
import com.coureon.client.model.MassUnit;
import com.coureon.client.model.Shipment;
import com.coureon.client.model.ShipmentPackage;

public class ShipmentDataProvider {
    private ShipmentDataProvider() {

    }

    public static Shipment createInternationalShipment() {
        Address addressFrom = new Address();
        addressFrom.setName("Daniel Debray");
        addressFrom.setCompany("Coureon Logistics GmbH");
        addressFrom.setStreet1("Friedrichstraße");
        addressFrom.setStreetNo("231");
        addressFrom.setPostalCode("10969");
        addressFrom.setCity("Berlin");
        addressFrom.setCountry("DE");

        Address addressTo = new Address();
        addressTo.setName("Test Receiver");
        addressTo.setStreet1("Sheikh Zayed Road");
        addressTo.setStreetNo("95");
        addressTo.setPostalCode("482032");
        addressTo.setCity("Dubai");
        addressTo.setCountry("AE");

        ShipmentPackage shipmentPackage = new ShipmentPackage();
        shipmentPackage.setDistanceUnit(DistanceUnit.CM);
        shipmentPackage.setLength(50d);
        shipmentPackage.setWidth(40d);
        shipmentPackage.setHeight(30d);
        shipmentPackage.setMassUnit(MassUnit.KG);
        shipmentPackage.setWeight(3d);

        Shipment shipment = new Shipment();
        shipment.setOrderDate(DateTime.now());
        shipment.setAddressFrom(addressFrom);
        shipment.setAddressTo(addressTo);
        shipment.setPackages(Collections.singletonList(shipmentPackage));

        return shipment;
    }

    public static Shipment createNationalShipment() {
        Address addressFrom = new Address();
        addressFrom.setName("Daniel Debray");
        addressFrom.setCompany("Coureon Logistics GmbH");
        addressFrom.setStreet1("Friedrichstraße");
        addressFrom.setStreetNo("231");
        addressFrom.setPostalCode("10969");
        addressFrom.setCity("Berlin");
        addressFrom.setCountry("DE");

        Address addressTo = new Address();
        addressTo.setName("Test Receiver");
        addressTo.setStreet1("Glockengießerwall");
        addressTo.setStreetNo("5");
        addressTo.setPostalCode("20095");
        addressTo.setCity("Hamburg");
        addressTo.setCountry("DE");

        ShipmentPackage shipmentPackage = new ShipmentPackage();
        shipmentPackage.setDistanceUnit(DistanceUnit.CM);
        shipmentPackage.setLength(50d);
        shipmentPackage.setWidth(40d);
        shipmentPackage.setHeight(30d);
        shipmentPackage.setMassUnit(MassUnit.KG);
        shipmentPackage.setWeight(3d);

        Shipment shipment = new Shipment();
        shipment.setOrderDate(DateTime.now());
        shipment.setAddressFrom(addressFrom);
        shipment.setAddressTo(addressTo);
        shipment.setPackages(Collections.singletonList(shipmentPackage));

        return shipment;
    }
}
