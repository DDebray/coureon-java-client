package com.coureon.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LabelTask {
    private Integer    taskId      = null;
    private List<Long> shipmentIds = null;

    public LabelTask taskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get taskId
     * 
     * @return taskId
     **/
    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public LabelTask shipmentIds(List<Long> shipmentIds) {
        this.shipmentIds = shipmentIds;
        return this;
    }

    public LabelTask addShipmentIdsItem(Long shipmentIdsItem) {
        if (this.shipmentIds == null) {
            this.shipmentIds = new ArrayList<Long>();
        }
        this.shipmentIds.add(shipmentIdsItem);
        return this;
    }

    /**
     * Get shipmentIds
     * 
     * @return shipmentIds
     **/
    public List<Long> getShipmentIds() {
        return shipmentIds;
    }

    public void setShipmentIds(List<Long> shipmentIds) {
        this.shipmentIds = shipmentIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LabelTask inlineResponse200Content = (LabelTask) o;
        return Objects.equals(this.taskId, inlineResponse200Content.taskId) && Objects.equals(this.shipmentIds, inlineResponse200Content.shipmentIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, shipmentIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse200Content {\n");

        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    shipmentIds: ").append(toIndentedString(shipmentIds)).append("\n");
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
