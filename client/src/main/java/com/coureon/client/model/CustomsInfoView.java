package com.coureon.client.model;

import java.util.Objects;

/**
 * CustomsInfoView
 */
public class CustomsInfoView {
    private CustomsInfo customsInfo = null;

    public CustomsInfoView customsInfo(CustomsInfo customsInfo) {
        this.customsInfo = customsInfo;
        return this;
    }

    /**
     * Get customsInfo
     * 
     * @return customsInfo
     **/
    public CustomsInfo getCustomsInfo() {
        return customsInfo;
    }

    public void setCustomsInfo(CustomsInfo customsInfo) {
        this.customsInfo = customsInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomsInfoView customsInfoView = (CustomsInfoView) o;
        return Objects.equals(this.customsInfo, customsInfoView.customsInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customsInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomsInfoView {\n");

        sb.append("    customsInfo: ").append(toIndentedString(customsInfo)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
