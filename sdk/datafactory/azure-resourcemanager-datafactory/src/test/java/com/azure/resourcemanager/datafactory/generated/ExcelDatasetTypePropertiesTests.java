// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ExcelDatasetTypeProperties;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

public final class ExcelDatasetTypePropertiesTests {
    @Test
    public void testDeserialize() {
        ExcelDatasetTypeProperties model =
            BinaryData
                .fromString("{\"location\":{\"type\":\"DatasetLocation\",\"\":{}},\"compression\":{\"\":{}}}")
                .toObject(ExcelDatasetTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        ExcelDatasetTypeProperties model =
            new ExcelDatasetTypeProperties()
                .withLocation(new DatasetLocation().withAdditionalProperties(mapOf("type", "DatasetLocation")))
                .withCompression(new DatasetCompression().withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(ExcelDatasetTypeProperties.class);
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