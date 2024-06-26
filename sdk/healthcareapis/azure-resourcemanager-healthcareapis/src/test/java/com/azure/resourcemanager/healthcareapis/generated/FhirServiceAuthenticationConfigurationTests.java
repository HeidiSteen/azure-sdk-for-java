// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.models.FhirServiceAuthenticationConfiguration;
import org.junit.jupiter.api.Assertions;

public final class FhirServiceAuthenticationConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FhirServiceAuthenticationConfiguration model = BinaryData
            .fromString("{\"authority\":\"cbcuejrjxgciqi\",\"audience\":\"hos\",\"smartProxyEnabled\":true}")
            .toObject(FhirServiceAuthenticationConfiguration.class);
        Assertions.assertEquals("cbcuejrjxgciqi", model.authority());
        Assertions.assertEquals("hos", model.audience());
        Assertions.assertEquals(true, model.smartProxyEnabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FhirServiceAuthenticationConfiguration model = new FhirServiceAuthenticationConfiguration()
            .withAuthority("cbcuejrjxgciqi").withAudience("hos").withSmartProxyEnabled(true);
        model = BinaryData.fromObject(model).toObject(FhirServiceAuthenticationConfiguration.class);
        Assertions.assertEquals("cbcuejrjxgciqi", model.authority());
        Assertions.assertEquals("hos", model.audience());
        Assertions.assertEquals(true, model.smartProxyEnabled());
    }
}
