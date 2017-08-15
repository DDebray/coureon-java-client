package com.coureon.client.model;

public enum PrintFormat {
    A4_BY_2("a4_by_2"),

    A4_BY_2_NO_BORDER("a4_by_2_no_border"),

    A4_BY_4("a4_by_4"),

    A4_BY_4_NO_BORDER("a4_by_4_no_border"),

    A4_BY_8("a4_by_8"),

    A4_BY_10("a4_by_10"),

    A4_BY_12("a4_by_12"),

    A4_BY_24("a4_by_24"),

    A4_BY_32("a4_by_32"),

    A3("a3"),

    A4("a4"),

    A5("a5"),

    A5_NO_BORDER("a5_no_border"),

    A5_BY_2("a5_by_2"),

    A5_BY_2_NO_BORDER("a5_by_2_no_border"),

    A6("a6"),

    A6_BORDERLESS("a6_borderless"),

    B5("b5"),

    C5("c5"),

    C6("c6"),

    BROTHER_DK_11202("brother_dk_11202"),

    BROTHER_DK_22113("brother_dk_22113"),

    DHL_910_300_100("dhl_910_300_100"),

    DHL_910_300_200("dhl_910_300_200"),

    DHL_910_300_300("dhl_910_300_300"),

    DHL_910_300_400("dhl_910_300_400"),

    DHL_910_300_600("dhl_910_300_600"),

    DHL_ONLINE_LABEL("dhl_online_label"),

    COMMON_LABEL("common_label");

    private String value;

    PrintFormat(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PrintFormat fromValue(String text) {
        for (PrintFormat b : PrintFormat.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
