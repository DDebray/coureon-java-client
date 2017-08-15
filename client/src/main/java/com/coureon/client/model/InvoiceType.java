package com.coureon.client.model;

public enum InvoiceType {
    COMMERCIAL("COMMERCIAL"),

    PROFORMA("PROFORMA");

    private String value;

    InvoiceType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static InvoiceType fromValue(String text) {
        for (InvoiceType b : InvoiceType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
