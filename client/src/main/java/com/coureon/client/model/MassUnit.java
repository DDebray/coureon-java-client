package com.coureon.client.model;

public enum MassUnit {
    G("g"),

    KG("kg"),

    OZ("oz"),

    LB("lb");

    private String value;

    MassUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MassUnit fromValue(String text) {
        for (MassUnit b : MassUnit.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}