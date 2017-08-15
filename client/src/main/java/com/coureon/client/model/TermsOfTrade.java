package com.coureon.client.model;

public enum TermsOfTrade {
    DDP("DDP"), DDU("DDU");

    private String value;

    TermsOfTrade(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TermsOfTrade fromValue(String text) {
        for (TermsOfTrade b : TermsOfTrade.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
