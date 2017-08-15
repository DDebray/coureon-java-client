package com.coureon.client.model;

import java.util.Objects;

/**
 * Apiv11shipmentShipmentAddressFrom
 */
public class Address {
    private String  city        = null;
    private String  company     = null;
    private String  country     = null;
    private String  email       = null;
    private Long    id          = null;
    private String  name        = null;
    private String  phone       = null;
    private String  postalCode  = null;
    private Boolean residential = null;
    private String  state       = null;
    private String  street1     = null;
    private String  street2     = null;
    private String  streetNo    = null;

    public Address city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get city
     * 
     * @return city
     **/
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address company(String company) {
        this.company = company;
        return this;
    }

    /**
     * Get company
     * 
     * @return company
     **/
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Address country(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get country
     * 
     * @return country
     **/
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Address email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     * 
     * @return email
     **/
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address id(Long id) {
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

    public Address name(String name) {
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

    public Address phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get phone
     * 
     * @return phone
     **/
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get postalCode
     * 
     * @return postalCode
     **/
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Address residential(Boolean residential) {
        this.residential = residential;
        return this;
    }

    /**
     * Get residential
     * 
     * @return residential
     **/
    public Boolean getResidential() {
        return residential;
    }

    public void setResidential(Boolean residential) {
        this.residential = residential;
    }

    public Address state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * 
     * @return state
     **/
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Address street1(String street1) {
        this.street1 = street1;
        return this;
    }

    /**
     * Get street1
     * 
     * @return street1
     **/
    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public Address street2(String street2) {
        this.street2 = street2;
        return this;
    }

    /**
     * Get street2
     * 
     * @return street2
     **/
    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public Address streetNo(String streetNo) {
        this.streetNo = streetNo;
        return this;
    }

    /**
     * Get streetNo
     * 
     * @return streetNo
     **/
    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address otherAddress = (Address) o;
        return Objects.equals(this.city, otherAddress.city) && Objects.equals(this.company, otherAddress.company) && Objects.equals(this.country, otherAddress.country) && Objects.equals(this.email, otherAddress.email) && Objects.equals(this.id, otherAddress.id)
                && Objects.equals(this.name, otherAddress.name) && Objects.equals(this.phone, otherAddress.phone) && Objects.equals(this.postalCode, otherAddress.postalCode) && Objects.equals(this.residential, otherAddress.residential) && Objects.equals(this.state, otherAddress.state)
                && Objects.equals(this.street1, otherAddress.street1) && Objects.equals(this.street2, otherAddress.street2) && Objects.equals(this.streetNo, otherAddress.streetNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, company, country, email, id, name, phone, postalCode, residential, state, street1, street2, streetNo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Apiv11shipmentShipmentAddressFrom {\n");

        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    residential: ").append(toIndentedString(residential)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
        sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
        sb.append("    streetNo: ").append(toIndentedString(streetNo)).append("\n");
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
