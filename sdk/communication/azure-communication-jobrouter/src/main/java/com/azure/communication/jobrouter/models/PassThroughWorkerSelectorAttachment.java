// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.time.Duration;

/** Attaches a worker selector where the value is passed through from the job label with the same key. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("pass-through")
@Fluent
public final class PassThroughWorkerSelectorAttachment extends WorkerSelectorAttachment {

    /*
     * The label key to query against
     */
    @Generated
    @JsonProperty(value = "key")
    private String key;

    /*
     * Describes how the value of the label is compared to the value pass through
     */
    @Generated
    @JsonProperty(value = "labelOperator")
    private LabelOperator labelOperator;

    /*
     * Describes how long the attached label selector is valid in seconds.
     */
    @JsonProperty(value = "expiresAfterSeconds")
    private Duration expiresAfter;

    /**
     * Creates an instance of PassThroughWorkerSelectorAttachment class.
     *
     * @param key the key value to set.
     * @param labelOperator the labelOperator value to set.
     */
    @Generated
    @JsonCreator
    public PassThroughWorkerSelectorAttachment(
            @JsonProperty(value = "key") String key,
            @JsonProperty(value = "labelOperator") LabelOperator labelOperator) {
        this.key = key;
        this.labelOperator = labelOperator;
    }

    /**
     * Get the key property: The label key to query against.
     *
     * @return the key value.
     */
    @Generated
    public String getKey() {
        return this.key;
    }

    /**
     * Get the labelOperator property: Describes how the value of the label is compared to the value pass through.
     *
     * @return the labelOperator value.
     */
    @Generated
    public LabelOperator getLabelOperator() {
        return this.labelOperator;
    }

    /**
     * Get the expiresAfter property: Describes how long the attached label selector is valid in seconds.
     *
     * @return the expiresAfter value.
     */
    @Generated
    public Duration getExpiresAfter() {
        return this.expiresAfter;
    }

    /**
     * Set the expiresAfter property: Describes how long the attached label selector is valid in seconds.
     *
     * @param expiresAfter the expiresAfter value to set.
     * @return the PassThroughWorkerSelectorAttachment object itself.
     */
    @Generated
    public PassThroughWorkerSelectorAttachment setExpiresAfter(Duration expiresAfter) {
        this.expiresAfter = expiresAfter;
        return this;
    }
}
