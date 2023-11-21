// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of NetworkFunctions.
 */
public interface NetworkFunctions {
    /**
     * Deletes the specified network function resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName The name of the network function.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String networkFunctionName);

    /**
     * Deletes the specified network function resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName The name of the network function.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkFunctionName, Context context);

    /**
     * Gets information about the specified network function resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName The name of the network function resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified network function resource along with {@link Response}.
     */
    Response<NetworkFunction> getByResourceGroupWithResponse(String resourceGroupName, String networkFunctionName,
        Context context);

    /**
     * Gets information about the specified network function resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName The name of the network function resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified network function resource.
     */
    NetworkFunction getByResourceGroup(String resourceGroupName, String networkFunctionName);

    /**
     * Lists all the network functions in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for network function API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkFunction> list();

    /**
     * Lists all the network functions in a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for network function API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkFunction> list(Context context);

    /**
     * Lists all the network function resources in a resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for network function API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkFunction> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the network function resources in a resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for network function API service call as paginated response with {@link PagedIterable}.
     */
    PagedIterable<NetworkFunction> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Execute a request to services on a containerized network function.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName The name of the network function.
     * @param parameters Payload for execute request post call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void executeRequest(String resourceGroupName, String networkFunctionName, ExecuteRequestParameters parameters);

    /**
     * Execute a request to services on a containerized network function.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName The name of the network function.
     * @param parameters Payload for execute request post call.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void executeRequest(String resourceGroupName, String networkFunctionName, ExecuteRequestParameters parameters,
        Context context);

    /**
     * Gets information about the specified network function resource.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified network function resource along with {@link Response}.
     */
    NetworkFunction getById(String id);

    /**
     * Gets information about the specified network function resource.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified network function resource along with {@link Response}.
     */
    Response<NetworkFunction> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified network function resource.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified network function resource.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new NetworkFunction resource.
     * 
     * @param name resource name.
     * @return the first stage of the new NetworkFunction definition.
     */
    NetworkFunction.DefinitionStages.Blank define(String name);
}
