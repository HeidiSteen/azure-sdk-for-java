// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.developer.devcenter;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.developer.devcenter.implementation.DevCenterClientImpl;

/** Initializes a new instance of the synchronous DevCenterClient type. */
@ServiceClient(builder = DevCenterClientBuilder.class)
public final class DevCenterClient {
    @Generated private final DevCenterClientImpl serviceClient;

    /**
     * Initializes an instance of DevCenterClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    DevCenterClient(DevCenterClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists all projects.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>filter</td><td>String</td><td>No</td><td>An OData filter clause to apply to the operation.</td></tr>
     *     <tr><td>top</td><td>Integer</td><td>No</td><td>The maximum number of resources to return from the operation. Example: 'top=10'.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Required)
     *     description: String (Optional)
     *     maxDevBoxesPerUser: Integer (Optional)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return results of the project list operation as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listProjects(RequestOptions requestOptions) {
        return this.serviceClient.listProjects(requestOptions);
    }

    /**
     * Gets a project.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Required)
     *     description: String (Optional)
     *     maxDevBoxesPerUser: Integer (Optional)
     * }
     * }</pre>
     *
     * @param projectName The DevCenter Project upon which to execute operations.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a project along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getProjectWithResponse(String projectName, RequestOptions requestOptions) {
        return this.serviceClient.getProjectWithResponse(projectName, requestOptions);
    }
}
