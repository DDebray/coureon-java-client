package com.coureon.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.joda.time.DateTime;

public class ShipmentPackage {
    private Integer            clientPackageId = null;
    private CustomsInfo        customsInfo     = null;
    private DistanceUnit       distanceUnit    = null;
    private Double             height          = null;
    private Long               id              = null;
    private Boolean            isDefaultWeight = null;
    private List<ShipmentItem> items           = null;
    private Double             length          = null;
    private MassUnit           massUnit        = null;
    private DateTime           printDate       = null;
    private String             trackingNo      = null;
    private String             trackingUrl     = null;
    private Double             weight          = null;
    private Double             width           = null;

    public ShipmentPackage clientPackageId(Integer clientPackageId) {
        this.clientPackageId = clientPackageId;
        return this;
    }

    /**
     * Get clientPackageId
     * 
     * @return clientPackageId
     **/
    public Integer getClientPackageId() {
        return clientPackageId;
    }

    public void setClientPackageId(Integer clientPackageId) {
        this.clientPackageId = clientPackageId;
    }

    public ShipmentPackage customsInfo(CustomsInfo customsInfo) {
        this.customsInfo = customsInfo;
        return this;
    }

    /**
     * Get customsInfo
     * 
     * @return customsInfo
     **/
    public CustomsInfo getCustomsInfo() {
        return customsInfo;
    }

    public void setCustomsInfo(CustomsInfo customsInfo) {
        this.customsInfo = customsInfo;
    }

    public ShipmentPackage distanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit;
        return this;
    }

    /**
     * Get distanceUnit
     * 
     * @return distanceUnit
     **/
    public DistanceUnit getDistanceUnit() {
        return distanceUnit;
    }

    public void setDistanceUnit(DistanceUnit distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    public ShipmentPackage height(Double height) {
        this.height = height;
        return this;
    }

    /**
     * Get height
     * 
     * @return height
     **/
    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public ShipmentPackage id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * 
     * @return id
     **/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShipmentPackage isDefaultWeight(Boolean isDefaultWeight) {
        this.isDefaultWeight = isDefaultWeight;
        return this;
    }

    /**
     * Get isDefaultWeight
     * 
     * @return isDefaultWeight
     **/
    public Boolean getIsDefaultWeight() {
        return isDefaultWeight;
    }

    public void setIsDefaultWeight(Boolean isDefaultWeight) {
        this.isDefaultWeight = isDefaultWeight;
    }

    public ShipmentPackage items(List<ShipmentItem> items) {
        this.items = items;
        return this;
    }

    public ShipmentPackage addItemsItem(ShipmentItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<ShipmentItem>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Get items
     * 
     * @return items
     **/
    public List<ShipmentItem> getItems() {
        return items;
    }

    public void setItems(List<ShipmentItem> items) {
        this.items = items;
    }

    public ShipmentPackage length(Double length) {
        this.length = length;
        return this;
    }

    /**
     * Get length
     * 
     * @return length
     **/
    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public ShipmentPackage massUnit(MassUnit massUnit) {
        this.massUnit = massUnit;
        return this;
    }

    /**
     * Get massUnit
     * 
     * @return massUnit
     **/
    public MassUnit getMassUnit() {
        return massUnit;
    }

    public void setMassUnit(MassUnit massUnit) {
        this.massUnit = massUnit;
    }

    public ShipmentPackage printDate(DateTime printDate) {
        this.printDate = printDate;
        return this;
    }

    /**
     * Get printDate
     * 
     * @return printDate
     **/
    public DateTime getPrintDate() {
        return printDate;
    }

    public void setPrintDate(DateTime printDate) {
        this.printDate = printDate;
    }

    public ShipmentPackage trackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
        return this;
    }

    /**
     * Get trackingNo
     * 
     * @return trackingNo
     **/
    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    public ShipmentPackage trackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
        return this;
    }

    /**
     * Get trackingUrl
     * 
     * @return trackingUrl
     **/
    public String getTrackingUrl() {
        return trackingUrl;
    }

    public void setTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }

    public ShipmentPackage weight(Double weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get weight
     * 
     * @return weight
     **/
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public ShipmentPackage width(Double width) {
        this.width = width;
        return this;
    }

    /**
     * Get width
     * 
     * @return width
     **/
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShipmentPackage apiv11shipmentShipmentPackages = (ShipmentPackage) o;
        return Objects.equals(this.clientPackageId, apiv11shipmentShipmentPackages.clientPackageId) && Objects.equals(this.customsInfo, apiv11shipmentShipmentPackages.customsInfo) && Objects.equals(this.distanceUnit, apiv11shipmentShipmentPackages.distanceUnit)
                && Objects.equals(this.height, apiv11shipmentShipmentPackages.height) && Objects.equals(this.id, apiv11shipmentShipmentPackages.id) && Objects.equals(this.isDefaultWeight, apiv11shipmentShipmentPackages.isDefaultWeight)
                && Objects.equals(this.items, apiv11shipmentShipmentPackages.items) && Objects.equals(this.length, apiv11shipmentShipmentPackages.length) && Objects.equals(this.massUnit, apiv11shipmentShipmentPackages.massUnit)
                && Objects.equals(this.printDate, apiv11shipmentShipmentPackages.printDate) && Objects.equals(this.trackingNo, apiv11shipmentShipmentPackages.trackingNo) && Objects.equals(this.trackingUrl, apiv11shipmentShipmentPackages.trackingUrl)
                && Objects.equals(this.weight, apiv11shipmentShipmentPackages.weight) && Objects.equals(this.width, apiv11shipmentShipmentPackages.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientPackageId, customsInfo, distanceUnit, height, id, isDefaultWeight, items, length, massUnit, printDate, trackingNo, trackingUrl, weight, width);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Apiv11shipmentShipmentPackages {\n");

        sb.append("    clientPackageId: ").append(toIndentedString(clientPackageId)).append("\n");
        sb.append("    customsInfo: ").append(toIndentedString(customsInfo)).append("\n");
        sb.append("    distanceUnit: ").append(toIndentedString(distanceUnit)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isDefaultWeight: ").append(toIndentedString(isDefaultWeight)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    length: ").append(toIndentedString(length)).append("\n");
        sb.append("    massUnit: ").append(toIndentedString(massUnit)).append("\n");
        sb.append("    printDate: ").append(toIndentedString(printDate)).append("\n");
        sb.append("    trackingNo: ").append(toIndentedString(trackingNo)).append("\n");
        sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
