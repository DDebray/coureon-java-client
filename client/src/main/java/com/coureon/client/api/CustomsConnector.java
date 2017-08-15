package com.coureon.client.api;

import java.io.IOException;

import org.apache.commons.codec.Charsets;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;

import com.coureon.client.model.LabelTaskResponse;
import com.coureon.client.model.Response;
import com.fasterxml.jackson.core.type.TypeReference;

public class CustomsConnector {
    private static final TypeReference<Response<LabelTaskResponse>> LABEL_TASK_RESPONSE_TYPE_REFERENCE = new TypeReference<Response<LabelTaskResponse>>() {
                                                                                                       };
    private String                                                  apiKey;
    private JacksonService                                          jacksonService                     = new JacksonService();
    private CloseableHttpClient                                     httpClient;

    public CustomsConnector(String apiKey) {
        this.apiKey = apiKey;
        httpClient = HttpClientBuilder.create().build();
    }

    public Response<LabelTaskResponse> getLabelTask(int taskId) throws IOException {
        Response<LabelTaskResponse> result;

        HttpGet get = new HttpGet("https://api-sandbox.coureon.com/api/v1_1/labels/task/" + taskId);
        get.setHeader(new BasicHeader("api_key", apiKey));

        try (CloseableHttpResponse response = httpClient.execute(get)) {
            HttpEntity httpEntity = response.getEntity();
            String jsonResponse = IOUtils.toString(httpEntity.getContent(), Charsets.UTF_8);

            result = jacksonService.fromJson(jsonResponse, LABEL_TASK_RESPONSE_TYPE_REFERENCE);
        }

        return result;
    }
}
