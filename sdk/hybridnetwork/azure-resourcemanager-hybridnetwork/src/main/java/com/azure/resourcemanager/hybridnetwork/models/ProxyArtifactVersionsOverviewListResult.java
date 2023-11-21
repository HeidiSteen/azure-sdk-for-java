// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridnetwork.fluent.models.ProxyArtifactVersionsListOverviewInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The proxy artifact list result.
 */
@Fluent
public final class ProxyArtifactVersionsOverviewListResult {
    /*
     * A list of available proxy artifacts.
     */
    @JsonProperty(value = "value")
    private List<ProxyArtifactVersionsListOverviewInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of ProxyArtifactVersionsOverviewListResult class.
     */
    public ProxyArtifactVersionsOverviewListResult() {
    }

    /**
     * Get the value property: A list of available proxy artifacts.
     * 
     * @return the value value.
     */
    public List<ProxyArtifactVersionsListOverviewInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of available proxy artifacts.
     * 
     * @param value the value value to set.
     * @return the ProxyArtifactVersionsOverviewListResult object itself.
     */
    public ProxyArtifactVersionsOverviewListResult withValue(List<ProxyArtifactVersionsListOverviewInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
