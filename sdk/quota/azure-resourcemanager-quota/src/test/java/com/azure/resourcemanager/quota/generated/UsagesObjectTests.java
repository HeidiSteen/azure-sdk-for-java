// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quota.models.UsagesObject;
import com.azure.resourcemanager.quota.models.UsagesTypes;
import org.junit.jupiter.api.Assertions;

public final class UsagesObjectTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UsagesObject model = BinaryData.fromString("{\"value\":1667898231,\"usagesType\":\"Individual\"}")
            .toObject(UsagesObject.class);
        Assertions.assertEquals(1667898231, model.value());
        Assertions.assertEquals(UsagesTypes.INDIVIDUAL, model.usagesType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UsagesObject model = new UsagesObject().withValue(1667898231).withUsagesType(UsagesTypes.INDIVIDUAL);
        model = BinaryData.fromObject(model).toObject(UsagesObject.class);
        Assertions.assertEquals(1667898231, model.value());
        Assertions.assertEquals(UsagesTypes.INDIVIDUAL, model.usagesType());
    }
}
