// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.DppWorkerRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DppWorkerRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DppWorkerRequest model = BinaryData.fromString(
            "{\"subscriptionId\":\"xt\",\"uri\":\"umh\",\"headers\":{\"qpvuzlmvfelf\":[\"kkxwslol\"]},\"supportedGroupVersions\":[\"plcrpwjxeznoig\",\"rnjwmw\",\"pn\",\"saz\"],\"cultureInfo\":\"joqkagfhsxt\",\"parameters\":{\"mkqjj\":\"gzxnfaazpxdtnk\",\"pyouaibrebqaays\":\"wuenvr\"},\"httpMethod\":\"ixqtn\"}")
            .toObject(DppWorkerRequest.class);
        Assertions.assertEquals("xt", model.subscriptionId());
        Assertions.assertEquals("umh", model.uri());
        Assertions.assertEquals("kkxwslol", model.headers().get("qpvuzlmvfelf").get(0));
        Assertions.assertEquals("plcrpwjxeznoig", model.supportedGroupVersions().get(0));
        Assertions.assertEquals("joqkagfhsxt", model.cultureInfo());
        Assertions.assertEquals("gzxnfaazpxdtnk", model.parameters().get("mkqjj"));
        Assertions.assertEquals("ixqtn", model.httpMethod());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DppWorkerRequest model = new DppWorkerRequest().withSubscriptionId("xt").withUri("umh")
            .withHeaders(mapOf("qpvuzlmvfelf", Arrays.asList("kkxwslol")))
            .withSupportedGroupVersions(Arrays.asList("plcrpwjxeznoig", "rnjwmw", "pn", "saz"))
            .withCultureInfo("joqkagfhsxt")
            .withParameters(mapOf("mkqjj", "gzxnfaazpxdtnk", "pyouaibrebqaays", "wuenvr")).withHttpMethod("ixqtn");
        model = BinaryData.fromObject(model).toObject(DppWorkerRequest.class);
        Assertions.assertEquals("xt", model.subscriptionId());
        Assertions.assertEquals("umh", model.uri());
        Assertions.assertEquals("kkxwslol", model.headers().get("qpvuzlmvfelf").get(0));
        Assertions.assertEquals("plcrpwjxeznoig", model.supportedGroupVersions().get(0));
        Assertions.assertEquals("joqkagfhsxt", model.cultureInfo());
        Assertions.assertEquals("gzxnfaazpxdtnk", model.parameters().get("mkqjj"));
        Assertions.assertEquals("ixqtn", model.httpMethod());
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
