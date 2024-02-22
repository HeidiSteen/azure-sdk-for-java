// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apicenter.fluent.models.MetadataSchemaExportResultInner;
import com.azure.resourcemanager.apicenter.models.MetadataSchemaExportFormat;
import org.junit.jupiter.api.Assertions;

public final class MetadataSchemaExportResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MetadataSchemaExportResultInner model
            = BinaryData.fromString("{\"format\":\"inline\",\"value\":\"cwrwclxxwrljdous\"}")
                .toObject(MetadataSchemaExportResultInner.class);
        Assertions.assertEquals(MetadataSchemaExportFormat.INLINE, model.format());
        Assertions.assertEquals("cwrwclxxwrljdous", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MetadataSchemaExportResultInner model = new MetadataSchemaExportResultInner()
            .withFormat(MetadataSchemaExportFormat.INLINE).withValue("cwrwclxxwrljdous");
        model = BinaryData.fromObject(model).toObject(MetadataSchemaExportResultInner.class);
        Assertions.assertEquals(MetadataSchemaExportFormat.INLINE, model.format());
        Assertions.assertEquals("cwrwclxxwrljdous", model.value());
    }
}
