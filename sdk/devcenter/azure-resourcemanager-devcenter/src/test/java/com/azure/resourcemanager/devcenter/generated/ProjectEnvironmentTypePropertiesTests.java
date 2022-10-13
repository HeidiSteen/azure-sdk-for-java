// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.ProjectEnvironmentTypeProperties;
import com.azure.resourcemanager.devcenter.models.EnableStatus;
import com.azure.resourcemanager.devcenter.models.EnvironmentRole;
import com.azure.resourcemanager.devcenter.models.ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment;
import com.azure.resourcemanager.devcenter.models.UserRoleAssignmentValue;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ProjectEnvironmentTypePropertiesTests {
    @Test
    public void testDeserialize() {
        ProjectEnvironmentTypeProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"oizpostmgrcfbun\",\"deploymentTargetId\":\"fqjhhkxbpvjymj\",\"status\":\"Disabled\",\"creatorRoleAssignment\":{\"roles\":{\"swbxqz\":{\"roleName\":\"u\",\"description\":\"vkr\"}}},\"userRoleAssignments\":{\"auvjfdxxivet\":{\"roles\":{}}}}")
                .toObject(ProjectEnvironmentTypeProperties.class);
        Assertions.assertEquals("fqjhhkxbpvjymj", model.deploymentTargetId());
        Assertions.assertEquals(EnableStatus.DISABLED, model.status());
    }

    @Test
    public void testSerialize() {
        ProjectEnvironmentTypeProperties model =
            new ProjectEnvironmentTypeProperties()
                .withDeploymentTargetId("fqjhhkxbpvjymj")
                .withStatus(EnableStatus.DISABLED)
                .withCreatorRoleAssignment(
                    new ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment()
                        .withRoles(mapOf("swbxqz", new EnvironmentRole())))
                .withUserRoleAssignments(mapOf("auvjfdxxivet", new UserRoleAssignmentValue().withRoles(mapOf())));
        model = BinaryData.fromObject(model).toObject(ProjectEnvironmentTypeProperties.class);
        Assertions.assertEquals("fqjhhkxbpvjymj", model.deploymentTargetId());
        Assertions.assertEquals(EnableStatus.DISABLED, model.status());
    }

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