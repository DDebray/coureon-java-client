package com.coureon.client.model;

import java.util.Objects;

/**
 * ShipmentView
 */
public class ShipmentView {
    private Shipment shipment = null;

    public ShipmentView shipment(Shipment shipment) {
        this.shipment = shipment;
        return this;
    }

    /**
     * Get shipment
     * 
     * @return shipment
     **/
    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShipmentView shipmentView = (ShipmentView) o;
        return Objects.equals(this.shipment, shipmentView.shipment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShipmentView {\n");

        sb.append("    shipment: ").append(toIndentedString(shipment)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
