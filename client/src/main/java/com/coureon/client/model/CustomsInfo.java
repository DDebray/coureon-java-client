package com.coureon.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Apiv11shipmentShipmentCustomsInfo
 */
public class CustomsInfo {
    private String            attestationNumber      = null;
    private List<CustomsItem> customsItems           = new ArrayList<CustomsItem>();
    private CustomsType       customsType            = null;
    private String            customsTypeDescription = null;
    private String            description            = null;
    private String            eoriNumber             = null;
    private String            invoiceDate            = null;
    private String            invoiceNumber          = null;
    private InvoiceType       invoiceType            = null;
    private String            mrnNumber              = null;
    private String            originCountry          = null;
    private Long              packageId              = null;
    private String            permitNumber           = null;
    private Long              shipmentId             = null;
    private TermsOfTrade      termsOfTrade           = null;

    public CustomsInfo attestationNumber(String attestationNumber) {
        this.attestationNumber = attestationNumber;
        return this;
    }

    /**
     * Get attestationNumber
     * 
     * @return attestationNumber
     **/
    public String getAttestationNumber() {
        return attestationNumber;
    }

    public void setAttestationNumber(String attestationNumber) {
        this.attestationNumber = attestationNumber;
    }

    public CustomsInfo customsItems(List<CustomsItem> customsItems) {
        this.customsItems = customsItems;
        return this;
    }

    public CustomsInfo addCustomsItemsItem(CustomsItem customsItemsItem) {
        this.customsItems.add(customsItemsItem);
        return this;
    }

    /**
     * Get customsItems
     * 
     * @return customsItems
     **/
    public List<CustomsItem> getCustomsItems() {
        return customsItems;
    }

    public void setCustomsItems(List<CustomsItem> customsItems) {
        this.customsItems = customsItems;
    }

    public CustomsInfo customsType(CustomsType customsType) {
        this.customsType = customsType;
        return this;
    }

    /**
     * Get customsType
     * 
     * @return customsType
     **/

    public CustomsType getCustomsType() {
        return customsType;
    }

    public void setCustomsType(CustomsType customsType) {
        this.customsType = customsType;
    }

    public CustomsInfo customsTypeDescription(String customsTypeDescription) {
        this.customsTypeDescription = customsTypeDescription;
        return this;
    }

    /**
     * Get customsTypeDescription
     * 
     * @return customsTypeDescription
     **/
    public String getCustomsTypeDescription() {
        return customsTypeDescription;
    }

    public void setCustomsTypeDescription(String customsTypeDescription) {
        this.customsTypeDescription = customsTypeDescription;
    }

    public CustomsInfo description(String description) {
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

    public CustomsInfo eoriNumber(String eoriNumber) {
        this.eoriNumber = eoriNumber;
        return this;
    }

    /**
     * Get eoriNumber
     * 
     * @return eoriNumber
     **/
    public String getEoriNumber() {
        return eoriNumber;
    }

    public void setEoriNumber(String eoriNumber) {
        this.eoriNumber = eoriNumber;
    }

    public CustomsInfo invoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }

    /**
     * Get invoiceDate
     * 
     * @return invoiceDate
     **/
    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public CustomsInfo invoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    /**
     * Get invoiceNumber
     * 
     * @return invoiceNumber
     **/
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public CustomsInfo invoiceType(InvoiceType invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }

    /**
     * Get invoiceType
     * 
     * @return invoiceType
     **/
    public InvoiceType getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(InvoiceType invoiceType) {
        this.invoiceType = invoiceType;
    }

    public CustomsInfo mrnNumber(String mrnNumber) {
        this.mrnNumber = mrnNumber;
        return this;
    }

    /**
     * Get mrnNumber
     * 
     * @return mrnNumber
     **/
    public String getMrnNumber() {
        return mrnNumber;
    }

    public void setMrnNumber(String mrnNumber) {
        this.mrnNumber = mrnNumber;
    }

