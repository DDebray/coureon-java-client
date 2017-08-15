package com.coureon.client.model;

import java.util.Objects;

/**
 * CustomsItemView
 */
public class CustomsItemView {
    private CustomsItem customsItem = null;

    public CustomsItemView customsItem(CustomsItem customsItem) {
        this.customsItem = customsItem;
        return this;
    }

    /**
     * Get customsItem
     * 
     * @return customsItem
     **/
    public CustomsItem getCustomsItem() {
        return customsItem;
    }

    public void setCustomsItem(CustomsItem customsItem) {
        this.customsItem = customsItem;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomsItemView customsItemView = (CustomsItemView) o;
        return Objects.equals(this.customsItem, customsItemView.customsItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customsItem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomsItemView {\n");

        sb.append("    customsItem: ").append(toIndentedString(customsItem)).append("\n");
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
