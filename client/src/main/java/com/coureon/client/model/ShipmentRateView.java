package com.coureon.client.model;

import java.util.Objects;

import org.joda.time.LocalDate;

/**
 * ShipmentRateView
 */
public class ShipmentRateView {
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

    public ShipmentRateView amount(Double amount) {
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

    public ShipmentRateView arrivesBy(LocalDate arrivesBy) {
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

    public ShipmentRateView carrierCode(String carrierCode) {
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

    public ShipmentRateView code(String code) {
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

    public ShipmentRateView currency(String currency) {
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

    public ShipmentRateView daysMax(Integer daysMax) {
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

    public ShipmentRateView daysMin(Integer daysMin) {
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

    public ShipmentRateView deliveryAttempts(Integer deliveryAttempts) {
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

    public ShipmentRateView durationTerms(String durationTerms) {
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

    public ShipmentRateView inboundEndpoint(Endpoint inboundEndpoint) {
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

    public ShipmentRateView insuranceAmount(Double insuranceAmount) {
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

    public ShipmentRateView insuranceCurrency(String insuranceCurrency) {
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

    public ShipmentRateView isPickupRate(Boolean isPickupRate) {
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

    public ShipmentRateView outboundEndpoint(Endpoint outboundEndpoint) {
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

    public ShipmentRateView serviceName(String serviceName) {
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

    public ShipmentRateView serviceTerms(String serviceTerms) {
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

    public ShipmentRateView trackable(Boolean trackable) {
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
        ShipmentRateView shipmentRateView = (ShipmentRateView) o;
        return Objects.equals(this.amount, shipmentRateView.amount) && Objects.equals(this.arrivesBy, shipmentRateView.arrivesBy) && Objects.equals(this.carrierCode, shipmentRateView.carrierCode) && Objects.equals(this.code, shipmentRateView.code)
                && Objects.equals(this.currency, shipmentRateView.currency) && Objects.equals(this.daysMax, shipmentRateView.daysMax) && Objects.equals(this.daysMin, shipmentRateView.daysMin) && Objects.equals(this.deliveryAttempts, shipmentRateView.deliveryAttempts)
                && Objects.equals(this.durationTerms, shipmentRateView.durationTerms) && Objects.equals(this.inboundEndpoint, shipmentRateView.inboundEndpoint) && Objects.equals(this.insuranceAmount, shipmentRateView.insuranceAmount)
                && Objects.equals(this.insuranceCurrency, shipmentRateView.insuranceCurrency) && Objects.equals(this.isPickupRate, shipmentRateView.isPickupRate) && Objects.equals(this.outboundEndpoint, shipmentRateView.outboundEndpoint)
                && Objects.equals(this.serviceName, shipmentRateView.serviceName) && Objects.equals(this.serviceTerms, shipmentRateView.serviceTerms) && Objects.equals(this.trackable, shipmentRateView.trackable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, arrivesBy, carrierCode, code, currency, daysMax, daysMin, deliveryAttempts, durationTerms, inboundEndpoint, insuranceAmount, insuranceCurrency, isPickupRate, outboundEndpoint, serviceName, serviceTerms, trackable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShipmentRateView {\n");

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
