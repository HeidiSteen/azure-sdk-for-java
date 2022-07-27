// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.resourceconnector.models.Appliance;
import java.util.HashMap;
import java.util.Map;

/** Samples for Appliances Update. */
public final class AppliancesUpdateSamples {
    /*
     * x-ms-original-file: specification/resourceconnector/resource-manager/Microsoft.ResourceConnector/preview/2022-04-15-preview/examples/AppliancesPatch.json
     */
    /**
     * Sample code: Update Appliance.
     *
     * @param manager Entry point to AppliancesManager.
     */
    public static void updateAppliance(com.azure.resourcemanager.resourceconnector.AppliancesManager manager) {
        Appliance resource =
            manager
                .appliances()
                .getByResourceGroupWithResponse("testresourcegroup", "appliance01", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("key", "value")).apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}