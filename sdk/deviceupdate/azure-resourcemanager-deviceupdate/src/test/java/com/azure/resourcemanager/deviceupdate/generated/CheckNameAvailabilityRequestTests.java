// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceupdate.models.CheckNameAvailabilityRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CheckNameAvailabilityRequestTests {
    @Test
    public void testDeserialize() {
        CheckNameAvailabilityRequest model =
            BinaryData
                .fromString("{\"name\":\"mhquvgjxp\",\"type\":\"czmehmtzopbsp\"}")
                .toObject(CheckNameAvailabilityRequest.class);
        Assertions.assertEquals("mhquvgjxp", model.name());
        Assertions.assertEquals("czmehmtzopbsp", model.type());
    }

    @Test
    public void testSerialize() {
        CheckNameAvailabilityRequest model =
            new CheckNameAvailabilityRequest().withName("mhquvgjxp").withType("czmehmtzopbsp");
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityRequest.class);
        Assertions.assertEquals("mhquvgjxp", model.name());
        Assertions.assertEquals("czmehmtzopbsp", model.type());
    }
}