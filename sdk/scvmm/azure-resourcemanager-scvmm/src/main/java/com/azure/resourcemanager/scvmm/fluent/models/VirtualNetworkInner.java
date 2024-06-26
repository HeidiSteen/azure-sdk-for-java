// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.scvmm.models.ExtendedLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The VirtualNetworks resource definition. */
@Fluent
public final class VirtualNetworkInner extends Resource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private VirtualNetworkProperties innerProperties = new VirtualNetworkProperties();

    /*
     * The system data.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The extended location.
     */
    @JsonProperty(value = "extendedLocation", required = true)
    private ExtendedLocation extendedLocation;

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private VirtualNetworkProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the extendedLocation property: The extended location.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualNetworkInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualNetworkInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the inventoryItemId property: Gets or sets the inventory Item ID for the resource.
     *
     * @return the inventoryItemId value.
     */
    public String inventoryItemId() {
        return this.innerProperties() == null ? null : this.innerProperties().inventoryItemId();
    }

    /**
     * Set the inventoryItemId property: Gets or sets the inventory Item ID for the resource.
     *
     * @param inventoryItemId the inventoryItemId value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withInventoryItemId(String inventoryItemId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkProperties();
        }
        this.innerProperties().withInventoryItemId(inventoryItemId);
        return this;
    }

    /**
     * Get the uuid property: Unique ID of the virtual network.
     *
     * @return the uuid value.
     */
    public String uuid() {
        return this.innerProperties() == null ? null : this.innerProperties().uuid();
    }

    /**
     * Set the uuid property: Unique ID of the virtual network.
     *
     * @param uuid the uuid value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withUuid(String uuid) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkProperties();
        }
        this.innerProperties().withUuid(uuid);
        return this;
    }

    /**
     * Get the vmmServerId property: ARM Id of the vmmServer resource in which this resource resides.
     *
     * @return the vmmServerId value.
     */
    public String vmmServerId() {
        return this.innerProperties() == null ? null : this.innerProperties().vmmServerId();
    }

    /**
     * Set the vmmServerId property: ARM Id of the vmmServer resource in which this resource resides.
     *
     * @param vmmServerId the vmmServerId value to set.
     * @return the VirtualNetworkInner object itself.
     */
    public VirtualNetworkInner withVmmServerId(String vmmServerId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkProperties();
        }
        this.innerProperties().withVmmServerId(vmmServerId);
        return this;
    }

    /**
     * Get the networkName property: Name of the virtual network in vmmServer.
     *
     * @return the networkName value.
     */
    public String networkName() {
        return this.innerProperties() == null ? null : this.innerProperties().networkName();
    }

    /**
     * Get the provisioningState property: Gets or sets the provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model VirtualNetworkInner"));
        } else {
            innerProperties().validate();
        }
        if (extendedLocation() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property extendedLocation in model VirtualNetworkInner"));
        } else {
            extendedLocation().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualNetworkInner.class);
}
