// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.support.fluent.models.LookUpResourceIdResponseInner;
import com.azure.resourcemanager.support.models.LookUpResourceIdRequest;

/**
 * An instance of this class provides access to all the operations defined in LookUpResourceIdsClient.
 */
public interface LookUpResourceIdsClient {
    /**
     * This operation fetches ARM resource id of support resource type.
     * 
     * @param lookUpResourceIdRequest Look up resource id request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the look up resource id response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LookUpResourceIdResponseInner> postWithResponse(LookUpResourceIdRequest lookUpResourceIdRequest,
        Context context);

    /**
     * This operation fetches ARM resource id of support resource type.
     * 
     * @param lookUpResourceIdRequest Look up resource id request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the look up resource id response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LookUpResourceIdResponseInner post(LookUpResourceIdRequest lookUpResourceIdRequest);
}
