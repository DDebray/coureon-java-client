package com.coureon.client.model;

import java.util.Objects;

import org.joda.time.LocalDate;

/**
 * Apiv11shipmentShipmentRates
 */
public class ShipmentRate {
    private Double    amount            = null;
    private LocalDate arrivesBy         = null;
    private String    carrierCode       = null;
    private String    code              = null;
    private String    currency          = null;
    private Integer   daysMax           = null;
    private Integer   daysMin           = null;
    private Integer   deliveryAttempts  = null;
    private String    durationTerms     = null;
    private Endpoint  inboundEndpoint   = null;
    private Double    insuranceAmount   = null;
    private String    insuranceCurrency = null;
    private Boolean   isPickupRate      = null;
    private Endpoint  outboundEndpoint  = null;
    private String    serviceName       = null;
    private String    serviceTerms      = null;
    private Boolean   trackable         = null;

    public ShipmentRate amount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     * 
     * @return amount
     **/
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public ShipmentRate arrivesBy(LocalDate arrivesBy) {
        this.arrivesBy = arrivesBy;
        return this;
    }

    /**
     * Get arrivesBy
     * 
     * @return arrivesBy
     **/
    public LocalDate getArrivesBy() {
        return arrivesBy;
    }

    public void setArrivesBy(LocalDate arrivesBy) {
        this.arrivesBy = arrivesBy;
    }

