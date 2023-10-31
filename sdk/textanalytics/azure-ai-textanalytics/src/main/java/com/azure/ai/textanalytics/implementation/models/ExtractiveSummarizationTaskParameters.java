// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.ai.textanalytics.models.ExtractiveSummarySentencesOrder;
import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;

/** Supported parameters for an Extractive Summarization task. */
@Fluent
public final class ExtractiveSummarizationTaskParameters extends PreBuiltTaskParameters {
    /*
     * The sentenceCount property.
     */
    private Integer sentenceCount;

    /*
     * The sorting criteria to use for the results of Extractive Summarization.
     */
    private ExtractiveSummarySentencesOrder sortBy;

    /*
     * Specifies the method used to interpret string offsets.  Defaults to Text Elements (Graphemes) according to
     * Unicode v8.0.0. For additional information see https://aka.ms/text-analytics-offsets.
     */
    private StringIndexType stringIndexType;

    /** Creates an instance of ExtractiveSummarizationTaskParameters class. */
    public ExtractiveSummarizationTaskParameters() {}

    /**
     * Get the sentenceCount property: The sentenceCount property.
     *
     * @return the sentenceCount value.
     */
    public Integer getSentenceCount() {
        return this.sentenceCount;
    }

    /**
     * Set the sentenceCount property: The sentenceCount property.
     *
     * @param sentenceCount the sentenceCount value to set.
     * @return the ExtractiveSummarizationTaskParameters object itself.
     */
    public ExtractiveSummarizationTaskParameters setSentenceCount(Integer sentenceCount) {
        this.sentenceCount = sentenceCount;
        return this;
    }

    /**
     * Get the sortBy property: The sorting criteria to use for the results of Extractive Summarization.
     *
     * @return the sortBy value.
     */
    public ExtractiveSummarySentencesOrder getSortBy() {
        return this.sortBy;
    }

    /**
     * Set the sortBy property: The sorting criteria to use for the results of Extractive Summarization.
     *
     * @param sortBy the sortBy value to set.
     * @return the ExtractiveSummarizationTaskParameters object itself.
     */
    public ExtractiveSummarizationTaskParameters setSortBy(ExtractiveSummarySentencesOrder sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * Get the stringIndexType property: Specifies the method used to interpret string offsets. Defaults to Text
     * Elements (Graphemes) according to Unicode v8.0.0. For additional information see
     * https://aka.ms/text-analytics-offsets.
     *
     * @return the stringIndexType value.
     */
    public StringIndexType getStringIndexType() {
        return this.stringIndexType;
    }

    /**
     * Set the stringIndexType property: Specifies the method used to interpret string offsets. Defaults to Text
     * Elements (Graphemes) according to Unicode v8.0.0. For additional information see
     * https://aka.ms/text-analytics-offsets.
     *
     * @param stringIndexType the stringIndexType value to set.
     * @return the ExtractiveSummarizationTaskParameters object itself.
     */
    public ExtractiveSummarizationTaskParameters setStringIndexType(StringIndexType stringIndexType) {
        this.stringIndexType = stringIndexType;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExtractiveSummarizationTaskParameters setModelVersion(String modelVersion) {
        super.setModelVersion(modelVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExtractiveSummarizationTaskParameters setLoggingOptOut(Boolean loggingOptOut) {
        super.setLoggingOptOut(loggingOptOut);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("loggingOptOut", isLoggingOptOut());
        jsonWriter.writeStringField("modelVersion", getModelVersion());
        jsonWriter.writeNumberField("sentenceCount", this.sentenceCount);
        jsonWriter.writeStringField("sortBy", Objects.toString(this.sortBy, null));
        jsonWriter.writeStringField("stringIndexType", Objects.toString(this.stringIndexType, null));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExtractiveSummarizationTaskParameters from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExtractiveSummarizationTaskParameters if the JsonReader was pointing to an instance of it,
     *     or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExtractiveSummarizationTaskParameters.
     */
    public static ExtractiveSummarizationTaskParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    ExtractiveSummarizationTaskParameters deserializedExtractiveSummarizationTaskParameters =
                            new ExtractiveSummarizationTaskParameters();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("loggingOptOut".equals(fieldName)) {
                            deserializedExtractiveSummarizationTaskParameters.setLoggingOptOut(
                                    reader.getNullable(JsonReader::getBoolean));
                        } else if ("modelVersion".equals(fieldName)) {
                            deserializedExtractiveSummarizationTaskParameters.setModelVersion(reader.getString());
                        } else if ("sentenceCount".equals(fieldName)) {
                            deserializedExtractiveSummarizationTaskParameters.sentenceCount =
                                    reader.getNullable(JsonReader::getInt);
                        } else if ("sortBy".equals(fieldName)) {
                            deserializedExtractiveSummarizationTaskParameters.sortBy =
                                    ExtractiveSummarySentencesOrder.fromString(reader.getString());
                        } else if ("stringIndexType".equals(fieldName)) {
                            deserializedExtractiveSummarizationTaskParameters.stringIndexType =
                                    StringIndexType.fromString(reader.getString());
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedExtractiveSummarizationTaskParameters;
                });
    }
}
