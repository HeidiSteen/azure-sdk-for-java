// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.frontdoor.fluent.FrontendEndpointsClient;
import com.azure.resourcemanager.frontdoor.fluent.models.FrontendEndpointInner;
import com.azure.resourcemanager.frontdoor.models.CustomHttpsConfiguration;
import com.azure.resourcemanager.frontdoor.models.FrontendEndpoint;
import com.azure.resourcemanager.frontdoor.models.FrontendEndpoints;

public final class FrontendEndpointsImpl implements FrontendEndpoints {
    private static final ClientLogger LOGGER = new ClientLogger(FrontendEndpointsImpl.class);

    private final FrontendEndpointsClient innerClient;

    private final com.azure.resourcemanager.frontdoor.FrontDoorManager serviceManager;

    public FrontendEndpointsImpl(
        FrontendEndpointsClient innerClient, com.azure.resourcemanager.frontdoor.FrontDoorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<FrontendEndpoint> listByFrontDoor(String resourceGroupName, String frontDoorName) {
        PagedIterable<FrontendEndpointInner> inner =
            this.serviceClient().listByFrontDoor(resourceGroupName, frontDoorName);
        return Utils.mapPage(inner, inner1 -> new FrontendEndpointImpl(inner1, this.manager()));
    }

    public PagedIterable<FrontendEndpoint> listByFrontDoor(
        String resourceGroupName, String frontDoorName, Context context) {
        PagedIterable<FrontendEndpointInner> inner =
            this.serviceClient().listByFrontDoor(resourceGroupName, frontDoorName, context);
        return Utils.mapPage(inner, inner1 -> new FrontendEndpointImpl(inner1, this.manager()));
    }

    public Response<FrontendEndpoint> getWithResponse(
        String resourceGroupName, String frontDoorName, String frontendEndpointName, Context context) {
        Response<FrontendEndpointInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, frontDoorName, frontendEndpointName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new FrontendEndpointImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public FrontendEndpoint get(String resourceGroupName, String frontDoorName, String frontendEndpointName) {
        FrontendEndpointInner inner = this.serviceClient().get(resourceGroupName, frontDoorName, frontendEndpointName);
        if (inner != null) {
            return new FrontendEndpointImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void enableHttps(
        String resourceGroupName,
        String frontDoorName,
        String frontendEndpointName,
        CustomHttpsConfiguration customHttpsConfiguration) {
        this
            .serviceClient()
            .enableHttps(resourceGroupName, frontDoorName, frontendEndpointName, customHttpsConfiguration);
    }

    public void enableHttps(
        String resourceGroupName,
        String frontDoorName,
        String frontendEndpointName,
        CustomHttpsConfiguration customHttpsConfiguration,
        Context context) {
        this
            .serviceClient()
            .enableHttps(resourceGroupName, frontDoorName, frontendEndpointName, customHttpsConfiguration, context);
    }

    public void disableHttps(String resourceGroupName, String frontDoorName, String frontendEndpointName) {
        this.serviceClient().disableHttps(resourceGroupName, frontDoorName, frontendEndpointName);
    }

    public void disableHttps(
        String resourceGroupName, String frontDoorName, String frontendEndpointName, Context context) {
        this.serviceClient().disableHttps(resourceGroupName, frontDoorName, frontendEndpointName, context);
    }

    private FrontendEndpointsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.frontdoor.FrontDoorManager manager() {
        return this.serviceManager;
    }
}
