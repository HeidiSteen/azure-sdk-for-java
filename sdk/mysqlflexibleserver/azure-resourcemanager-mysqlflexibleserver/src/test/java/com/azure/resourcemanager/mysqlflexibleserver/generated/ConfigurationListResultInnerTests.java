// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ConfigurationInner;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ConfigurationListResultInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.ConfigurationSource;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ConfigurationListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfigurationListResultInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"value\":\"xklrypl\",\"currentValue\":\"kbasyypn\",\"description\":\"hsgcbacphejkot\",\"documentationLink\":\"qgoulznd\",\"defaultValue\":\"kwy\",\"dataType\":\"gfgibm\",\"allowedValues\":\"gakeqsr\",\"source\":\"user-override\",\"isReadOnly\":\"False\",\"isConfigPendingRestart\":\"True\",\"isDynamicConfig\":\"True\"},\"id\":\"tbciqfouflmm\",\"name\":\"kzsmodm\",\"type\":\"lougpbkw\"},{\"properties\":{\"value\":\"tduqktapspwgcuer\",\"currentValue\":\"mkdo\",\"description\":\"qw\",\"documentationLink\":\"mdgbbjfdd\",\"defaultValue\":\"bmbexppbhtqqro\",\"dataType\":\"p\",\"allowedValues\":\"s\",\"source\":\"system-default\",\"isReadOnly\":\"True\",\"isConfigPendingRestart\":\"False\",\"isDynamicConfig\":\"False\"},\"id\":\"yjgzjaoyfhrtxiln\",\"name\":\"rkujy\",\"type\":\"vlejuvfqa\"}],\"nextLink\":\"lyxwjkcprbnwbx\"}")
                .toObject(ConfigurationListResultInner.class);
        Assertions.assertEquals("xklrypl", model.value().get(0).value());
        Assertions.assertEquals("kbasyypn", model.value().get(0).currentValue());
        Assertions.assertEquals(ConfigurationSource.USER_OVERRIDE, model.value().get(0).source());
        Assertions.assertEquals("lyxwjkcprbnwbx", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfigurationListResultInner model =
            new ConfigurationListResultInner()
                .withValue(
                    Arrays
                        .asList(
                            new ConfigurationInner()
                                .withValue("xklrypl")
                                .withCurrentValue("kbasyypn")
                                .withSource(ConfigurationSource.USER_OVERRIDE),
                            new ConfigurationInner()
                                .withValue("tduqktapspwgcuer")
                                .withCurrentValue("mkdo")
                                .withSource(ConfigurationSource.SYSTEM_DEFAULT)))
                .withNextLink("lyxwjkcprbnwbx");
        model = BinaryData.fromObject(model).toObject(ConfigurationListResultInner.class);
        Assertions.assertEquals("xklrypl", model.value().get(0).value());
        Assertions.assertEquals("kbasyypn", model.value().get(0).currentValue());
        Assertions.assertEquals(ConfigurationSource.USER_OVERRIDE, model.value().get(0).source());
        Assertions.assertEquals("lyxwjkcprbnwbx", model.nextLink());
    }
}
