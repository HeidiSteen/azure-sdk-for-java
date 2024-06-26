// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mariadb.fluent.models.DatabaseProperties;
import org.junit.jupiter.api.Assertions;

public final class DatabasePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabaseProperties model =
            BinaryData
                .fromString("{\"charset\":\"jpgd\",\"collation\":\"ocjjxhvpmouexh\"}")
                .toObject(DatabaseProperties.class);
        Assertions.assertEquals("jpgd", model.charset());
        Assertions.assertEquals("ocjjxhvpmouexh", model.collation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabaseProperties model = new DatabaseProperties().withCharset("jpgd").withCollation("ocjjxhvpmouexh");
        model = BinaryData.fromObject(model).toObject(DatabaseProperties.class);
        Assertions.assertEquals("jpgd", model.charset());
        Assertions.assertEquals("ocjjxhvpmouexh", model.collation());
    }
}
