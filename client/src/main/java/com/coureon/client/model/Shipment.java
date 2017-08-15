package com.coureon.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.joda.time.DateTime;

/**
 * Apiv11shipmentShipment
 */
public class Shipment {
    private Address               addressFrom             = null;
    private Address               addressTo               = null;
    private String                marketplaceOrderId      = null;
    private Boolean               needsCustomsDeclaration = null;
    private DateTime              orderDate               = null;
    private List<ShipmentPackage> packages                = new ArrayList<>();
    private List<ShipmentRate>    rates                   = null;
    private String                selectedCarrierService  = null;
    private PrintFormat           selectedPrintFormat     = null;
    private String                selectedRateCode        = null;
    private ShipmentStatus        shipmentStatus          = null;
    private String                shipmentType            = null;
    private String                shopName                = null;
    private List<TrackingInfo>    trackingInfo            = null;

    public Shipment addressFrom(Address addressFrom) {
        this.addressFrom = addressFrom;
        return this;
    }

    /**
     * Get addressFrom
     * 
     * @return addressFrom
     **/
    public Address getAddressFrom() {
        return addressFrom;
    }

    public void setAddressFrom(Address addressFrom) {
        this.addressFrom = addressFrom;
    }

    public Shipment addressTo(Address addressTo) {
        this.addressTo = addressTo;
        return this;
    }

    /**
     * Get addressTo
     * 
     * @return addressTo
     **/
    public Address getAddressTo() {
        return addressTo;
    }

    public void setAddressTo(Address addressTo) {
        this.addressTo = addressTo;
    }

    public Shipment marketplaceOrderId(String marketplaceOrderId) {
        this.marketplaceOrderId = marketplaceOrderId;
        return this;
    }

    /**
     * Get marketplaceOrderId
     * 
     * @return marketplaceOrderId
     **/
    public String getMarketplaceOrderId() {
        return marketplaceOrderId;
    }

    public void setMarketplaceOrderId(String marketplaceOrderId) {
        this.marketplaceOrderId = marketplaceOrderId;
    }

    public Shipment needsCustomsDeclaration(Boolean needsCustomsDeclaration) {
        this.needsCustomsDeclaration = needsCustomsDeclaration;
        return this;
    }

    /**
     * Get needsCustomsDeclaration
     * 
     * @return needsCustomsDeclaration
     **/
    public Boolean getNeedsCustomsDeclaration() {
        return needsCustomsDeclaration;
    }

    public void setNeedsCustomsDeclaration(Boolean needsCustomsDeclaration) {
        this.needsCustomsDeclaration = needsCustomsDeclaration;
    }

