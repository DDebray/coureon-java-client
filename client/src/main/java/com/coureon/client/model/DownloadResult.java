package com.coureon.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DownloadResult {
    private List<DownloadUrls> downloadUrls = null;
    private Object             errors       = null;

    public DownloadResult downloadUrls(List<DownloadUrls> downloadUrls) {
        this.downloadUrls = downloadUrls;
        return this;
    }

    public DownloadResult addDownloadUrlsItem(DownloadUrls downloadUrlsItem) {
        if (this.downloadUrls == null) {
            this.downloadUrls = new ArrayList<>();
        }
        this.downloadUrls.add(downloadUrlsItem);
        return this;
    }

    /**
     * Get downloadUrls
     * 
     * @return downloadUrls
     **/
    public List<DownloadUrls> getDownloadUrls() {
        return downloadUrls;
    }

    public void setDownloadUrls(List<DownloadUrls> downloadUrls) {
        this.downloadUrls = downloadUrls;
    }

    public DownloadResult errors(List<Object> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get errors
     * 
     * @return errors
     **/
    public Object getErrors() {
        return errors;
    }

    public void setErrors(Object errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownloadResult inlineResponse2001ContentDownloadResult = (DownloadResult) o;
        return Objects.equals(this.downloadUrls, inlineResponse2001ContentDownloadResult.downloadUrls) && Objects.equals(this.errors, inlineResponse2001ContentDownloadResult.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(downloadUrls, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse2001ContentDownloadResult {\n");

        sb.append("    downloadUrls: ").append(toIndentedString(downloadUrls)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
