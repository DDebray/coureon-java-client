package com.coureon.client.model;

public enum MessageType {
    FATAL("FATAL"),

    ERROR("ERROR"),

    WARNING("WARNING"),

    INFO("INFO"),

    SUCCESS("SUCCESS");

    private String value;

    MessageType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MessageType fromValue(String text) {
        for (MessageType b : MessageType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}