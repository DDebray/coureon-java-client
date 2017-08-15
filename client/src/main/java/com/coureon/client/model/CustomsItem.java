package com.coureon.client.model;

import java.util.Objects;

/**
 * Apiv11shipmentShipmentCustomsInfoCustomsItems
 */
public class CustomsItem {
    private String   commodityCode   = null;
    private Currency customsCurrency = null;
    private Double   customsValue    = null;
    private String   description     = null;
    private Long     id              = null;
    private Integer  itemCount       = null;
    private MassUnit massUnit        = null;
    private String   originCountry   = null;
    private Long     packageId       = null;
    private Long     shipmentItemId  = null;
    private String   title           = null;
    private Double   weight          = null;

    public CustomsItem commodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }

    /**
     * Get commodityCode
     * 
     * @return commodityCode
     **/
    public String getCommodityCode() {
        return commodityCode;
    }

    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    public CustomsItem customsCurrency(Currency customsCurrency) {
        this.customsCurrency = customsCurrency;
        return this;
    }

    /**
     * Get customsCurrency
     * 
     * @return customsCurrency
     **/
    public Currency getCustomsCurrency() {
        return customsCurrency;
    }

    public void setCustomsCurrency(Currency customsCurrency) {
        this.customsCurrency = customsCurrency;
    }

    public CustomsItem customsValue(Double customsValue) {
        this.customsValue = customsValue;
        return this;
    }

    /**
     * Get customsValue
     * 
     * @return customsValue
     **/
    public Double getCustomsValue() {
        return customsValue;
    }

    public void setCustomsValue(Double customsValue) {
        this.customsValue = customsValue;
    }

    public CustomsItem description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * 
     * @return description
     **/
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CustomsItem id(Long id) {
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

    public CustomsItem itemCount(Integer itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    /**
     * Get itemCount
     * 
     * @return itemCount
     **/
    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public CustomsItem massUnit(MassUnit massUnit) {
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

    public CustomsItem originCountry(String originCountry) {
        this.originCountry = originCountry;
        return this;
    }

    /**
     * Get originCountry
     * 
     * @return originCountry
     **/
    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public CustomsItem packageId(Long packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * Get packageId
     * 
     * @return packageId
     **/
    public Long getPackageId() {
        return packageId;
    }

    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }

    public CustomsItem shipmentItemId(Long shipmentItemId) {
        this.shipmentItemId = shipmentItemId;
        return this;
    }

    /**
     * Get shipmentItemId
     * 
     * @return shipmentItemId
     **/
    public Long getShipmentItemId() {
        return shipmentItemId;
    }

    public void setShipmentItemId(Long shipmentItemId) {
        this.shipmentItemId = shipmentItemId;
    }

    public CustomsItem title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     * 
     * @return title
     **/
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CustomsItem weight(Double weight) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomsItem apiv11shipmentShipmentCustomsInfoCustomsItems = (CustomsItem) o;
        return Objects.equals(this.commodityCode, apiv11shipmentShipmentCustomsInfoCustomsItems.commodityCode) && Objects.equals(this.customsCurrency, apiv11shipmentShipmentCustomsInfoCustomsItems.customsCurrency)
                && Objects.equals(this.customsValue, apiv11shipmentShipmentCustomsInfoCustomsItems.customsValue) && Objects.equals(this.description, apiv11shipmentShipmentCustomsInfoCustomsItems.description) && Objects.equals(this.id, apiv11shipmentShipmentCustomsInfoCustomsItems.id)
                && Objects.equals(this.itemCount, apiv11shipmentShipmentCustomsInfoCustomsItems.itemCount) && Objects.equals(this.massUnit, apiv11shipmentShipmentCustomsInfoCustomsItems.massUnit) && Objects.equals(this.originCountry, apiv11shipmentShipmentCustomsInfoCustomsItems.originCountry)
                && Objects.equals(this.packageId, apiv11shipmentShipmentCustomsInfoCustomsItems.packageId) && Objects.equals(this.shipmentItemId, apiv11shipmentShipmentCustomsInfoCustomsItems.shipmentItemId) && Objects.equals(this.title, apiv11shipmentShipmentCustomsInfoCustomsItems.title)
                && Objects.equals(this.weight, apiv11shipmentShipmentCustomsInfoCustomsItems.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commodityCode, customsCurrency, customsValue, description, id, itemCount, massUnit, originCountry, packageId, shipmentItemId, title, weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Apiv11shipmentShipmentCustomsInfoCustomsItems {\n");

        sb.append("    commodityCode: ").append(toIndentedString(commodityCode)).append("\n");
        sb.append("    customsCurrency: ").append(toIndentedString(customsCurrency)).append("\n");
        sb.append("    customsValue: ").append(toIndentedString(customsValue)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
        sb.append("    massUnit: ").append(toIndentedString(massUnit)).append("\n");
        sb.append("    originCountry: ").append(toIndentedString(originCountry)).append("\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    shipmentItemId: ").append(toIndentedString(shipmentItemId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
