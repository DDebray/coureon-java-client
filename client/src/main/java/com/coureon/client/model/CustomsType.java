package com.coureon.client.model;

public enum CustomsType {
    OTHER("OTHER"),

    GIFT("GIFT"),

    SAMPLE("SAMPLE"),

    DOCUMENTS("DOCUMENTS"),

    GOODS_RETURN("GOODS_RETURN");

    private String value;

    CustomsType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CustomsType fromValue(String text) {
        for (CustomsType b : CustomsType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
