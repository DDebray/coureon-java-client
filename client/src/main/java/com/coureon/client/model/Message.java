package com.coureon.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * InlineResponse200Messages
 */
public class Message {
    private String       key    = null;
    private String       text   = null;
    private List<String> params = null;
    private MessageType  type   = null;

    public Message key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get key
     * 
     * @return key
     **/
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Message text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get text
     * 
     * @return text
     **/
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Message params(List<String> params) {
        this.params = params;
        return this;
    }

    public Message addParamsItem(String paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<String>();
        }
        this.params.add(paramsItem);
        return this;
    }

    /**
     * Get params
     * 
     * @return params
     **/
    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }

    public Message type(MessageType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * 
     * @return type
     **/
    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Message otherMessage = (Message) o;
        return Objects.equals(this.key, otherMessage.key) && Objects.equals(this.text, otherMessage.text) && Objects.equals(this.params, otherMessage.params) && Objects.equals(this.type, otherMessage.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, text, params, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse200Messages {\n");

        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
