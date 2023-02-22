// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.search.documents.implementation.util.MappingUtils;
import java.io.IOException;
import java.util.Map;

/** Represents parameters for indexer execution. */
@Fluent
public final class IndexingParameters implements JsonSerializable<IndexingParameters> {

    /*
     * The number of items that are read from the data source and indexed as a single batch in order to improve
     * performance. The default depends on the data source type.
     */
    private Integer batchSize;

    /*
     * The maximum number of items that can fail indexing for indexer execution to still be considered successful. -1
     * means no limit. Default is 0.
     */
    private Integer maxFailedItems;

    /*
     * The maximum number of items in a single batch that can fail indexing for the batch to still be considered
     * successful. -1 means no limit. Default is 0.
     */
    private Integer maxFailedItemsPerBatch;

    /*
     * A dictionary of indexer-specific configuration properties. Each name is the name of a specific property. Each
     * value must be of a primitive type.
     */
    private IndexingParametersConfiguration configuration;

    /** Creates an instance of IndexingParameters class. */
    public IndexingParameters() {}

    /**
     * Get the batchSize property: The number of items that are read from the data source and indexed as a single batch
     * in order to improve performance. The default depends on the data source type.
     *
     * @return the batchSize value.
     */
    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * Set the batchSize property: The number of items that are read from the data source and indexed as a single batch
     * in order to improve performance. The default depends on the data source type.
     *
     * @param batchSize the batchSize value to set.
     * @return the IndexingParameters object itself.
     */
    public IndexingParameters setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * Get the maxFailedItems property: The maximum number of items that can fail indexing for indexer execution to
     * still be considered successful. -1 means no limit. Default is 0.
     *
     * @return the maxFailedItems value.
     */
    public Integer getMaxFailedItems() {
        return this.maxFailedItems;
    }

    /**
     * Set the maxFailedItems property: The maximum number of items that can fail indexing for indexer execution to
     * still be considered successful. -1 means no limit. Default is 0.
     *
     * @param maxFailedItems the maxFailedItems value to set.
     * @return the IndexingParameters object itself.
     */
    public IndexingParameters setMaxFailedItems(Integer maxFailedItems) {
        this.maxFailedItems = maxFailedItems;
        return this;
    }

    /**
     * Get the maxFailedItemsPerBatch property: The maximum number of items in a single batch that can fail indexing for
     * the batch to still be considered successful. -1 means no limit. Default is 0.
     *
     * @return the maxFailedItemsPerBatch value.
     */
    public Integer getMaxFailedItemsPerBatch() {
        return this.maxFailedItemsPerBatch;
    }

    /**
     * Set the maxFailedItemsPerBatch property: The maximum number of items in a single batch that can fail indexing for
     * the batch to still be considered successful. -1 means no limit. Default is 0.
     *
     * @param maxFailedItemsPerBatch the maxFailedItemsPerBatch value to set.
     * @return the IndexingParameters object itself.
     */
    public IndexingParameters setMaxFailedItemsPerBatch(Integer maxFailedItemsPerBatch) {
        this.maxFailedItemsPerBatch = maxFailedItemsPerBatch;
        return this;
    }

    /**
     * Get the configuration property: A dictionary of indexer-specific configuration properties. Each name is the name
     * of a specific property. Each value must be of a primitive type.
     *
     * @return the configuration value.
     */
    public IndexingParametersConfiguration getIndexingParametersConfiguration() {
        return this.configuration;
    }

    /**
     * Set the configuration property: A dictionary of indexer-specific configuration properties. Each name is the name
     * of a specific property. Each value must be of a primitive type.
     *
     * @param configuration the configuration value to set.
     * @return the IndexingParameters object itself.
     */
    public IndexingParameters setIndexingParametersConfiguration(IndexingParametersConfiguration configuration) {
        this.configuration = configuration;
        this.configurationMap = MappingUtils.indexingParametersConfigurationToMap(configuration);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("batchSize", this.batchSize);
        jsonWriter.writeNumberField("maxFailedItems", this.maxFailedItems);
        jsonWriter.writeNumberField("maxFailedItemsPerBatch", this.maxFailedItemsPerBatch);
        jsonWriter.writeJsonField("configuration", this.configuration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IndexingParameters from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of IndexingParameters if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IOException If an error occurs while reading the IndexingParameters.
     */
    public static IndexingParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    Integer batchSize = null;
                    Integer maxFailedItems = null;
                    Integer maxFailedItemsPerBatch = null;
                    IndexingParametersConfiguration configuration = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();
                        if ("batchSize".equals(fieldName)) {
                            batchSize = reader.getNullable(JsonReader::getInt);
                        } else if ("maxFailedItems".equals(fieldName)) {
                            maxFailedItems = reader.getNullable(JsonReader::getInt);
                        } else if ("maxFailedItemsPerBatch".equals(fieldName)) {
                            maxFailedItemsPerBatch = reader.getNullable(JsonReader::getInt);
                        } else if ("configuration".equals(fieldName)) {
                            configuration = IndexingParametersConfiguration.fromJson(reader);
                        } else {
                            reader.skipChildren();
                        }
                    }
                    IndexingParameters deserializedValue = new IndexingParameters();
                    deserializedValue.batchSize = batchSize;
                    deserializedValue.maxFailedItems = maxFailedItems;
                    deserializedValue.maxFailedItemsPerBatch = maxFailedItemsPerBatch;
                    deserializedValue.setIndexingParametersConfiguration(configuration);
                    return deserializedValue;
                });
    }

    /**
     * Get the configuration property: A dictionary of indexer-specific configuration properties. Each name is the name
     * of a specific property. Each value must be of a primitive type.
     *
     * @return the configuration value.
     */
    public Map<String, Object> getConfiguration() {
        return this.configurationMap;
    }

    /**
     * @param configuration the configuration value to set.
     * @return the IndexingParameters object itself.
     */
    public IndexingParameters setConfiguration(Map<String, Object> configuration) {
        this.configurationMap = configuration;
        this.configuration = MappingUtils.mapToIndexingParametersConfiguration(configuration);
        return this;
    }

    private Map<String, Object> configurationMap;
}