    public ShipmentRate carrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
        return this;
    }

    /**
     * Get carrierCode
     * 
     * @return carrierCode
     **/
    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public ShipmentRate code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     * 
     * @return code
     **/
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ShipmentRate currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     * 
     * @return currency
     **/
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ShipmentRate daysMax(Integer daysMax) {
        this.daysMax = daysMax;
        return this;
    }

    /**
     * Get daysMax
     * 
     * @return daysMax
     **/
    public Integer getDaysMax() {
        return daysMax;
    }

    public void setDaysMax(Integer daysMax) {
        this.daysMax = daysMax;
    }

    public ShipmentRate daysMin(Integer daysMin) {
        this.daysMin = daysMin;
        return this;
    }

    /**
     * Get daysMin
     * 
     * @return daysMin
     **/
    public Integer getDaysMin() {
        return daysMin;
    }

    public void setDaysMin(Integer daysMin) {
        this.daysMin = daysMin;
    }

    public ShipmentRate deliveryAttempts(Integer deliveryAttempts) {
        this.deliveryAttempts = deliveryAttempts;
        return this;
    }

    /**
     * Get deliveryAttempts
     * 
     * @return deliveryAttempts
     **/
    public Integer getDeliveryAttempts() {
        return deliveryAttempts;
    }

    public void setDeliveryAttempts(Integer deliveryAttempts) {
        this.deliveryAttempts = deliveryAttempts;
    }

    public ShipmentRate durationTerms(String durationTerms) {
        this.durationTerms = durationTerms;
        return this;
    }

    /**
     * Get durationTerms
     * 
     * @return durationTerms
     **/
    public String getDurationTerms() {
        return durationTerms;
    }

    public void setDurationTerms(String durationTerms) {
        this.durationTerms = durationTerms;
    }

    public ShipmentRate inboundEndpoint(Endpoint inboundEndpoint) {
        this.inboundEndpoint = inboundEndpoint;
        return this;
    }

    /**
     * Get inboundEndpoint
     * 
     * @return inboundEndpoint
     **/
    public Endpoint getInboundEndpoint() {
        return inboundEndpoint;
    }

    public void setInboundEndpoint(Endpoint inboundEndpoint) {
        this.inboundEndpoint = inboundEndpoint;
    }

    public ShipmentRate insuranceAmount(Double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
        return this;
    }

    /**
     * Get insuranceAmount
     * 
     * @return insuranceAmount
     **/
    public Double getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(Double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public ShipmentRate insuranceCurrency(String insuranceCurrency) {
        this.insuranceCurrency = insuranceCurrency;
        return this;
    }

    /**
     * Get insuranceCurrency
     * 
     * @return insuranceCurrency
     **/
    public String getInsuranceCurrency() {
        return insuranceCurrency;
    }

    public void setInsuranceCurrency(String insuranceCurrency) {
        this.insuranceCurrency = insuranceCurrency;
    }

    public ShipmentRate isPickupRate(Boolean isPickupRate) {
        this.isPickupRate = isPickupRate;
        return this;
    }

    /**
     * Get isPickupRate
     * 
     * @return isPickupRate
     **/
    public Boolean getIsPickupRate() {
        return isPickupRate;
    }

    public void setIsPickupRate(Boolean isPickupRate) {
        this.isPickupRate = isPickupRate;
    }

    public ShipmentRate outboundEndpoint(Endpoint outboundEndpoint) {
        this.outboundEndpoint = outboundEndpoint;
        return this;
    }

    /**
     * Get outboundEndpoint
     * 
     * @return outboundEndpoint
     **/
    public Endpoint getOutboundEndpoint() {
        return outboundEndpoint;
    }

    public void setOutboundEndpoint(Endpoint outboundEndpoint) {
        this.outboundEndpoint = outboundEndpoint;
    }

    public ShipmentRate serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get serviceName
     * 
     * @return serviceName
     **/
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ShipmentRate serviceTerms(String serviceTerms) {
        this.serviceTerms = serviceTerms;
        return this;
    }

    /**
     * Get serviceTerms
     * 
     * @return serviceTerms
     **/
    public String getServiceTerms() {
        return serviceTerms;
    }

    public void setServiceTerms(String serviceTerms) {
        this.serviceTerms = serviceTerms;
    }

    public ShipmentRate trackable(Boolean trackable) {
        this.trackable = trackable;
        return this;
    }

    /**
     * Get trackable
     * 
     * @return trackable
     **/
    public Boolean getTrackable() {
        return trackable;
    }

    public void setTrackable(Boolean trackable) {
        this.trackable = trackable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShipmentRate otherShipmentRate = (ShipmentRate) o;
        return Objects.equals(this.amount, otherShipmentRate.amount) && Objects.equals(this.arrivesBy, otherShipmentRate.arrivesBy) && Objects.equals(this.carrierCode, otherShipmentRate.carrierCode) && Objects.equals(this.code, otherShipmentRate.code)
                && Objects.equals(this.currency, otherShipmentRate.currency) && Objects.equals(this.daysMax, otherShipmentRate.daysMax) && Objects.equals(this.daysMin, otherShipmentRate.daysMin) && Objects.equals(this.deliveryAttempts, otherShipmentRate.deliveryAttempts)
                && Objects.equals(this.durationTerms, otherShipmentRate.durationTerms) && Objects.equals(this.inboundEndpoint, otherShipmentRate.inboundEndpoint) && Objects.equals(this.insuranceAmount, otherShipmentRate.insuranceAmount)
                && Objects.equals(this.insuranceCurrency, otherShipmentRate.insuranceCurrency) && Objects.equals(this.isPickupRate, otherShipmentRate.isPickupRate) && Objects.equals(this.outboundEndpoint, otherShipmentRate.outboundEndpoint)
                && Objects.equals(this.serviceName, otherShipmentRate.serviceName) && Objects.equals(this.serviceTerms, otherShipmentRate.serviceTerms) && Objects.equals(this.trackable, otherShipmentRate.trackable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, arrivesBy, carrierCode, code, currency, daysMax, daysMin, deliveryAttempts, durationTerms, inboundEndpoint, insuranceAmount, insuranceCurrency, isPickupRate, outboundEndpoint, serviceName, serviceTerms, trackable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Apiv11shipmentShipmentRates {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    arrivesBy: ").append(toIndentedString(arrivesBy)).append("\n");
        sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    daysMax: ").append(toIndentedString(daysMax)).append("\n");
        sb.append("    daysMin: ").append(toIndentedString(daysMin)).append("\n");
        sb.append("    deliveryAttempts: ").append(toIndentedString(deliveryAttempts)).append("\n");
        sb.append("    durationTerms: ").append(toIndentedString(durationTerms)).append("\n");
        sb.append("    inboundEndpoint: ").append(toIndentedString(inboundEndpoint)).append("\n");
        sb.append("    insuranceAmount: ").append(toIndentedString(insuranceAmount)).append("\n");
        sb.append("    insuranceCurrency: ").append(toIndentedString(insuranceCurrency)).append("\n");
        sb.append("    isPickupRate: ").append(toIndentedString(isPickupRate)).append("\n");
        sb.append("    outboundEndpoint: ").append(toIndentedString(outboundEndpoint)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    serviceTerms: ").append(toIndentedString(serviceTerms)).append("\n");
        sb.append("    trackable: ").append(toIndentedString(trackable)).append("\n");
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
