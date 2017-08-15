package com.coureon.client.model;

import java.util.Objects;

public class Progress {
    private Boolean running  = null;
    private Integer total    = null;
    private Integer complete = null;
    private Integer success  = null;
    private Integer error    = null;

    public Progress running(Boolean running) {
        this.running = running;
        return this;
    }

    /**
     * Get running
     * 
     * @return running
     **/
    public Boolean getRunning() {
        return running;
    }

    public void setRunning(Boolean running) {
        this.running = running;
    }

    public Progress total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     * 
     * @return total
     **/
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Progress complete(Integer complete) {
        this.complete = complete;
        return this;
    }

    /**
     * Get complete
     * 
     * @return complete
     **/
    public Integer getComplete() {
        return complete;
    }

    public void setComplete(Integer complete) {
        this.complete = complete;
    }

    public Progress success(Integer success) {
        this.success = success;
        return this;
    }

    /**
     * Get success
     * 
     * @return success
     **/
    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public Progress error(Integer error) {
        this.error = error;
        return this;
    }

    /**
     * Get error
     * 
     * @return error
     **/
    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Progress inlineResponse2001ContentProgress = (Progress) o;
        return Objects.equals(this.running, inlineResponse2001ContentProgress.running) && Objects.equals(this.total, inlineResponse2001ContentProgress.total) && Objects.equals(this.complete, inlineResponse2001ContentProgress.complete)
                && Objects.equals(this.success, inlineResponse2001ContentProgress.success) && Objects.equals(this.error, inlineResponse2001ContentProgress.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(running, total, complete, success, error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse2001ContentProgress {\n");

        sb.append("    running: ").append(toIndentedString(running)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
