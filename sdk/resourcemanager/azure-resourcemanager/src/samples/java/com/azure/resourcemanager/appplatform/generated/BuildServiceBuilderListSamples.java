// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.core.util.Context;

/** Samples for BuildServiceBuilder List. */
public final class BuildServiceBuilderListSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2022-12-01/examples/BuildServiceBuilder_List.json
     */
    /**
     * Sample code: BuildServiceBuilder_List.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void buildServiceBuilderList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getBuildServiceBuilders()
            .list("myResourceGroup", "myservice", "default", Context.NONE);
    }
}
