package com.coureon.client.api;

import java.io.IOException;

import org.apache.commons.codec.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;

import com.coureon.client.model.LabelTask;
import com.coureon.client.model.Response;
import com.coureon.client.model.ShipmentView;
import com.fasterxml.jackson.core.type.TypeReference;

public class ShipmentConnector {
    private static final TypeReference<Response<ShipmentView>> SHIPMENT_VIEW_TYPE_REFERENCE = new TypeReference<Response<ShipmentView>>() {
    };

    private static final TypeReference<Response<LabelTask>> LABEL_TASK_TYPE_REFERENCE = new TypeReference<Response<LabelTask>>() {
    };

    private String              apiKey;
    private JacksonService      jacksonService = new JacksonService();
    private CloseableHttpClient httpClient;

    public ShipmentConnector(String apiKey) {
        this.apiKey = apiKey;
        httpClient = HttpClientBuilder.create().build();
    }

    public Response<ShipmentView> createShipment(ShipmentView shipmentView) throws IOException {
        Response<ShipmentView> result;
        String jsonRequest = jacksonService.toJson(shipmentView);

        HttpPost post = new HttpPost("https://api-sandbox.coureon.com/api/v1_1/shipment");
        post.setHeader(new BasicHeader("api_key", apiKey));
        post.setEntity(new StringEntity(jsonRequest, Charsets.UTF_8));
        post.setHeader(new BasicHeader("Content-Type", "application/json"));

        try (CloseableHttpResponse response = httpClient.execute(post)) {
            HttpEntity httpEntity = response.getEntity();
            String jsonResponse = IOUtils.toString(httpEntity.getContent(), Charsets.UTF_8);

            result = jacksonService.fromJson(jsonResponse, SHIPMENT_VIEW_TYPE_REFERENCE);
        }
        return result;
    }

    public Response<LabelTask> createAndPrint(ShipmentView shipmentView) throws IOException {
        Response<LabelTask> result;
        String jsonRequest = jacksonService.toJson(shipmentView);

        HttpPost post = new HttpPost("https://api-sandbox.coureon.com/api/v1_1/shipment/create_and_print");
        post.setHeader(new BasicHeader("api_key", apiKey));
        post.setEntity(new StringEntity(jsonRequest, Charsets.UTF_8));
        post.setHeader(new BasicHeader("Content-Type", "application/json"));

        try (CloseableHttpResponse response = httpClient.execute(post)) {
            HttpEntity httpEntity = response.getEntity();
            String jsonResponse = IOUtils.toString(httpEntity.getContent(), Charsets.UTF_8);

            result = jacksonService.fromJson(jsonResponse, LABEL_TASK_TYPE_REFERENCE);
        }
        return result;
    }
}