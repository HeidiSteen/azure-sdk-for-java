// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.models.AzureOperatorNexusClusterNfviDetails;
import com.azure.resourcemanager.hybridnetwork.models.ReferencedResource;
import org.junit.jupiter.api.Assertions;

public final class AzureOperatorNexusClusterNfviDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureOperatorNexusClusterNfviDetails model = BinaryData.fromString(
            "{\"nfviType\":\"AzureOperatorNexus\",\"customLocationReference\":{\"id\":\"zhraglkafh\"},\"name\":\"qjujeickpzvcp\"}")
            .toObject(AzureOperatorNexusClusterNfviDetails.class);
        Assertions.assertEquals("qjujeickpzvcp", model.name());
        Assertions.assertEquals("zhraglkafh", model.customLocationReference().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureOperatorNexusClusterNfviDetails model = new AzureOperatorNexusClusterNfviDetails()
            .withName("qjujeickpzvcp").withCustomLocationReference(new ReferencedResource().withId("zhraglkafh"));
        model = BinaryData.fromObject(model).toObject(AzureOperatorNexusClusterNfviDetails.class);
        Assertions.assertEquals("qjujeickpzvcp", model.name());
        Assertions.assertEquals("zhraglkafh", model.customLocationReference().id());
    }
}
