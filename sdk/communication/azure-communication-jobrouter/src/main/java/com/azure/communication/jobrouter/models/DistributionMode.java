// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Abstract base class for defining a distribution mode. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = DistributionMode.class)
@JsonTypeName("DistributionMode")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "best-worker", value = BestWorkerMode.class),
    @JsonSubTypes.Type(name = "longest-idle", value = LongestIdleMode.class),
    @JsonSubTypes.Type(name = "round-robin", value = RoundRobinMode.class)
})
@Fluent
public class DistributionMode {

    /*
     * Governs the minimum desired number of active concurrent offers a job can have.
     */
    @Generated
    @JsonProperty(value = "minConcurrentOffers")
    private Integer minConcurrentOffers;

    /*
     * Governs the maximum number of active concurrent offers a job can have.
     */
    @Generated
    @JsonProperty(value = "maxConcurrentOffers")
    private Integer maxConcurrentOffers;

    /*
     * If set to true, then router will match workers to jobs even if they don't match label selectors. Warning: You
     * may get workers that are not qualified for the job they are matched with if you set this variable to true. This
     * flag is intended more for temporary usage. By default, set to false.
     */
    @Generated
    @JsonProperty(value = "bypassSelectors")
    private Boolean bypassSelectors;

    /** Creates an instance of DistributionMode class. */
    @Generated
    public DistributionMode() {}

    /**
     * Get the minConcurrentOffers property: Governs the minimum desired number of active concurrent offers a job can
     * have.
     *
     * @return the minConcurrentOffers value.
     */
    @Generated
    public Integer getMinConcurrentOffers() {
        return this.minConcurrentOffers;
    }

    /**
     * Set the minConcurrentOffers property: Governs the minimum desired number of active concurrent offers a job can
     * have.
     *
     * @param minConcurrentOffers the minConcurrentOffers value to set.
     * @return the DistributionMode object itself.
     */
    @Generated
    public DistributionMode setMinConcurrentOffers(Integer minConcurrentOffers) {
        this.minConcurrentOffers = minConcurrentOffers;
        return this;
    }

    /**
     * Get the maxConcurrentOffers property: Governs the maximum number of active concurrent offers a job can have.
     *
     * @return the maxConcurrentOffers value.
     */
    @Generated
    public Integer getMaxConcurrentOffers() {
        return this.maxConcurrentOffers;
    }

    /**
     * Set the maxConcurrentOffers property: Governs the maximum number of active concurrent offers a job can have.
     *
     * @param maxConcurrentOffers the maxConcurrentOffers value to set.
     * @return the DistributionMode object itself.
     */
    @Generated
    public DistributionMode setMaxConcurrentOffers(Integer maxConcurrentOffers) {
        this.maxConcurrentOffers = maxConcurrentOffers;
        return this;
    }

    /**
     * Get the bypassSelectors property: If set to true, then router will match workers to jobs even if they don't match
     * label selectors. Warning: You may get workers that are not qualified for the job they are matched with if you set
     * this variable to true. This flag is intended more for temporary usage. By default, set to false.
     *
     * @return the bypassSelectors value.
     */
    @Generated
    public Boolean isBypassSelectors() {
        return this.bypassSelectors;
    }

    /**
     * Set the bypassSelectors property: If set to true, then router will match workers to jobs even if they don't match
     * label selectors. Warning: You may get workers that are not qualified for the job they are matched with if you set
     * this variable to true. This flag is intended more for temporary usage. By default, set to false.
     *
     * @param bypassSelectors the bypassSelectors value to set.
     * @return the DistributionMode object itself.
     */
    @Generated
    public DistributionMode setBypassSelectors(Boolean bypassSelectors) {
        this.bypassSelectors = bypassSelectors;
        return this;
    }
}
