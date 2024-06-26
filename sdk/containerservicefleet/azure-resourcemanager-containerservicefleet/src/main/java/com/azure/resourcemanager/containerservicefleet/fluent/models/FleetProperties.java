// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.containerservicefleet.models.FleetProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Fleet properties. */
@Immutable
public final class FleetProperties {
    /*
     * The status of the last operation.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private FleetProvisioningState provisioningState;

    /** Creates an instance of FleetProperties class. */
    public FleetProperties() {
    }

    /**
     * Get the provisioningState property: The status of the last operation.
     *
     * @return the provisioningState value.
     */
    public FleetProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
