// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.ProtectedItemModelInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Protected item model collection. */
@Fluent
public final class ProtectedItemModelCollection {
    /*
     * Gets or sets the list of protected items.
     */
    @JsonProperty(value = "value")
    private List<ProtectedItemModelInner> value;

    /*
     * Gets or sets the value of next link.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of ProtectedItemModelCollection class. */
    public ProtectedItemModelCollection() {
    }

    /**
     * Get the value property: Gets or sets the list of protected items.
     *
     * @return the value value.
     */
    public List<ProtectedItemModelInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets the list of protected items.
     *
     * @param value the value value to set.
     * @return the ProtectedItemModelCollection object itself.
     */
    public ProtectedItemModelCollection withValue(List<ProtectedItemModelInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets or sets the value of next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets or sets the value of next link.
     *
     * @param nextLink the nextLink value to set.
     * @return the ProtectedItemModelCollection object itself.
     */
    public ProtectedItemModelCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
