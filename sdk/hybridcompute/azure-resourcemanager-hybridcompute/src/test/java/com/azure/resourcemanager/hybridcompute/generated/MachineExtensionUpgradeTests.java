// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.ExtensionTargetProperties;
import com.azure.resourcemanager.hybridcompute.models.MachineExtensionUpgrade;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MachineExtensionUpgradeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MachineExtensionUpgrade model =
            BinaryData
                .fromString(
                    "{\"extensionTargets\":{\"zg\":{\"targetVersion\":\"j\"},\"xongmtsavjcbpwxq\":{\"targetVersion\":\"zmh\"},\"yvxqtayriwwroy\":{\"targetVersion\":\"rknftguvriuhprwm\"},\"mefqsgzvahapjyzh\":{\"targetVersion\":\"exrmcqibycnojvk\"}}}")
                .toObject(MachineExtensionUpgrade.class);
        Assertions.assertEquals("j", model.extensionTargets().get("zg").targetVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MachineExtensionUpgrade model =
            new MachineExtensionUpgrade()
                .withExtensionTargets(
                    mapOf(
                        "zg",
                        new ExtensionTargetProperties().withTargetVersion("j"),
                        "xongmtsavjcbpwxq",
                        new ExtensionTargetProperties().withTargetVersion("zmh"),
                        "yvxqtayriwwroy",
                        new ExtensionTargetProperties().withTargetVersion("rknftguvriuhprwm"),
                        "mefqsgzvahapjyzh",
                        new ExtensionTargetProperties().withTargetVersion("exrmcqibycnojvk")));
        model = BinaryData.fromObject(model).toObject(MachineExtensionUpgrade.class);
        Assertions.assertEquals("j", model.extensionTargets().get("zg").targetVersion());
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
