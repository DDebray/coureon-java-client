package com.coureon.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.joda.time.DateTime;

/**
 * ShipmentPackageView
 */
public class ShipmentPackageView {
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

    public ShipmentPackageView clientPackageId(Integer clientPackageId) {
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

    public ShipmentPackageView customsInfo(CustomsInfo customsInfo) {
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

    public ShipmentPackageView distanceUnit(DistanceUnit distanceUnit) {
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

    public ShipmentPackageView height(Double height) {
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

    public ShipmentPackageView id(Long id) {
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

    public ShipmentPackageView isDefaultWeight(Boolean isDefaultWeight) {
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

    public ShipmentPackageView items(List<ShipmentItem> items) {
        this.items = items;
        return this;
    }

    public ShipmentPackageView addItemsItem(ShipmentItem itemsItem) {
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

    public ShipmentPackageView length(Double length) {
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

    public ShipmentPackageView massUnit(MassUnit massUnit) {
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

    public ShipmentPackageView printDate(DateTime printDate) {
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

    public ShipmentPackageView trackingNo(String trackingNo) {
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

    public ShipmentPackageView trackingUrl(String trackingUrl) {
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

    public ShipmentPackageView weight(Double weight) {
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

    public ShipmentPackageView width(Double width) {
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
        ShipmentPackageView shipmentPackageView = (ShipmentPackageView) o;
        return Objects.equals(this.clientPackageId, shipmentPackageView.clientPackageId) && Objects.equals(this.customsInfo, shipmentPackageView.customsInfo) && Objects.equals(this.distanceUnit, shipmentPackageView.distanceUnit) && Objects.equals(this.height, shipmentPackageView.height)
                && Objects.equals(this.id, shipmentPackageView.id) && Objects.equals(this.isDefaultWeight, shipmentPackageView.isDefaultWeight) && Objects.equals(this.items, shipmentPackageView.items) && Objects.equals(this.length, shipmentPackageView.length)
                && Objects.equals(this.massUnit, shipmentPackageView.massUnit) && Objects.equals(this.printDate, shipmentPackageView.printDate) && Objects.equals(this.trackingNo, shipmentPackageView.trackingNo) && Objects.equals(this.trackingUrl, shipmentPackageView.trackingUrl)
                && Objects.equals(this.weight, shipmentPackageView.weight) && Objects.equals(this.width, shipmentPackageView.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientPackageId, customsInfo, distanceUnit, height, id, isDefaultWeight, items, length, massUnit, printDate, trackingNo, trackingUrl, weight, width);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShipmentPackageView {\n");

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
