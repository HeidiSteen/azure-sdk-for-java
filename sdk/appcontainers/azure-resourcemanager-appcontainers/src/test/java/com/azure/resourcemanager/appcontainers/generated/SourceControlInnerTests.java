// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.SourceControlInner;
import com.azure.resourcemanager.appcontainers.models.GithubActionConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SourceControlInnerTests {
    @Test
    public void testDeserialize() {
        SourceControlInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"operationState\":\"Failed\",\"repoUrl\":\"dnfwqzdzg\",\"branch\":\"la\",\"githubActionConfiguration\":{\"contextPath\":\"qlyvijo\",\"image\":\"iv\",\"publishType\":\"oyzunbixxr\",\"os\":\"kvcpwpgclr\",\"runtimeStack\":\"vtsoxf\",\"runtimeVersion\":\"enxpmyyefr\"}},\"id\":\"pdnqqskawaoqvmmb\",\"name\":\"pqfrtqlkz\",\"type\":\"egnitg\"}")
                .toObject(SourceControlInner.class);
        Assertions.assertEquals("dnfwqzdzg", model.repoUrl());
        Assertions.assertEquals("la", model.branch());
        Assertions.assertEquals("qlyvijo", model.githubActionConfiguration().contextPath());
        Assertions.assertEquals("iv", model.githubActionConfiguration().image());
        Assertions.assertEquals("oyzunbixxr", model.githubActionConfiguration().publishType());
        Assertions.assertEquals("kvcpwpgclr", model.githubActionConfiguration().os());
        Assertions.assertEquals("vtsoxf", model.githubActionConfiguration().runtimeStack());
        Assertions.assertEquals("enxpmyyefr", model.githubActionConfiguration().runtimeVersion());
    }

    @Test
    public void testSerialize() {
        SourceControlInner model =
            new SourceControlInner()
                .withRepoUrl("dnfwqzdzg")
                .withBranch("la")
                .withGithubActionConfiguration(
                    new GithubActionConfiguration()
                        .withContextPath("qlyvijo")
                        .withImage("iv")
                        .withPublishType("oyzunbixxr")
                        .withOs("kvcpwpgclr")
                        .withRuntimeStack("vtsoxf")
                        .withRuntimeVersion("enxpmyyefr"));
        model = BinaryData.fromObject(model).toObject(SourceControlInner.class);
        Assertions.assertEquals("dnfwqzdzg", model.repoUrl());
        Assertions.assertEquals("la", model.branch());
        Assertions.assertEquals("qlyvijo", model.githubActionConfiguration().contextPath());
        Assertions.assertEquals("iv", model.githubActionConfiguration().image());
        Assertions.assertEquals("oyzunbixxr", model.githubActionConfiguration().publishType());
        Assertions.assertEquals("kvcpwpgclr", model.githubActionConfiguration().os());
        Assertions.assertEquals("vtsoxf", model.githubActionConfiguration().runtimeStack());
        Assertions.assertEquals("enxpmyyefr", model.githubActionConfiguration().runtimeVersion());
    }
}