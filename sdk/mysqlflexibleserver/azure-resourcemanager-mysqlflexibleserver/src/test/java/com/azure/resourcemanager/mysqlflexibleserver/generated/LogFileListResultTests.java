// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.LogFileInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.LogFileListResult;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LogFileListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogFileListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"sizeInKB\":8576241637170958939,\"createdTime\":\"2021-04-30T01:01:25Z\",\"type\":\"ohctbqvudwx\",\"lastModifiedTime\":\"2021-03-23T22:55:01Z\",\"url\":\"vo\"},\"id\":\"ujjugwdkcglh\",\"name\":\"lazjdyggdtjixhbk\",\"type\":\"ofqweykhmenevfye\"}],\"nextLink\":\"whybcib\"}")
                .toObject(LogFileListResult.class);
        Assertions.assertEquals(8576241637170958939L, model.value().get(0).sizeInKB());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-30T01:01:25Z"), model.value().get(0).createdTime());
        Assertions.assertEquals("ohctbqvudwx", model.value().get(0).typePropertiesType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-23T22:55:01Z"), model.value().get(0).lastModifiedTime());
        Assertions.assertEquals("vo", model.value().get(0).url());
        Assertions.assertEquals("whybcib", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogFileListResult model =
            new LogFileListResult()
                .withValue(
                    Arrays
                        .asList(
                            new LogFileInner()
                                .withSizeInKB(8576241637170958939L)
                                .withCreatedTime(OffsetDateTime.parse("2021-04-30T01:01:25Z"))
                                .withTypePropertiesType("ohctbqvudwx")
                                .withLastModifiedTime(OffsetDateTime.parse("2021-03-23T22:55:01Z"))
                                .withUrl("vo")))
                .withNextLink("whybcib");
        model = BinaryData.fromObject(model).toObject(LogFileListResult.class);
        Assertions.assertEquals(8576241637170958939L, model.value().get(0).sizeInKB());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-30T01:01:25Z"), model.value().get(0).createdTime());
        Assertions.assertEquals("ohctbqvudwx", model.value().get(0).typePropertiesType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-23T22:55:01Z"), model.value().get(0).lastModifiedTime());
        Assertions.assertEquals("vo", model.value().get(0).url());
        Assertions.assertEquals("whybcib", model.nextLink());
    }
}