    public CustomsInfo originCountry(String originCountry) {
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

    public CustomsInfo packageId(Long packageId) {
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

    public CustomsInfo permitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
        return this;
    }

    /**
     * Get permitNumber
     * 
     * @return permitNumber
     **/
    public String getPermitNumber() {
        return permitNumber;
    }

    public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }

    public CustomsInfo shipmentId(Long shipmentId) {
        this.shipmentId = shipmentId;
        return this;
    }

    /**
     * Get shipmentId
     * 
     * @return shipmentId
     **/
    public Long getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Long shipmentId) {
        this.shipmentId = shipmentId;
    }

    public CustomsInfo termsOfTrade(TermsOfTrade termsOfTrade) {
        this.termsOfTrade = termsOfTrade;
        return this;
    }

    /**
     * Get termsOfTrade
     * 
     * @return termsOfTrade
     **/
    public TermsOfTrade getTermsOfTrade() {
        return termsOfTrade;
    }

    public void setTermsOfTrade(TermsOfTrade termsOfTrade) {
        this.termsOfTrade = termsOfTrade;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomsInfo apiv11shipmentShipmentCustomsInfo = (CustomsInfo) o;
        return Objects.equals(this.attestationNumber, apiv11shipmentShipmentCustomsInfo.attestationNumber) && Objects.equals(this.customsItems, apiv11shipmentShipmentCustomsInfo.customsItems) && Objects.equals(this.customsType, apiv11shipmentShipmentCustomsInfo.customsType)
                && Objects.equals(this.customsTypeDescription, apiv11shipmentShipmentCustomsInfo.customsTypeDescription) && Objects.equals(this.description, apiv11shipmentShipmentCustomsInfo.description) && Objects.equals(this.eoriNumber, apiv11shipmentShipmentCustomsInfo.eoriNumber)
                && Objects.equals(this.invoiceDate, apiv11shipmentShipmentCustomsInfo.invoiceDate) && Objects.equals(this.invoiceNumber, apiv11shipmentShipmentCustomsInfo.invoiceNumber) && Objects.equals(this.invoiceType, apiv11shipmentShipmentCustomsInfo.invoiceType)
                && Objects.equals(this.mrnNumber, apiv11shipmentShipmentCustomsInfo.mrnNumber) && Objects.equals(this.originCountry, apiv11shipmentShipmentCustomsInfo.originCountry) && Objects.equals(this.packageId, apiv11shipmentShipmentCustomsInfo.packageId)
                && Objects.equals(this.permitNumber, apiv11shipmentShipmentCustomsInfo.permitNumber) && Objects.equals(this.shipmentId, apiv11shipmentShipmentCustomsInfo.shipmentId) && Objects.equals(this.termsOfTrade, apiv11shipmentShipmentCustomsInfo.termsOfTrade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attestationNumber, customsItems, customsType, customsTypeDescription, description, eoriNumber, invoiceDate, invoiceNumber, invoiceType, mrnNumber, originCountry, packageId, permitNumber, shipmentId, termsOfTrade);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Apiv11shipmentShipmentCustomsInfo {\n");

        sb.append("    attestationNumber: ").append(toIndentedString(attestationNumber)).append("\n");
        sb.append("    customsItems: ").append(toIndentedString(customsItems)).append("\n");
        sb.append("    customsType: ").append(toIndentedString(customsType)).append("\n");
        sb.append("    customsTypeDescription: ").append(toIndentedString(customsTypeDescription)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    eoriNumber: ").append(toIndentedString(eoriNumber)).append("\n");
        sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
        sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
        sb.append("    invoiceType: ").append(toIndentedString(invoiceType)).append("\n");
        sb.append("    mrnNumber: ").append(toIndentedString(mrnNumber)).append("\n");
        sb.append("    originCountry: ").append(toIndentedString(originCountry)).append("\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    permitNumber: ").append(toIndentedString(permitNumber)).append("\n");
        sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
        sb.append("    termsOfTrade: ").append(toIndentedString(termsOfTrade)).append("\n");
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
