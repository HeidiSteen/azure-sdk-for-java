// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.fluent.models.RecommendedElasticPoolMetricInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents the response to a list recommended elastic pool metrics request. */
@Fluent
public final class RecommendedElasticPoolListMetricsResult {
    /*
     * The list of recommended elastic pools metrics.
     */
    @JsonProperty(value = "value", required = true)
    private List<RecommendedElasticPoolMetricInner> value;

    /**
     * Get the value property: The list of recommended elastic pools metrics.
     *
     * @return the value value.
     */
    public List<RecommendedElasticPoolMetricInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of recommended elastic pools metrics.
     *
     * @param value the value value to set.
     * @return the RecommendedElasticPoolListMetricsResult object itself.
     */
    public RecommendedElasticPoolListMetricsResult withValue(List<RecommendedElasticPoolMetricInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model RecommendedElasticPoolListMetricsResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RecommendedElasticPoolListMetricsResult.class);
}
