// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Divides text using language-specific rules and reduces words to their base forms. */
@Fluent
public final class MicrosoftLanguageStemmingTokenizer extends LexicalTokenizer {
    /*
     * Identifies the concrete type of the tokenizer.
     */
    private static final String ODATA_TYPE = "#Microsoft.Azure.Search.MicrosoftLanguageStemmingTokenizer";

    /*
     * The maximum token length. Tokens longer than the maximum length are split. Maximum token length that can be used
     * is 300 characters. Tokens longer than 300 characters are first split into tokens of length 300 and then each of
     * those tokens is split based on the max token length set. Default is 255.
     */
    private Integer maxTokenLength;

    /*
     * A value indicating how the tokenizer is used. Set to true if used as the search tokenizer, set to false if used
     * as the indexing tokenizer. Default is false.
     */
    private Boolean isSearchTokenizerUsed;

    /*
     * The language to use. The default is English.
     */
    private MicrosoftStemmingTokenizerLanguage language;

    /**
     * Creates an instance of MicrosoftLanguageStemmingTokenizer class.
     *
     * @param name the name value to set.
     */
    public MicrosoftLanguageStemmingTokenizer(String name) {
        super(name);
    }

    /**
     * Get the maxTokenLength property: The maximum token length. Tokens longer than the maximum length are split.
     * Maximum token length that can be used is 300 characters. Tokens longer than 300 characters are first split into
     * tokens of length 300 and then each of those tokens is split based on the max token length set. Default is 255.
     *
     * @return the maxTokenLength value.
     */
    public Integer getMaxTokenLength() {
        return this.maxTokenLength;
    }

    /**
     * Set the maxTokenLength property: The maximum token length. Tokens longer than the maximum length are split.
     * Maximum token length that can be used is 300 characters. Tokens longer than 300 characters are first split into
     * tokens of length 300 and then each of those tokens is split based on the max token length set. Default is 255.
     *
     * @param maxTokenLength the maxTokenLength value to set.
     * @return the MicrosoftLanguageStemmingTokenizer object itself.
     */
    public MicrosoftLanguageStemmingTokenizer setMaxTokenLength(Integer maxTokenLength) {
        this.maxTokenLength = maxTokenLength;
        return this;
    }

    /**
     * Get the isSearchTokenizerUsed property: A value indicating how the tokenizer is used. Set to true if used as the
     * search tokenizer, set to false if used as the indexing tokenizer. Default is false.
     *
     * @return the isSearchTokenizerUsed value.
     */
    public Boolean isSearchTokenizer() {
        return this.isSearchTokenizerUsed;
    }

    /**
     * Set the isSearchTokenizerUsed property: A value indicating how the tokenizer is used. Set to true if used as the
     * search tokenizer, set to false if used as the indexing tokenizer. Default is false.
     *
     * @param isSearchTokenizerUsed the isSearchTokenizerUsed value to set.
     * @return the MicrosoftLanguageStemmingTokenizer object itself.
     */
    public MicrosoftLanguageStemmingTokenizer setIsSearchTokenizerUsed(Boolean isSearchTokenizerUsed) {
        this.isSearchTokenizerUsed = isSearchTokenizerUsed;
        return this;
    }

    /**
     * Get the language property: The language to use. The default is English.
     *
     * @return the language value.
     */
    public MicrosoftStemmingTokenizerLanguage getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: The language to use. The default is English.
     *
     * @param language the language value to set.
     * @return the MicrosoftLanguageStemmingTokenizer object itself.
     */
    public MicrosoftLanguageStemmingTokenizer setLanguage(MicrosoftStemmingTokenizerLanguage language) {
        this.language = language;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", ODATA_TYPE);
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeNumberField("maxTokenLength", this.maxTokenLength);
        jsonWriter.writeBooleanField("isSearchTokenizer", this.isSearchTokenizerUsed);
        jsonWriter.writeStringField("language", Objects.toString(this.language, null));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftLanguageStemmingTokenizer from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftLanguageStemmingTokenizer if the JsonReader was pointing to an instance of it, or
     *     null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the MicrosoftLanguageStemmingTokenizer.
     */
    public static MicrosoftLanguageStemmingTokenizer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    Integer maxTokenLength = null;
                    Boolean isSearchTokenizerUsed = null;
                    MicrosoftStemmingTokenizerLanguage language = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!ODATA_TYPE.equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '"
                                                + ODATA_TYPE
                                                + "'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                            nameFound = true;
                        } else if ("maxTokenLength".equals(fieldName)) {
                            maxTokenLength = reader.getNullable(JsonReader::getInt);
                        } else if ("isSearchTokenizer".equals(fieldName)) {
                            isSearchTokenizerUsed = reader.getNullable(JsonReader::getBoolean);
                        } else if ("language".equals(fieldName)) {
                            language = MicrosoftStemmingTokenizerLanguage.fromString(reader.getString());
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound) {
                        MicrosoftLanguageStemmingTokenizer deserializedValue =
                                new MicrosoftLanguageStemmingTokenizer(name);
                        deserializedValue.maxTokenLength = maxTokenLength;
                        deserializedValue.isSearchTokenizerUsed = isSearchTokenizerUsed;
                        deserializedValue.language = language;

                        return deserializedValue;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
