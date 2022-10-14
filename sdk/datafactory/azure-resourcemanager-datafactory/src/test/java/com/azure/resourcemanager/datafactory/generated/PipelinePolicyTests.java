// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PipelineElapsedTimeMetricPolicy;
import com.azure.resourcemanager.datafactory.models.PipelinePolicy;
import org.junit.jupiter.api.Test;

public final class PipelinePolicyTests {
    @Test
    public void testDeserialize() {
        PipelinePolicy model = BinaryData.fromString("{\"elapsedTimeMetric\":{}}").toObject(PipelinePolicy.class);
    }

    @Test
    public void testSerialize() {
        PipelinePolicy model = new PipelinePolicy().withElapsedTimeMetric(new PipelineElapsedTimeMetricPolicy());
        model = BinaryData.fromObject(model).toObject(PipelinePolicy.class);
    }
}