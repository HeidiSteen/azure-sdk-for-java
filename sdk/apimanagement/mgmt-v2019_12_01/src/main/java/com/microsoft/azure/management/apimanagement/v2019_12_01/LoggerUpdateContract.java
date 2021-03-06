/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Logger update contract.
 */
@JsonFlatten
public class LoggerUpdateContract {
    /**
     * Logger type. Possible values include: 'azureEventHub',
     * 'applicationInsights'.
     */
    @JsonProperty(value = "properties.loggerType")
    private LoggerType loggerType;

    /**
     * Logger description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Logger credentials.
     */
    @JsonProperty(value = "properties.credentials")
    private Map<String, String> credentials;

    /**
     * Whether records are buffered in the logger before publishing. Default is
     * assumed to be true.
     */
    @JsonProperty(value = "properties.isBuffered")
    private Boolean isBuffered;

    /**
     * Get logger type. Possible values include: 'azureEventHub', 'applicationInsights'.
     *
     * @return the loggerType value
     */
    public LoggerType loggerType() {
        return this.loggerType;
    }

    /**
     * Set logger type. Possible values include: 'azureEventHub', 'applicationInsights'.
     *
     * @param loggerType the loggerType value to set
     * @return the LoggerUpdateContract object itself.
     */
    public LoggerUpdateContract withLoggerType(LoggerType loggerType) {
        this.loggerType = loggerType;
        return this;
    }

    /**
     * Get logger description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set logger description.
     *
     * @param description the description value to set
     * @return the LoggerUpdateContract object itself.
     */
    public LoggerUpdateContract withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get logger credentials.
     *
     * @return the credentials value
     */
    public Map<String, String> credentials() {
        return this.credentials;
    }

    /**
     * Set logger credentials.
     *
     * @param credentials the credentials value to set
     * @return the LoggerUpdateContract object itself.
     */
    public LoggerUpdateContract withCredentials(Map<String, String> credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get whether records are buffered in the logger before publishing. Default is assumed to be true.
     *
     * @return the isBuffered value
     */
    public Boolean isBuffered() {
        return this.isBuffered;
    }

    /**
     * Set whether records are buffered in the logger before publishing. Default is assumed to be true.
     *
     * @param isBuffered the isBuffered value to set
     * @return the LoggerUpdateContract object itself.
     */
    public LoggerUpdateContract withIsBuffered(Boolean isBuffered) {
        this.isBuffered = isBuffered;
        return this;
    }

}
