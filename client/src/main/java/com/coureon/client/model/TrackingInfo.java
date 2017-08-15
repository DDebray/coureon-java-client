package com.coureon.client.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.joda.time.DateTime;

/**
 * Apiv11shipmentShipmentTrackingInfo
 */
public class TrackingInfo {
    private Map<String, String> carrierData = null;
    private DateTime            date        = null;

    public TrackingInfo carrierData(Map<String, String> carrierData) {
        this.carrierData = carrierData;
        return this;
    }

    public TrackingInfo putCarrierDataItem(String key, String carrierDataItem) {
        if (this.carrierData == null) {
            this.carrierData = new HashMap<String, String>();
        }
        this.carrierData.put(key, carrierDataItem);
        return this;
    }

    /**
     * Get carrierData
     * 
     * @return carrierData
     **/
    public Map<String, String> getCarrierData() {
        return carrierData;
    }

    public void setCarrierData(Map<String, String> carrierData) {
        this.carrierData = carrierData;
    }

    public TrackingInfo date(DateTime date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     * 
     * @return date
     **/
    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime date) {
        this.date = date;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrackingInfo apiv11shipmentShipmentTrackingInfo = (TrackingInfo) o;
        return Objects.equals(this.carrierData, apiv11shipmentShipmentTrackingInfo.carrierData) && Objects.equals(this.date, apiv11shipmentShipmentTrackingInfo.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carrierData, date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Apiv11shipmentShipmentTrackingInfo {\n");

        sb.append("    carrierData: ").append(toIndentedString(carrierData)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
