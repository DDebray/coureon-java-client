package com.coureon.client.model;

public enum ShipmentStatus {
    DELETED("DELETED"),

    NEW("NEW"),

    LABEL_REQUESTED("LABEL_REQUESTED"),

    LABEL_CREATED("LABEL_CREATED"),

    IN_TRANSIT("IN_TRANSIT"),

    DUTY_UNPAID("DUTY_UNPAID"),

    DUTY_PAID("DUTY_PAID"),

    LABEL_ERROR("LABEL_ERROR"),

    DELIVERY_FAILED("DELIVERY_FAILED"),

    RECEIVER_MOVED("RECEIVER_MOVED"),

    DELIVERED("DELIVERED"),

    MANUAL("MANUAL"),

    CANCELLED("CANCELLED"),

    NO_HANDOVER("NO_HANDOVER");

    private String value;

    ShipmentStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ShipmentStatus fromValue(String text) {
        for (ShipmentStatus b : ShipmentStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}