package com.coureon.client.model;

import java.util.Objects;

/**
 * Apiv11shipmentShipmentItems
 */
public class ShipmentItem {
    private String      currencyCode = null;
    private CustomsItem customsItem  = null;
    private Double      grossAmount  = null;
    private Long        id           = null;
    private String      imageUrl     = null;
    private MassUnit    massUnit     = null;
    private String      name         = null;
    private Double      netAmount    = null;
    private Integer     quantity     = null;
    private String      sku          = null;
    private Double      taxAmount    = null;
    private Double      weight       = null;

    public ShipmentItem currencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Get currencyCode
     * 
     * @return currencyCode
     **/
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public ShipmentItem customsItem(CustomsItem customsItem) {
        this.customsItem = customsItem;
        return this;
    }

    /**
     * Get customsItem
     * 
     * @return customsItem
     **/
    public CustomsItem getCustomsItem() {
        return customsItem;
    }

    public void setCustomsItem(CustomsItem customsItem) {
        this.customsItem = customsItem;
    }

    public ShipmentItem grossAmount(Double grossAmount) {
        this.grossAmount = grossAmount;
        return this;
    }

    /**
     * Get grossAmount
     * 
     * @return grossAmount
     **/
    public Double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(Double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public ShipmentItem id(Long id) {
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

    public ShipmentItem imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * Get imageUrl
     * 
     * @return imageUrl
     **/
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ShipmentItem massUnit(MassUnit massUnit) {
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

    public ShipmentItem name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * 
     * @return name
     **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShipmentItem netAmount(Double netAmount) {
        this.netAmount = netAmount;
        return this;
    }

    /**
     * Get netAmount
     * 
     * @return netAmount
     **/
    public Double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
    }

    public ShipmentItem quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get quantity
     * 
     * @return quantity
     **/
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ShipmentItem sku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get sku
     * 
     * @return sku
     **/
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public ShipmentItem taxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * Get taxAmount
     * 
     * @return taxAmount
     **/
    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public ShipmentItem weight(Double weight) {
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
        ShipmentItem apiv11shipmentShipmentItems = (ShipmentItem) o;
        return Objects.equals(this.currencyCode, apiv11shipmentShipmentItems.currencyCode) && Objects.equals(this.customsItem, apiv11shipmentShipmentItems.customsItem) && Objects.equals(this.grossAmount, apiv11shipmentShipmentItems.grossAmount)
                && Objects.equals(this.id, apiv11shipmentShipmentItems.id) && Objects.equals(this.imageUrl, apiv11shipmentShipmentItems.imageUrl) && Objects.equals(this.massUnit, apiv11shipmentShipmentItems.massUnit) && Objects.equals(this.name, apiv11shipmentShipmentItems.name)
                && Objects.equals(this.netAmount, apiv11shipmentShipmentItems.netAmount) && Objects.equals(this.quantity, apiv11shipmentShipmentItems.quantity) && Objects.equals(this.sku, apiv11shipmentShipmentItems.sku) && Objects.equals(this.taxAmount, apiv11shipmentShipmentItems.taxAmount)
                && Objects.equals(this.weight, apiv11shipmentShipmentItems.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyCode, customsItem, grossAmount, id, imageUrl, massUnit, name, netAmount, quantity, sku, taxAmount, weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Apiv11shipmentShipmentItems {\n");

        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    customsItem: ").append(toIndentedString(customsItem)).append("\n");
        sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    massUnit: ").append(toIndentedString(massUnit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
        sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
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