    public Shipment orderDate(DateTime orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    /**
     * Get orderDate
     * 
     * @return orderDate
     **/
    public DateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(DateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Shipment packages(List<ShipmentPackage> packages) {
        this.packages = packages;
        return this;
    }

    public Shipment addPackagesItem(ShipmentPackage packagesItem) {
        this.packages.add(packagesItem);
        return this;
    }

    /**
     * Get packages
     * 
     * @return packages
     **/
    public List<ShipmentPackage> getPackages() {
        return packages;
    }

    public void setPackages(List<ShipmentPackage> packages) {
        this.packages = packages;
    }

    public Shipment rates(List<ShipmentRate> rates) {
        this.rates = rates;
        return this;
    }

    public Shipment addRatesItem(ShipmentRate ratesItem) {
        if (this.rates == null) {
            this.rates = new ArrayList<ShipmentRate>();
        }
        this.rates.add(ratesItem);
        return this;
    }

    /**
     * Get rates
     * 
     * @return rates
     **/
    public List<ShipmentRate> getRates() {
        return rates;
    }

    public void setRates(List<ShipmentRate> rates) {
        this.rates = rates;
    }

    public Shipment selectedCarrierService(String selectedCarrierService) {
        this.selectedCarrierService = selectedCarrierService;
        return this;
    }

    /**
     * Get selectedCarrierService
     * 
     * @return selectedCarrierService
     **/
    public String getSelectedCarrierService() {
        return selectedCarrierService;
    }

    public void setSelectedCarrierService(String selectedCarrierService) {
        this.selectedCarrierService = selectedCarrierService;
    }

    public Shipment selectedPrintFormat(PrintFormat selectedPrintFormat) {
        this.selectedPrintFormat = selectedPrintFormat;
        return this;
    }

    /**
     * Get selectedPrintFormat
     * 
     * @return selectedPrintFormat
     **/
    public PrintFormat getSelectedPrintFormat() {
        return selectedPrintFormat;
    }

    public void setSelectedPrintFormat(PrintFormat selectedPrintFormat) {
        this.selectedPrintFormat = selectedPrintFormat;
    }

    public Shipment selectedRateCode(String selectedRateCode) {
        this.selectedRateCode = selectedRateCode;
        return this;
    }

    /**
     * Get selectedRateCode
     * 
     * @return selectedRateCode
     **/
    public String getSelectedRateCode() {
        return selectedRateCode;
    }

    public void setSelectedRateCode(String selectedRateCode) {
        this.selectedRateCode = selectedRateCode;
    }

    public Shipment shipmentStatus(ShipmentStatus shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
        return this;
    }

    /**
     * Get shipmentStatus
     * 
     * @return shipmentStatus
     **/
    public ShipmentStatus getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(ShipmentStatus shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    public Shipment shipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
        return this;
    }

    /**
     * Get shipmentType
     * 
     * @return shipmentType
     **/
    public String getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    public Shipment shopName(String shopName) {
        this.shopName = shopName;
        return this;
    }

    /**
     * Get shopName
     * 
     * @return shopName
     **/
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Shipment trackingInfo(List<TrackingInfo> trackingInfo) {
        this.trackingInfo = trackingInfo;
        return this;
    }

    public Shipment addTrackingInfoItem(TrackingInfo trackingInfoItem) {
        if (this.trackingInfo == null) {
            this.trackingInfo = new ArrayList<TrackingInfo>();
        }
        this.trackingInfo.add(trackingInfoItem);
        return this;
    }

    /**
     * Get trackingInfo
     * 
     * @return trackingInfo
     **/
    public List<TrackingInfo> getTrackingInfo() {
        return trackingInfo;
    }

    public void setTrackingInfo(List<TrackingInfo> trackingInfo) {
        this.trackingInfo = trackingInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Shipment apiv11shipmentShipment = (Shipment) o;
        return Objects.equals(this.addressFrom, apiv11shipmentShipment.addressFrom) && Objects.equals(this.addressTo, apiv11shipmentShipment.addressTo) && Objects.equals(this.marketplaceOrderId, apiv11shipmentShipment.marketplaceOrderId)
                && Objects.equals(this.needsCustomsDeclaration, apiv11shipmentShipment.needsCustomsDeclaration) && Objects.equals(this.orderDate, apiv11shipmentShipment.orderDate) && Objects.equals(this.packages, apiv11shipmentShipment.packages)
                && Objects.equals(this.rates, apiv11shipmentShipment.rates) && Objects.equals(this.selectedCarrierService, apiv11shipmentShipment.selectedCarrierService) && Objects.equals(this.selectedPrintFormat, apiv11shipmentShipment.selectedPrintFormat)
                && Objects.equals(this.selectedRateCode, apiv11shipmentShipment.selectedRateCode) && Objects.equals(this.shipmentStatus, apiv11shipmentShipment.shipmentStatus) && Objects.equals(this.shipmentType, apiv11shipmentShipment.shipmentType)
                && Objects.equals(this.shopName, apiv11shipmentShipment.shopName) && Objects.equals(this.trackingInfo, apiv11shipmentShipment.trackingInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressFrom, addressTo, marketplaceOrderId, needsCustomsDeclaration, orderDate, packages, rates, selectedCarrierService, selectedPrintFormat, selectedRateCode, shipmentStatus, shipmentType, shopName, trackingInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Apiv11shipmentShipment {\n");

        sb.append("    addressFrom: ").append(toIndentedString(addressFrom)).append("\n");
        sb.append("    addressTo: ").append(toIndentedString(addressTo)).append("\n");
        sb.append("    marketplaceOrderId: ").append(toIndentedString(marketplaceOrderId)).append("\n");
        sb.append("    needsCustomsDeclaration: ").append(toIndentedString(needsCustomsDeclaration)).append("\n");
        sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
        sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
        sb.append("    rates: ").append(toIndentedString(rates)).append("\n");
        sb.append("    selectedCarrierService: ").append(toIndentedString(selectedCarrierService)).append("\n");
        sb.append("    selectedPrintFormat: ").append(toIndentedString(selectedPrintFormat)).append("\n");
        sb.append("    selectedRateCode: ").append(toIndentedString(selectedRateCode)).append("\n");
        sb.append("    shipmentStatus: ").append(toIndentedString(shipmentStatus)).append("\n");
        sb.append("    shipmentType: ").append(toIndentedString(shipmentType)).append("\n");
        sb.append("    shopName: ").append(toIndentedString(shopName)).append("\n");
        sb.append("    trackingInfo: ").append(toIndentedString(trackingInfo)).append("\n");
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
