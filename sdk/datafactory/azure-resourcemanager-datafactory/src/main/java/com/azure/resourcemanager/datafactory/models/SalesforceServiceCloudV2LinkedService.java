// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.SalesforceServiceCloudV2LinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Linked service for Salesforce Service Cloud V2.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SalesforceServiceCloudV2")
@Fluent
public final class SalesforceServiceCloudV2LinkedService extends LinkedService {
    /*
     * Salesforce Service Cloud V2 linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private SalesforceServiceCloudV2LinkedServiceTypeProperties innerTypeProperties
        = new SalesforceServiceCloudV2LinkedServiceTypeProperties();

    /**
     * Creates an instance of SalesforceServiceCloudV2LinkedService class.
     */
    public SalesforceServiceCloudV2LinkedService() {
    }

    /**
     * Get the innerTypeProperties property: Salesforce Service Cloud V2 linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    private SalesforceServiceCloudV2LinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2LinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2LinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2LinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceServiceCloudV2LinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the environmentUrl property: The URL of Salesforce Service Cloud instance. For example,
     * 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     * 
     * @return the environmentUrl value.
     */
    public Object environmentUrl() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().environmentUrl();
    }

    /**
     * Set the environmentUrl property: The URL of Salesforce Service Cloud instance. For example,
     * 'https://[domain].my.salesforce.com'. Type: string (or Expression with resultType string).
     * 
     * @param environmentUrl the environmentUrl value to set.
     * @return the SalesforceServiceCloudV2LinkedService object itself.
     */
    public SalesforceServiceCloudV2LinkedService withEnvironmentUrl(Object environmentUrl) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SalesforceServiceCloudV2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEnvironmentUrl(environmentUrl);
        return this;
    }

    /**
     * Get the clientId property: The client Id for OAuth 2.0 Client Credentials Flow authentication of the Salesforce
     * instance. Type: string (or Expression with resultType string).
     * 
     * @return the clientId value.
     */
    public Object clientId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().clientId();
    }

    /**
     * Set the clientId property: The client Id for OAuth 2.0 Client Credentials Flow authentication of the Salesforce
     * instance. Type: string (or Expression with resultType string).
     * 
     * @param clientId the clientId value to set.
     * @return the SalesforceServiceCloudV2LinkedService object itself.
     */
    public SalesforceServiceCloudV2LinkedService withClientId(Object clientId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SalesforceServiceCloudV2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withClientId(clientId);
        return this;
    }

    /**
     * Get the clientSecret property: The client secret for OAuth 2.0 Client Credentials Flow authentication of the
     * Salesforce instance.
     * 
     * @return the clientSecret value.
     */
    public SecretBase clientSecret() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().clientSecret();
    }

    /**
     * Set the clientSecret property: The client secret for OAuth 2.0 Client Credentials Flow authentication of the
     * Salesforce instance.
     * 
     * @param clientSecret the clientSecret value to set.
     * @return the SalesforceServiceCloudV2LinkedService object itself.
     */
    public SalesforceServiceCloudV2LinkedService withClientSecret(SecretBase clientSecret) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SalesforceServiceCloudV2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withClientSecret(clientSecret);
        return this;
    }

    /**
     * Get the apiVersion property: The Salesforce API version used in ADF. The version must be larger than or equal to
     * 47.0 which is required by Salesforce BULK API 2.0. Type: string (or Expression with resultType string).
     * 
     * @return the apiVersion value.
     */
    public Object apiVersion() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().apiVersion();
    }

    /**
     * Set the apiVersion property: The Salesforce API version used in ADF. The version must be larger than or equal to
     * 47.0 which is required by Salesforce BULK API 2.0. Type: string (or Expression with resultType string).
     * 
     * @param apiVersion the apiVersion value to set.
     * @return the SalesforceServiceCloudV2LinkedService object itself.
     */
    public SalesforceServiceCloudV2LinkedService withApiVersion(Object apiVersion) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SalesforceServiceCloudV2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withApiVersion(apiVersion);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SalesforceServiceCloudV2LinkedService object itself.
     */
    public SalesforceServiceCloudV2LinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SalesforceServiceCloudV2LinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
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
        if (innerTypeProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerTypeProperties in model SalesforceServiceCloudV2LinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SalesforceServiceCloudV2LinkedService.class);
}
