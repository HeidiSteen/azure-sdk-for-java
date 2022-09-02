// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The NginxNetworkInterfaceConfiguration model. */
@Fluent
public final class NginxNetworkInterfaceConfiguration {
    /*
     * The subnetId property.
     */
    @JsonProperty(value = "subnetId")
    private String subnetId;

    /**
     * Get the subnetId property: The subnetId property.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: The subnetId property.
     *
     * @param subnetId the subnetId value to set.
     * @return the NginxNetworkInterfaceConfiguration object itself.
     */
    public NginxNetworkInterfaceConfiguration withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}