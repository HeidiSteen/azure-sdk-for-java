// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.BuiltInInfoType;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class BuiltInInfoTypeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BuiltInInfoType model = BinaryData
            .fromString("{\"name\":\"p\",\"id\":\"300e4bbd-2662-4630-bf00-451d3f52ffd7\",\"type\":\"xelnwc\"}")
            .toObject(BuiltInInfoType.class);
        Assertions.assertEquals("p", model.name());
        Assertions.assertEquals(UUID.fromString("300e4bbd-2662-4630-bf00-451d3f52ffd7"), model.id());
        Assertions.assertEquals("xelnwc", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BuiltInInfoType model = new BuiltInInfoType().withName("p")
            .withId(UUID.fromString("300e4bbd-2662-4630-bf00-451d3f52ffd7")).withType("xelnwc");
        model = BinaryData.fromObject(model).toObject(BuiltInInfoType.class);
        Assertions.assertEquals("p", model.name());
        Assertions.assertEquals(UUID.fromString("300e4bbd-2662-4630-bf00-451d3f52ffd7"), model.id());
        Assertions.assertEquals("xelnwc", model.type());
    }
}
