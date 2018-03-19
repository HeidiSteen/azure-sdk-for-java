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

import java.util.UUID;
import com.microsoft.rest.DateTimeRfc1123;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for removeNodes operation.
 */
public class PoolRemoveNodesOptions {
    /**
     * The maximum time that the server can spend processing the request, in
     * seconds. The default is 30 seconds.
     */
    @JsonProperty(value = "")
    private Integer timeout;

    /**
     * The caller-generated request identity, in the form of a GUID with no
     * decoration such as curly braces, e.g.
     * 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     */
    @JsonProperty(value = "")
    private UUID clientRequestId;

    /**
     * Whether the server should return the client-request-id in the response.
     */
    @JsonProperty(value = "")
    private Boolean returnClientRequestId;

    /**
     * The time the request was issued. Client libraries typically set this to
     * the current system clock time; set it explicitly if you are calling the
     * REST API directly.
     */
    @JsonProperty(value = "")
    private DateTimeRfc1123 ocpDate;

    /**
     * An ETag value associated with the version of the resource known to the
     * client. The operation will be performed only if the resource's current
     * ETag on the service exactly matches the value specified by the client.
     */
    @JsonProperty(value = "")
    private String ifMatch;

    /**
     * An ETag value associated with the version of the resource known to the
     * client. The operation will be performed only if the resource's current
     * ETag on the service does not match the value specified by the client.
     */
    @JsonProperty(value = "")
    private String ifNoneMatch;

    /**
     * A timestamp indicating the last modified time of the resource known to
     * the client. The operation will be performed only if the resource on the
     * service has been modified since the specified time.
     */
    @JsonProperty(value = "")
    private DateTimeRfc1123 ifModifiedSince;

    /**
     * A timestamp indicating the last modified time of the resource known to
     * the client. The operation will be performed only if the resource on the
     * service has not been modified since the specified time.
     */
    @JsonProperty(value = "")
    private DateTimeRfc1123 ifUnmodifiedSince;

    /**
     * Get the timeout value.
     *
     * @return the timeout value
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout value.
     *
     * @param timeout the timeout value to set
     * @return the PoolRemoveNodesOptions object itself.
     */
    public PoolRemoveNodesOptions withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the clientRequestId value.
     *
     * @return the clientRequestId value
     */
    public UUID clientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId value.
     *
     * @param clientRequestId the clientRequestId value to set
     * @return the PoolRemoveNodesOptions object itself.
     */
    public PoolRemoveNodesOptions withClientRequestId(UUID clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the returnClientRequestId value.
     *
     * @return the returnClientRequestId value
     */
    public Boolean returnClientRequestId() {
        return this.returnClientRequestId;
    }

    /**
     * Set the returnClientRequestId value.
     *
     * @param returnClientRequestId the returnClientRequestId value to set
     * @return the PoolRemoveNodesOptions object itself.
     */
    public PoolRemoveNodesOptions withReturnClientRequestId(Boolean returnClientRequestId) {
        this.returnClientRequestId = returnClientRequestId;
        return this;
    }

    /**
     * Get the ocpDate value.
     *
     * @return the ocpDate value
     */
    public DateTime ocpDate() {
        if (this.ocpDate == null) {
            return null;
        }
        return this.ocpDate.dateTime();
    }

    /**
     * Set the ocpDate value.
     *
     * @param ocpDate the ocpDate value to set
     * @return the PoolRemoveNodesOptions object itself.
     */
    public PoolRemoveNodesOptions withOcpDate(DateTime ocpDate) {
        if (ocpDate == null) {
            this.ocpDate = null;
        } else {
            this.ocpDate = new DateTimeRfc1123(ocpDate);
        }
        return this;
    }

    /**
     * Get the ifMatch value.
     *
     * @return the ifMatch value
     */
    public String ifMatch() {
        return this.ifMatch;
    }

    /**
     * Set the ifMatch value.
     *
     * @param ifMatch the ifMatch value to set
     * @return the PoolRemoveNodesOptions object itself.
     */
    public PoolRemoveNodesOptions withIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }

    /**
     * Get the ifNoneMatch value.
     *
     * @return the ifNoneMatch value
     */
    public String ifNoneMatch() {
        return this.ifNoneMatch;
    }

    /**
     * Set the ifNoneMatch value.
     *
     * @param ifNoneMatch the ifNoneMatch value to set
     * @return the PoolRemoveNodesOptions object itself.
     */
    public PoolRemoveNodesOptions withIfNoneMatch(String ifNoneMatch) {
        this.ifNoneMatch = ifNoneMatch;
        return this;
    }

    /**
     * Get the ifModifiedSince value.
     *
     * @return the ifModifiedSince value
     */
    public DateTime ifModifiedSince() {
        if (this.ifModifiedSince == null) {
            return null;
        }
        return this.ifModifiedSince.dateTime();
    }

    /**
     * Set the ifModifiedSince value.
     *
     * @param ifModifiedSince the ifModifiedSince value to set
     * @return the PoolRemoveNodesOptions object itself.
     */
    public PoolRemoveNodesOptions withIfModifiedSince(DateTime ifModifiedSince) {
        if (ifModifiedSince == null) {
            this.ifModifiedSince = null;
        } else {
            this.ifModifiedSince = new DateTimeRfc1123(ifModifiedSince);
        }
        return this;
    }

    /**
     * Get the ifUnmodifiedSince value.
     *
     * @return the ifUnmodifiedSince value
     */
    public DateTime ifUnmodifiedSince() {
        if (this.ifUnmodifiedSince == null) {
            return null;
        }
        return this.ifUnmodifiedSince.dateTime();
    }

    /**
     * Set the ifUnmodifiedSince value.
     *
     * @param ifUnmodifiedSince the ifUnmodifiedSince value to set
     * @return the PoolRemoveNodesOptions object itself.
     */
    public PoolRemoveNodesOptions withIfUnmodifiedSince(DateTime ifUnmodifiedSince) {
        if (ifUnmodifiedSince == null) {
            this.ifUnmodifiedSince = null;
        } else {
            this.ifUnmodifiedSince = new DateTimeRfc1123(ifUnmodifiedSince);
        }
        return this;
    }

}
