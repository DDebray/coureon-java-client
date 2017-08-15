package com.coureon.client.model;

public enum DistanceUnit {
    CM("cm"),

    MM("mm"),

    DM("dm"),

    M("m"),

    IN("in"),

    FT("ft"),

    YD("yd");

    private String value;

    DistanceUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DistanceUnit fromValue(String text) {
        for (DistanceUnit b : DistanceUnit.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
