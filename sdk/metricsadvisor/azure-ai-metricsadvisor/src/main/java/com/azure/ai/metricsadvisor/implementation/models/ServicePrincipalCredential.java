// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.UUID;

/**
 * The ServicePrincipalCredential model.
 */
@Fluent
public final class ServicePrincipalCredential extends DataSourceCredential {
    /*
     * The parameters property.
     */
    private ServicePrincipalParam parameters;

    /**
     * Creates an instance of ServicePrincipalCredential class.
     */
    public ServicePrincipalCredential() {
    }

    /**
     * Get the parameters property: The parameters property.
     * 
     * @return the parameters value.
     */
    public ServicePrincipalParam getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters property.
     * 
     * @param parameters the parameters value to set.
     * @return the ServicePrincipalCredential object itself.
     */
    public ServicePrincipalCredential setParameters(ServicePrincipalParam parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicePrincipalCredential setDataSourceCredentialName(String dataSourceCredentialName) {
        super.setDataSourceCredentialName(dataSourceCredentialName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServicePrincipalCredential setDataSourceCredentialDescription(String dataSourceCredentialDescription) {
        super.setDataSourceCredentialDescription(dataSourceCredentialDescription);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dataSourceCredentialType", DataSourceCredentialType.SERVICE_PRINCIPAL == null
            ? null : DataSourceCredentialType.SERVICE_PRINCIPAL.toString());
        jsonWriter.writeStringField("dataSourceCredentialName", getDataSourceCredentialName());
        jsonWriter.writeStringField("dataSourceCredentialDescription", getDataSourceCredentialDescription());
        jsonWriter.writeJsonField("parameters", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServicePrincipalCredential from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServicePrincipalCredential if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the ServicePrincipalCredential.
     */
    public static ServicePrincipalCredential fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServicePrincipalCredential deserializedServicePrincipalCredential = new ServicePrincipalCredential();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dataSourceCredentialType".equals(fieldName)) {
                    String dataSourceCredentialType = reader.getString();
                    if (!"ServicePrincipal".equals(dataSourceCredentialType)) {
                        throw new IllegalStateException(
                            "'dataSourceCredentialType' was expected to be non-null and equal to 'ServicePrincipal'. The found 'dataSourceCredentialType' was '"
                                + dataSourceCredentialType + "'.");
                    }
                } else if ("dataSourceCredentialName".equals(fieldName)) {
                    deserializedServicePrincipalCredential.setDataSourceCredentialName(reader.getString());
                } else if ("dataSourceCredentialId".equals(fieldName)) {
                    deserializedServicePrincipalCredential.setDataSourceCredentialId(
                        reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString())));
                } else if ("dataSourceCredentialDescription".equals(fieldName)) {
                    deserializedServicePrincipalCredential.setDataSourceCredentialDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    deserializedServicePrincipalCredential.parameters = ServicePrincipalParam.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServicePrincipalCredential;
        });
    }
}
