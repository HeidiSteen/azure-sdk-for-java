// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.CustomActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.CustomActivityReferenceObject;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CustomActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomActivityTypeProperties model = BinaryData.fromString(
            "{\"command\":\"datagvkqz\",\"resourceLinkedService\":{\"referenceName\":\"oslyu\",\"parameters\":{\"cffbsnlv\":\"dataejualugyu\",\"jdmesoxjkp\":\"datassyzwtzdyzufgnns\",\"pbiou\":\"databgfhjwchv\"}},\"folderPath\":\"dataoxbxtws\",\"referenceObjects\":{\"linkedServices\":[{\"referenceName\":\"ghlokvisqzmhe\",\"parameters\":{\"rtkegrtvwffvbvu\":\"dataioonnfj\",\"eavs\":\"datapy\",\"kani\":\"datazbzykksd\",\"twwbahivfosbr\":\"datadcjxgzpmwxvfrm\"}},{\"referenceName\":\"eywhlqydhh\",\"parameters\":{\"z\":\"datavhucawmhbqjll\"}},{\"referenceName\":\"qvnbxgkudioum\",\"parameters\":{\"qvzwummw\":\"databytzh\"}},{\"referenceName\":\"ax\",\"parameters\":{\"iwkqr\":\"dataihgcdujhz\",\"l\":\"datatrmi\"}}],\"datasets\":[{\"referenceName\":\"dukamtfkufvabci\",\"parameters\":{\"pliwgkozl\":\"datayf\"}},{\"referenceName\":\"sfrajpyuw\",\"parameters\":{\"ungzvytbq\":\"datafglll\"}}]},\"extendedProperties\":{\"aetgmmfdf\":\"datakuyyrcqsyqhugj\",\"epwyyeupkpyzaena\":\"dataq\",\"ygfgchlcbtxc\":\"datafyrlqiykh\"},\"retentionTimeInDays\":\"datakg\",\"autoUserSpecification\":\"datayklyhmymkcc\"}")
            .toObject(CustomActivityTypeProperties.class);
        Assertions.assertEquals("oslyu", model.resourceLinkedService().referenceName());
        Assertions.assertEquals("ghlokvisqzmhe", model.referenceObjects().linkedServices().get(0).referenceName());
        Assertions.assertEquals("dukamtfkufvabci", model.referenceObjects().datasets().get(0).referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomActivityTypeProperties model = new CustomActivityTypeProperties().withCommand("datagvkqz")
            .withResourceLinkedService(new LinkedServiceReference().withReferenceName("oslyu").withParameters(
                mapOf("cffbsnlv", "dataejualugyu", "jdmesoxjkp", "datassyzwtzdyzufgnns", "pbiou", "databgfhjwchv")))
            .withFolderPath("dataoxbxtws")
            .withReferenceObjects(new CustomActivityReferenceObject()
                .withLinkedServices(Arrays.asList(
                    new LinkedServiceReference().withReferenceName("ghlokvisqzmhe")
                        .withParameters(mapOf("rtkegrtvwffvbvu", "dataioonnfj", "eavs", "datapy", "kani",
                            "datazbzykksd", "twwbahivfosbr", "datadcjxgzpmwxvfrm")),
                    new LinkedServiceReference().withReferenceName("eywhlqydhh")
                        .withParameters(mapOf("z", "datavhucawmhbqjll")),
                    new LinkedServiceReference().withReferenceName("qvnbxgkudioum")
                        .withParameters(mapOf("qvzwummw", "databytzh")),
                    new LinkedServiceReference().withReferenceName("ax")
                        .withParameters(mapOf("iwkqr", "dataihgcdujhz", "l", "datatrmi"))))
                .withDatasets(Arrays.asList(
                    new DatasetReference().withReferenceName("dukamtfkufvabci")
                        .withParameters(mapOf("pliwgkozl", "datayf")),
                    new DatasetReference().withReferenceName("sfrajpyuw")
                        .withParameters(mapOf("ungzvytbq", "datafglll")))))
            .withExtendedProperties(
                mapOf("aetgmmfdf", "datakuyyrcqsyqhugj", "epwyyeupkpyzaena", "dataq", "ygfgchlcbtxc", "datafyrlqiykh"))
            .withRetentionTimeInDays("datakg").withAutoUserSpecification("datayklyhmymkcc");
        model = BinaryData.fromObject(model).toObject(CustomActivityTypeProperties.class);
        Assertions.assertEquals("oslyu", model.resourceLinkedService().referenceName());
        Assertions.assertEquals("ghlokvisqzmhe", model.referenceObjects().linkedServices().get(0).referenceName());
        Assertions.assertEquals("dukamtfkufvabci", model.referenceObjects().datasets().get(0).referenceName());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
