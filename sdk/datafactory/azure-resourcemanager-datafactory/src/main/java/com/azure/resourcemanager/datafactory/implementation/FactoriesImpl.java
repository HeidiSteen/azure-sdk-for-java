// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.FactoriesClient;
import com.azure.resourcemanager.datafactory.fluent.models.AccessPolicyResponseInner;
import com.azure.resourcemanager.datafactory.fluent.models.FactoryInner;
import com.azure.resourcemanager.datafactory.fluent.models.GitHubAccessTokenResponseInner;
import com.azure.resourcemanager.datafactory.models.AccessPolicyResponse;
import com.azure.resourcemanager.datafactory.models.Factories;
import com.azure.resourcemanager.datafactory.models.Factory;
import com.azure.resourcemanager.datafactory.models.FactoryRepoUpdate;
import com.azure.resourcemanager.datafactory.models.GitHubAccessTokenRequest;
import com.azure.resourcemanager.datafactory.models.GitHubAccessTokenResponse;
import com.azure.resourcemanager.datafactory.models.UserAccessPolicy;

public final class FactoriesImpl implements Factories {
    private static final ClientLogger LOGGER = new ClientLogger(FactoriesImpl.class);

    private final FactoriesClient innerClient;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    public FactoriesImpl(FactoriesClient innerClient,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Factory> list() {
        PagedIterable<FactoryInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FactoryImpl(inner1, this.manager()));
    }

    public PagedIterable<Factory> list(Context context) {
        PagedIterable<FactoryInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FactoryImpl(inner1, this.manager()));
    }

    public Response<Factory> configureFactoryRepoWithResponse(String locationId, FactoryRepoUpdate factoryRepoUpdate,
        Context context) {
        Response<FactoryInner> inner
            = this.serviceClient().configureFactoryRepoWithResponse(locationId, factoryRepoUpdate, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new FactoryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Factory configureFactoryRepo(String locationId, FactoryRepoUpdate factoryRepoUpdate) {
        FactoryInner inner = this.serviceClient().configureFactoryRepo(locationId, factoryRepoUpdate);
        if (inner != null) {
            return new FactoryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<Factory> listByResourceGroup(String resourceGroupName) {
        PagedIterable<FactoryInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FactoryImpl(inner1, this.manager()));
    }

    public PagedIterable<Factory> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<FactoryInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new FactoryImpl(inner1, this.manager()));
    }

    public Response<Factory> getByResourceGroupWithResponse(String resourceGroupName, String factoryName,
        String ifNoneMatch, Context context) {
        Response<FactoryInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, factoryName, ifNoneMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new FactoryImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Factory getByResourceGroup(String resourceGroupName, String factoryName) {
        FactoryInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, factoryName);
        if (inner != null) {
            return new FactoryImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteByResourceGroupWithResponse(String resourceGroupName, String factoryName,
        Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, factoryName, context);
    }

    public void deleteByResourceGroup(String resourceGroupName, String factoryName) {
        this.serviceClient().delete(resourceGroupName, factoryName);
    }

    public Response<GitHubAccessTokenResponse> getGitHubAccessTokenWithResponse(String resourceGroupName,
        String factoryName, GitHubAccessTokenRequest gitHubAccessTokenRequest, Context context) {
        Response<GitHubAccessTokenResponseInner> inner = this.serviceClient()
            .getGitHubAccessTokenWithResponse(resourceGroupName, factoryName, gitHubAccessTokenRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new GitHubAccessTokenResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public GitHubAccessTokenResponse getGitHubAccessToken(String resourceGroupName, String factoryName,
        GitHubAccessTokenRequest gitHubAccessTokenRequest) {
        GitHubAccessTokenResponseInner inner
            = this.serviceClient().getGitHubAccessToken(resourceGroupName, factoryName, gitHubAccessTokenRequest);
        if (inner != null) {
            return new GitHubAccessTokenResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AccessPolicyResponse> getDataPlaneAccessWithResponse(String resourceGroupName, String factoryName,
        UserAccessPolicy policy, Context context) {
        Response<AccessPolicyResponseInner> inner
            = this.serviceClient().getDataPlaneAccessWithResponse(resourceGroupName, factoryName, policy, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AccessPolicyResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessPolicyResponse getDataPlaneAccess(String resourceGroupName, String factoryName,
        UserAccessPolicy policy) {
        AccessPolicyResponseInner inner
            = this.serviceClient().getDataPlaneAccess(resourceGroupName, factoryName, policy);
        if (inner != null) {
            return new AccessPolicyResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Factory getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = ResourceManagerUtils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String localIfNoneMatch = null;
        return this.getByResourceGroupWithResponse(resourceGroupName, factoryName, localIfNoneMatch, Context.NONE)
            .getValue();
    }

    public Response<Factory> getByIdWithResponse(String id, String ifNoneMatch, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = ResourceManagerUtils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, factoryName, ifNoneMatch, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = ResourceManagerUtils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        this.deleteByResourceGroupWithResponse(resourceGroupName, factoryName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = ResourceManagerUtils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        return this.deleteByResourceGroupWithResponse(resourceGroupName, factoryName, context);
    }

    private FactoriesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }

    public FactoryImpl define(String name) {
        return new FactoryImpl(name, this.manager());
    }
}
