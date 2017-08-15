package com.coureon.client.model;

public enum ResponseStatus {
    OK("OK"),

    WARNING("WARNING"),

    ERROR("ERROR"),

    FATAL("FATAL");

    private String value;

    ResponseStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ResponseStatus fromValue(String text) {
        for (ResponseStatus b : ResponseStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
