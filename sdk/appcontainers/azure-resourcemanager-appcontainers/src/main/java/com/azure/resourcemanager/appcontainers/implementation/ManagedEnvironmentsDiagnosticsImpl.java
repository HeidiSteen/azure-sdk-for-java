// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appcontainers.fluent.ManagedEnvironmentsDiagnosticsClient;
import com.azure.resourcemanager.appcontainers.fluent.models.ManagedEnvironmentInner;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironment;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironmentsDiagnostics;

public final class ManagedEnvironmentsDiagnosticsImpl implements ManagedEnvironmentsDiagnostics {
    private static final ClientLogger LOGGER = new ClientLogger(ManagedEnvironmentsDiagnosticsImpl.class);

    private final ManagedEnvironmentsDiagnosticsClient innerClient;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public ManagedEnvironmentsDiagnosticsImpl(
        ManagedEnvironmentsDiagnosticsClient innerClient,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ManagedEnvironment> getRootWithResponse(
        String resourceGroupName, String environmentName, Context context) {
        Response<ManagedEnvironmentInner> inner =
            this.serviceClient().getRootWithResponse(resourceGroupName, environmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagedEnvironmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ManagedEnvironment getRoot(String resourceGroupName, String environmentName) {
        ManagedEnvironmentInner inner = this.serviceClient().getRoot(resourceGroupName, environmentName);
        if (inner != null) {
            return new ManagedEnvironmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ManagedEnvironmentsDiagnosticsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }
}