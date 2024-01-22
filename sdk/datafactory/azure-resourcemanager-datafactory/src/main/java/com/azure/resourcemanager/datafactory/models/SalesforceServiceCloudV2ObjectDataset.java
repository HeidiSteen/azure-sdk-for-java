// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.fluent.models.SalesforceServiceCloudV2ObjectDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * The Salesforce Service Cloud V2 object dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SalesforceServiceCloudV2Object")
@Fluent
public final class SalesforceServiceCloudV2ObjectDataset extends Dataset {
    /*
     * Salesforce Service Cloud V2 object dataset properties.
     */
    @JsonProperty(value = "typeProperties")
    private SalesforceServiceCloudV2ObjectDatasetTypeProperties innerTypeProperties;

    /**
     * Creates an instance of SalesforceServiceCloudV2ObjectDataset class.
     */
    public SalesforceServiceCloudV2ObjectDataset() {
    }

    /**
     * Get the innerTypeProperties property: Salesforce Service Cloud V2 object dataset properties.
     * 
     * @return the innerTypeProperties value.
     */
    private SalesforceServiceCloudV2ObjectDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2ObjectDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the objectApiName property: The Salesforce Service Cloud V2 object API name. Type: string (or Expression
     * with resultType string).
     * 
     * @return the objectApiName value.
     */
    public Object objectApiName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().objectApiName();
    }

    /**
     * Set the objectApiName property: The Salesforce Service Cloud V2 object API name. Type: string (or Expression
     * with resultType string).
     * 
     * @param objectApiName the objectApiName value to set.
     * @return the SalesforceServiceCloudV2ObjectDataset object itself.
     */
    public SalesforceServiceCloudV2ObjectDataset withObjectApiName(Object objectApiName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SalesforceServiceCloudV2ObjectDatasetTypeProperties();
        }
        this.innerTypeProperties().withObjectApiName(objectApiName);
        return this;
    }

    /**
     * Get the reportId property: The Salesforce Service Cloud V2 reportId. Type: string (or Expression with resultType
     * string).
     * 
     * @return the reportId value.
     */
    public Object reportId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().reportId();
    }

    /**
     * Set the reportId property: The Salesforce Service Cloud V2 reportId. Type: string (or Expression with resultType
     * string).
     * 
     * @param reportId the reportId value to set.
     * @return the SalesforceServiceCloudV2ObjectDataset object itself.
     */
    public SalesforceServiceCloudV2ObjectDataset withReportId(Object reportId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SalesforceServiceCloudV2ObjectDatasetTypeProperties();
        }
        this.innerTypeProperties().withReportId(reportId);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() != null) {
            innerTypeProperties().validate();
        }
    }
}
