package com.coureon.client.model;

public enum Endpoint {
    DOOR("DOOR"),

    DOOR_RESIDENTIAL("DOOR_RESIDENTIAL"),

    DOOR_COMMERCIAL("DOOR_COMMERCIAL"),

    CARRIER_OFFICE("CARRIER_OFFICE"),

    DOOR_AND_OFFICE("DOOR_AND_OFFICE");

    private String value;

    Endpoint(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static Endpoint fromValue(String text) {
        for (Endpoint b : Endpoint.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
