package com.coureon.client.model;

import java.util.Objects;

/**
 * InlineResponse2001Content
 */
public class LabelTaskResponse {
    private Progress       progress       = null;
    private DownloadResult downloadResult = null;

    public LabelTaskResponse progress(Progress progress) {
        this.progress = progress;
        return this;
    }

    /**
     * Get progress
     * 
     * @return progress
     **/
    public Progress getProgress() {
        return progress;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    public LabelTaskResponse downloadResult(DownloadResult downloadResult) {
        this.downloadResult = downloadResult;
        return this;
    }

    /**
     * Get downloadResult
     * 
     * @return downloadResult
     **/
    public DownloadResult getDownloadResult() {
        return downloadResult;
    }

    public void setDownloadResult(DownloadResult downloadResult) {
        this.downloadResult = downloadResult;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LabelTaskResponse inlineResponse2001Content = (LabelTaskResponse) o;
        return Objects.equals(this.progress, inlineResponse2001Content.progress) && Objects.equals(this.downloadResult, inlineResponse2001Content.downloadResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(progress, downloadResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse2001Content {\n");

        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    downloadResult: ").append(toIndentedString(downloadResult)).append("\n");
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
