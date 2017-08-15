package com.coureon.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Response<T> {
    private ResponseStatus status   = null;
    private List<Message>  messages = null;
    private T              content  = null;

    public Response<T> status(ResponseStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * 
     * @return status
     **/
    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public Response<T> messages(List<Message> messages) {
        this.messages = messages;
        return this;
    }

    public Response<T> addMessagesItem(Message messagesItem) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(messagesItem);
        return this;
    }

    /**
     * Get messages
     * 
     * @return messages
     **/
    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Response<T> content(T content) {
        this.content = content;
        return this;
    }

    /**
     * Get content
     * 
     * @return content
     **/
    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Response<T> inlineResponse200 = (Response<T>) o;
        return Objects.equals(this.status, inlineResponse200.status) && Objects.equals(this.messages, inlineResponse200.messages) && Objects.equals(this.content, inlineResponse200.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, messages, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse200 {\n");

        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
