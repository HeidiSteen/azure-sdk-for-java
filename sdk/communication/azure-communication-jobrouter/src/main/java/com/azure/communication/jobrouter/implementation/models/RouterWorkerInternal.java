// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.communication.jobrouter.models.RouterChannel;
import com.azure.communication.jobrouter.models.RouterJobOffer;
import com.azure.communication.jobrouter.models.RouterWorkerAssignment;
import com.azure.communication.jobrouter.models.RouterWorkerState;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** An entity for jobs to be routed to. */
@Fluent
public final class RouterWorkerInternal {

    /*
     * The entity tag for this resource.
     */
    @Generated
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Id of the worker.
     */
    @Generated
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The current state of the worker.
     */
    @Generated
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private RouterWorkerState state;

    /*
     * The queue(s) that this worker can receive work from.
     */
    @Generated
    @JsonProperty(value = "queues")
    private List<String> queues;

    /*
     * The total capacity score this worker has to manage multiple concurrent jobs.
     */
    @Generated
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /*
     * A set of key/value pairs that are identifying attributes used by the rules engines to make decisions.
     */
    @Generated
    @JsonProperty(value = "labels")
    private Map<String, Object> labels;

    /*
     * A set of non-identifying attributes attached to this worker.
     */
    @Generated
    @JsonProperty(value = "tags")
    private Map<String, Object> tags;

    /*
     * The channel(s) this worker can handle and their impact on the workers capacity.
     */
    @Generated
    @JsonProperty(value = "channels")
    private List<RouterChannel> channels;

    /*
     * A list of active offers issued to this worker.
     */
    @Generated
    @JsonProperty(value = "offers", access = JsonProperty.Access.WRITE_ONLY)
    private List<RouterJobOffer> offers;

    /*
     * A list of assigned jobs attached to this worker.
     */
    @Generated
    @JsonProperty(value = "assignedJobs", access = JsonProperty.Access.WRITE_ONLY)
    private List<RouterWorkerAssignment> assignedJobs;

    /*
     * A value indicating the workers capacity. A value of '1' means all capacity is consumed. A value of '0' means no
     * capacity is currently consumed.
     */
    @Generated
    @JsonProperty(value = "loadRatio", access = JsonProperty.Access.WRITE_ONLY)
    private Double loadRatio;

    /*
     * A flag indicating this worker is open to receive offers or not.
     */
    @Generated
    @JsonProperty(value = "availableForOffers")
    private Boolean availableForOffers;

    /** Creates an instance of RouterWorkerInternal class. */
    @Generated
    public RouterWorkerInternal() {}

    /**
     * Get the etag property: The entity tag for this resource.
     *
     * @return the etag value.
     */
    @Generated
    public String getEtag() {
        return this.etag;
    }

    /**
     * Get the id property: Id of the worker.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the state property: The current state of the worker.
     *
     * @return the state value.
     */
    @Generated
    public RouterWorkerState getState() {
        return this.state;
    }

    /**
     * Get the queues property: The queue(s) that this worker can receive work from.
     *
     * @return the queues value.
     */
    @Generated
    public List<String> getQueues() {
        return this.queues;
    }

    /**
     * Set the queues property: The queue(s) that this worker can receive work from.
     *
     * @param queues the queues value to set.
     * @return the RouterWorkerInternal object itself.
     */
    @Generated
    public RouterWorkerInternal setQueues(List<String> queues) {
        this.queues = queues;
        return this;
    }

    /**
     * Get the capacity property: The total capacity score this worker has to manage multiple concurrent jobs.
     *
     * @return the capacity value.
     */
    @Generated
    public Integer getCapacity() {
        return this.capacity;
    }

    /**
     * Set the capacity property: The total capacity score this worker has to manage multiple concurrent jobs.
     *
     * @param capacity the capacity value to set.
     * @return the RouterWorkerInternal object itself.
     */
    @Generated
    public RouterWorkerInternal setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the labels property: A set of key/value pairs that are identifying attributes used by the rules engines to
     * make decisions.
     *
     * @return the labels value.
     */
    @Generated
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    /**
     * Set the labels property: A set of key/value pairs that are identifying attributes used by the rules engines to
     * make decisions.
     *
     * @param labels the labels value to set.
     * @return the RouterWorkerInternal object itself.
     */
    @Generated
    public RouterWorkerInternal setLabels(Map<String, Object> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the tags property: A set of non-identifying attributes attached to this worker.
     *
     * @return the tags value.
     */
    @Generated
    public Map<String, Object> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: A set of non-identifying attributes attached to this worker.
     *
     * @param tags the tags value to set.
     * @return the RouterWorkerInternal object itself.
     */
    @Generated
    public RouterWorkerInternal setTags(Map<String, Object> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the channels property: The channel(s) this worker can handle and their impact on the workers capacity.
     *
     * @return the channels value.
     */
    @Generated
    public List<RouterChannel> getChannels() {
        return this.channels;
    }

    /**
     * Set the channels property: The channel(s) this worker can handle and their impact on the workers capacity.
     *
     * @param channels the channels value to set.
     * @return the RouterWorkerInternal object itself.
     */
    @Generated
    public RouterWorkerInternal setChannels(List<RouterChannel> channels) {
        this.channels = channels;
        return this;
    }

    /**
     * Get the offers property: A list of active offers issued to this worker.
     *
     * @return the offers value.
     */
    @Generated
    public List<RouterJobOffer> getOffers() {
        return this.offers;
    }

    /**
     * Get the assignedJobs property: A list of assigned jobs attached to this worker.
     *
     * @return the assignedJobs value.
     */
    @Generated
    public List<RouterWorkerAssignment> getAssignedJobs() {
        return this.assignedJobs;
    }

    /**
     * Get the loadRatio property: A value indicating the workers capacity. A value of '1' means all capacity is
     * consumed. A value of '0' means no capacity is currently consumed.
     *
     * @return the loadRatio value.
     */
    @Generated
    public Double getLoadRatio() {
        return this.loadRatio;
    }

    /**
     * Get the availableForOffers property: A flag indicating this worker is open to receive offers or not.
     *
     * @return the availableForOffers value.
     */
    @Generated
    public Boolean isAvailableForOffers() {
        return this.availableForOffers;
    }

    /**
     * Set the availableForOffers property: A flag indicating this worker is open to receive offers or not.
     *
     * @param availableForOffers the availableForOffers value to set.
     * @return the RouterWorkerInternal object itself.
     */
    @Generated
    public RouterWorkerInternal setAvailableForOffers(Boolean availableForOffers) {
        this.availableForOffers = availableForOffers;
        return this;
    }
}
