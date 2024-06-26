// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.alertsmanagement.models.AlertProcessingRuleProperties;
import com.azure.resourcemanager.alertsmanagement.models.ManagedResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Alert processing rule object containing target scopes, conditions and scheduling logic. */
@Fluent
public final class AlertProcessingRuleInner extends ManagedResource {
    /*
     * Alert processing rule properties.
     */
    @JsonProperty(value = "properties")
    private AlertProcessingRuleProperties properties;

    /*
     * Alert processing rule system data.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the properties property: Alert processing rule properties.
     *
     * @return the properties value.
     */
    public AlertProcessingRuleProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Alert processing rule properties.
     *
     * @param properties the properties value to set.
     * @return the AlertProcessingRuleInner object itself.
     */
    public AlertProcessingRuleInner withProperties(AlertProcessingRuleProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Alert processing rule system data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public AlertProcessingRuleInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AlertProcessingRuleInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        if (properties() != null) {
            properties().validate();
        }
    }
}
