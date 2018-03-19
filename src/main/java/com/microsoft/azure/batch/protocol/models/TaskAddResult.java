/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result for a single task added as part of an add task collection operation.
 */
public class TaskAddResult {
    /**
     * The status of the add task request.
     * Possible values include: 'success', 'clientError', 'serverError'.
     */
    @JsonProperty(value = "status", required = true)
    private TaskAddStatus status;

    /**
     * The ID of the task for which this is the result.
     */
    @JsonProperty(value = "taskId", required = true)
    private String taskId;

    /**
     * The ETag of the task, if the task was successfully added.
     * You can use this to detect whether the task has changed between
     * requests. In particular, you can be pass the ETag with an Update Task
     * request to specify that your changes should take effect only if nobody
     * else has modified the job in the meantime.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * The last modified time of the task.
     */
    @JsonProperty(value = "lastModified")
    private DateTime lastModified;

    /**
     * The URL of the task, if the task was successfully added.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * The error encountered while attempting to add the task.
     */
    @JsonProperty(value = "error")
    private BatchError error;

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public TaskAddStatus status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the TaskAddResult object itself.
     */
    public TaskAddResult withStatus(TaskAddStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the taskId value.
     *
     * @return the taskId value
     */
    public String taskId() {
        return this.taskId;
    }

    /**
     * Set the taskId value.
     *
     * @param taskId the taskId value to set
     * @return the TaskAddResult object itself.
     */
    public TaskAddResult withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get the eTag value.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the eTag value.
     *
     * @param eTag the eTag value to set
     * @return the TaskAddResult object itself.
     */
    public TaskAddResult withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified value.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Set the lastModified value.
     *
     * @param lastModified the lastModified value to set
     * @return the TaskAddResult object itself.
     */
    public TaskAddResult withLastModified(DateTime lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the TaskAddResult object itself.
     */
    public TaskAddResult withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public BatchError error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the TaskAddResult object itself.
     */
    public TaskAddResult withError(BatchError error) {
        this.error = error;
        return this;
    }

}
