package com.coureon.client.model;

public enum Currency {
    EUR("EUR"),

    USD("USD"),

    GBP("GBP"),

    CHF("CHF"),

    PLN("PLN"),

    SEK("SEK"),

    TRY("TRY"),

    DKK("DKK"),

    NOK("NOK"),

    BRL("BRL"),

    ARS("ARS"),

    MXN("MXN"),

    COP("COP"),

    PEN("PEN"),

    UYU("UYU"),

    CAD("CAD"),

    RON("RON"),

    AUD("AUD"),

    SGD("SGD"),

    AED("AED"),

    ZAR("ZAR"),

    HKD("HKD"),

    ILS("ILS"),

    PHP("PHP"),

    CNY("CNY"),

    NZD("NZD"),

    MYR("MYR"),

    MAD("MAD"),

    INR("INR");

    private String value;

    Currency(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static Currency fromValue(String text) {
        for (Currency b : Currency.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}