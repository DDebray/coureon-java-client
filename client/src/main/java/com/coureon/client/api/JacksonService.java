package com.coureon.client.api;

import java.io.IOException;
import java.lang.reflect.Type;

import javax.swing.tree.TreeNode;

import org.apache.commons.lang.StringUtils;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaModule;

public class JacksonService {
    private ObjectMapper objectMapper;
    private JsonFactory  jsonFactory;

    public JacksonService() {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JodaModule());

        objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE);
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        objectMapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        objectMapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);

        jsonFactory = new MappingJsonFactory(objectMapper);
    }

    /**
     * Retrieves the pre-configured ObjectMapper
     */
    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    /**
     * Retrieves the pre-configured JsonFactory
     */
    public JsonFactory getJsonFactory() {
        return jsonFactory;
    }

    /**
     * Formats an object as json
     * 
     * @throws JsonProcessingException
     */
    public String toJson(Object object) throws JsonProcessingException {
        return objectMapper.writeValueAsString(object);
    }

    /**
     * Parses a json object
     * 
     * @throws IOException
     * @throws JsonParseException
     */
    public <T> T fromJson(String json, TypeReference<T> type) throws IOException {

        if (StringUtils.isEmpty(json)) {
            return null;
        }
        return jsonFactory.createParser(json).readValueAs(type);
    }

    /**
     * Parses a json object
     * 
     * @throws IOException
     * @throws JsonParseException
     */
    public <T> T fromJson(String json, final Type type) throws IOException {
        TypeReference<T> typeRef = new TypeReference<T>() {
            @Override
            public Type getType() {
                return type;
            }
        };

        return jsonFactory.createParser(json).readValueAs(typeRef);
    }

    /**
     * Parses a json object
     * 
     * @throws IOException
     * @throws JsonParseException
     */
    public <T extends TreeNode> T parse(String json) throws IOException {
        return jsonFactory.createParser(json).readValueAsTree();
    }

    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

}
