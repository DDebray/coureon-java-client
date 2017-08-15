package com.coureon.client.model;

import java.util.Objects;

public class DownloadUrls {
    private String  format = null;
    private Integer count  = null;
    private String  url    = null;

    public DownloadUrls format(String format) {
        this.format = format;
        return this;
    }

    /**
     * Get format
     * 
     * @return format
     **/
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public DownloadUrls count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get count
     * 
     * @return count
     **/
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public DownloadUrls url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * 
     * @return url
     **/
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownloadUrls inlineResponse2001ContentDownloadResultDownloadUrls = (DownloadUrls) o;
        return Objects.equals(this.format, inlineResponse2001ContentDownloadResultDownloadUrls.format) && Objects.equals(this.count, inlineResponse2001ContentDownloadResultDownloadUrls.count) && Objects.equals(this.url, inlineResponse2001ContentDownloadResultDownloadUrls.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(format, count, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse2001ContentDownloadResultDownloadUrls {\n");

        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
