// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for AdaptiveNetworkHardenings ListByExtendedResource. */
public final class AdaptiveNetworkHardeningsListByExtendedResourceSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2020-01-01/examples/AdaptiveNetworkHardenings/ListByExtendedResourceAdaptiveNetworkHardenings_example.json
     */
    /**
     * Sample code: List Adaptive Network Hardenings resources of an extended resource.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void listAdaptiveNetworkHardeningsResourcesOfAnExtendedResource(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .adaptiveNetworkHardenings()
            .listByExtendedResource("rg1", "Microsoft.Compute", "virtualMachines", "vm1", Context.NONE);
    }
}