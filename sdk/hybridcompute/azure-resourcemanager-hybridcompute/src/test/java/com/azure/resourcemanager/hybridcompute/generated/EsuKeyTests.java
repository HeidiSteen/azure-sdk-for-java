// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.EsuKey;
import org.junit.jupiter.api.Assertions;

public final class EsuKeyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EsuKey model =
            BinaryData.fromString("{\"sku\":\"ltyfsop\",\"licenseStatus\":\"suesnzw\"}").toObject(EsuKey.class);
        Assertions.assertEquals("ltyfsop", model.sku());
        Assertions.assertEquals("suesnzw", model.licenseStatus());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EsuKey model = new EsuKey().withSku("ltyfsop").withLicenseStatus("suesnzw");
        model = BinaryData.fromObject(model).toObject(EsuKey.class);
        Assertions.assertEquals("ltyfsop", model.sku());
        Assertions.assertEquals("suesnzw", model.licenseStatus());
    }
}
