// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.HiveMetastoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HiveMetastore model. */
@Fluent
public final class HiveMetastore extends SubResource {
    /*
     * The  HiveMetastoreProperties rule properties.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private HiveMetastoreProperties innerProperties;

    /*
     * The resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /** Creates an instance of HiveMetastore class. */
    public HiveMetastore() {
    }

    /**
     * Get the innerProperties property: The HiveMetastoreProperties rule properties.
     *
     * @return the innerProperties value.
     */
    private HiveMetastoreProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public HiveMetastore withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the serverUri property: The serverUri for the Hive MetaStore.
     *
     * @return the serverUri value.
     */
    public String serverUri() {
        return this.innerProperties() == null ? null : this.innerProperties().serverUri();
    }

    /**
     * Get the databaseName property: The databaseName for the Hive MetaStore.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseName();
    }

    /**
     * Get the runtimeVersion property: The runtimeVersion for the Hive MetaStore.
     *
     * @return the runtimeVersion value.
     */
    public String runtimeVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().runtimeVersion();
    }

    /**
     * Get the username property: The userName for the Hive MetaStore.
     *
     * @return the username value.
     */
    public String username() {
        return this.innerProperties() == null ? null : this.innerProperties().username();
    }

    /**
     * Get the password property: The password for the Hive MetaStore.
     *
     * @return the password value.
     */
    public String password() {
        return this.innerProperties() == null ? null : this.innerProperties().password();
    }

    /**
     * Get the nestedResourceProvisioningState property: The current state of the NestedResource.
     *
     * @return the nestedResourceProvisioningState value.
     */
    public NestedResourceProvisioningState nestedResourceProvisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().nestedResourceProvisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
