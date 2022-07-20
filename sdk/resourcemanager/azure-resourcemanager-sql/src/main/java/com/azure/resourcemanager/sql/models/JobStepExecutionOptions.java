// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The execution options of a job step. */
@Fluent
public final class JobStepExecutionOptions {
    /*
     * Execution timeout for the job step.
     */
    @JsonProperty(value = "timeoutSeconds")
    private Integer timeoutSeconds;

    /*
     * Maximum number of times the job step will be reattempted if the first
     * attempt fails.
     */
    @JsonProperty(value = "retryAttempts")
    private Integer retryAttempts;

    /*
     * Initial delay between retries for job step execution.
     */
    @JsonProperty(value = "initialRetryIntervalSeconds")
    private Integer initialRetryIntervalSeconds;

    /*
     * The maximum amount of time to wait between retries for job step
     * execution.
     */
    @JsonProperty(value = "maximumRetryIntervalSeconds")
    private Integer maximumRetryIntervalSeconds;

    /*
     * The backoff multiplier for the time between retries.
     */
    @JsonProperty(value = "retryIntervalBackoffMultiplier")
    private Float retryIntervalBackoffMultiplier;

    /**
     * Get the timeoutSeconds property: Execution timeout for the job step.
     *
     * @return the timeoutSeconds value.
     */
    public Integer timeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * Set the timeoutSeconds property: Execution timeout for the job step.
     *
     * @param timeoutSeconds the timeoutSeconds value to set.
     * @return the JobStepExecutionOptions object itself.
     */
    public JobStepExecutionOptions withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
     * Get the retryAttempts property: Maximum number of times the job step will be reattempted if the first attempt
     * fails.
     *
     * @return the retryAttempts value.
     */
    public Integer retryAttempts() {
        return this.retryAttempts;
    }

    /**
     * Set the retryAttempts property: Maximum number of times the job step will be reattempted if the first attempt
     * fails.
     *
     * @param retryAttempts the retryAttempts value to set.
     * @return the JobStepExecutionOptions object itself.
     */
    public JobStepExecutionOptions withRetryAttempts(Integer retryAttempts) {
        this.retryAttempts = retryAttempts;
        return this;
    }

    /**
     * Get the initialRetryIntervalSeconds property: Initial delay between retries for job step execution.
     *
     * @return the initialRetryIntervalSeconds value.
     */
    public Integer initialRetryIntervalSeconds() {
        return this.initialRetryIntervalSeconds;
    }

    /**
     * Set the initialRetryIntervalSeconds property: Initial delay between retries for job step execution.
     *
     * @param initialRetryIntervalSeconds the initialRetryIntervalSeconds value to set.
     * @return the JobStepExecutionOptions object itself.
     */
    public JobStepExecutionOptions withInitialRetryIntervalSeconds(Integer initialRetryIntervalSeconds) {
        this.initialRetryIntervalSeconds = initialRetryIntervalSeconds;
        return this;
    }

    /**
     * Get the maximumRetryIntervalSeconds property: The maximum amount of time to wait between retries for job step
     * execution.
     *
     * @return the maximumRetryIntervalSeconds value.
     */
    public Integer maximumRetryIntervalSeconds() {
        return this.maximumRetryIntervalSeconds;
    }

    /**
     * Set the maximumRetryIntervalSeconds property: The maximum amount of time to wait between retries for job step
     * execution.
     *
     * @param maximumRetryIntervalSeconds the maximumRetryIntervalSeconds value to set.
     * @return the JobStepExecutionOptions object itself.
     */
    public JobStepExecutionOptions withMaximumRetryIntervalSeconds(Integer maximumRetryIntervalSeconds) {
        this.maximumRetryIntervalSeconds = maximumRetryIntervalSeconds;
        return this;
    }

    /**
     * Get the retryIntervalBackoffMultiplier property: The backoff multiplier for the time between retries.
     *
     * @return the retryIntervalBackoffMultiplier value.
     */
    public Float retryIntervalBackoffMultiplier() {
        return this.retryIntervalBackoffMultiplier;
    }

    /**
     * Set the retryIntervalBackoffMultiplier property: The backoff multiplier for the time between retries.
     *
     * @param retryIntervalBackoffMultiplier the retryIntervalBackoffMultiplier value to set.
     * @return the JobStepExecutionOptions object itself.
     */
    public JobStepExecutionOptions withRetryIntervalBackoffMultiplier(Float retryIntervalBackoffMultiplier) {
        this.retryIntervalBackoffMultiplier = retryIntervalBackoffMultiplier;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
