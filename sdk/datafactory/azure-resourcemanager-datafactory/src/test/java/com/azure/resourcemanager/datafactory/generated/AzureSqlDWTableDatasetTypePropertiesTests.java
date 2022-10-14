// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzureSqlDWTableDatasetTypeProperties;
import org.junit.jupiter.api.Test;

public final class AzureSqlDWTableDatasetTypePropertiesTests {
    @Test
    public void testDeserialize() {
        AzureSqlDWTableDatasetTypeProperties model =
            BinaryData.fromString("{}").toObject(AzureSqlDWTableDatasetTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        AzureSqlDWTableDatasetTypeProperties model = new AzureSqlDWTableDatasetTypeProperties();
        model = BinaryData.fromObject(model).toObject(AzureSqlDWTableDatasetTypeProperties.class);
    }
}