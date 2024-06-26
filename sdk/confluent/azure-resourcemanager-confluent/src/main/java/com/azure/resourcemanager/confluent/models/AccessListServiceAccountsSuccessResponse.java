// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.resourcemanager.confluent.fluent.models.AccessListServiceAccountsSuccessResponseInner;
import java.util.List;

/**
 * An immutable client-side representation of AccessListServiceAccountsSuccessResponse.
 */
public interface AccessListServiceAccountsSuccessResponse {
    /**
     * Gets the kind property: Type of response.
     * 
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the metadata property: Metadata of the list.
     * 
     * @return the metadata value.
     */
    ConfluentListMetadata metadata();

    /**
     * Gets the data property: Data of the service accounts list.
     * 
     * @return the data value.
     */
    List<ServiceAccountRecord> data();

    /**
     * Gets the inner com.azure.resourcemanager.confluent.fluent.models.AccessListServiceAccountsSuccessResponseInner
     * object.
     * 
     * @return the inner object.
     */
    AccessListServiceAccountsSuccessResponseInner innerModel();
}
