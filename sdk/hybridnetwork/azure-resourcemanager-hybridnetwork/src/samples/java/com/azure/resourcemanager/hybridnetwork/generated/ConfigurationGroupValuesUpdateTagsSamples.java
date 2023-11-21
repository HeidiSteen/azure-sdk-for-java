// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.resourcemanager.hybridnetwork.models.ConfigurationGroupValue;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ConfigurationGroupValues UpdateTags.
 */
public final class ConfigurationGroupValuesUpdateTagsSamples {
    /*
     * x-ms-original-file:
     * specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2023-09-01/examples/
     * ConfigurationGroupValueUpdateTags.json
     */
    /**
     * Sample code: Update hybrid configuration group tags.
     * 
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void
        updateHybridConfigurationGroupTags(com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        ConfigurationGroupValue resource = manager.configurationGroupValues()
            .getByResourceGroupWithResponse("rg1", "testConfigurationGroupValue", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
    }

    // Use "Map.of" if available
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
