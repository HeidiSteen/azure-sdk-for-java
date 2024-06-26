// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureBackupServerContainer;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.DpmContainerExtendedInfo;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureBackupServerContainerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupServerContainer model = BinaryData.fromString(
            "{\"containerType\":\"AzureBackupServerContainer\",\"canReRegister\":true,\"containerId\":\"pfppd\",\"protectedItemCount\":1149215667269510415,\"dpmAgentVersion\":\"gahxkumasjcaa\",\"dpmServers\":[\"mmcpug\",\"ehqepvufhbzehe\",\"hoqhnl\",\"qnbldxe\"],\"upgradeAvailable\":false,\"protectionStatus\":\"schori\",\"extendedInfo\":{\"lastRefreshedAt\":\"2021-11-20T05:00:31Z\"},\"friendlyName\":\"rmoucsofl\",\"backupManagementType\":\"AzureBackupServer\",\"registrationStatus\":\"iyfc\",\"healthStatus\":\"beolh\",\"protectableObjectType\":\"lvbmxuqibsxtkcu\"}")
            .toObject(AzureBackupServerContainer.class);
        Assertions.assertEquals("rmoucsofl", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_BACKUP_SERVER, model.backupManagementType());
        Assertions.assertEquals("iyfc", model.registrationStatus());
        Assertions.assertEquals("beolh", model.healthStatus());
        Assertions.assertEquals("lvbmxuqibsxtkcu", model.protectableObjectType());
        Assertions.assertEquals(true, model.canReRegister());
        Assertions.assertEquals("pfppd", model.containerId());
        Assertions.assertEquals(1149215667269510415L, model.protectedItemCount());
        Assertions.assertEquals("gahxkumasjcaa", model.dpmAgentVersion());
        Assertions.assertEquals("mmcpug", model.dpmServers().get(0));
        Assertions.assertEquals(false, model.upgradeAvailable());
        Assertions.assertEquals("schori", model.protectionStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-20T05:00:31Z"), model.extendedInfo().lastRefreshedAt());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupServerContainer model = new AzureBackupServerContainer().withFriendlyName("rmoucsofl")
            .withBackupManagementType(BackupManagementType.AZURE_BACKUP_SERVER).withRegistrationStatus("iyfc")
            .withHealthStatus("beolh").withProtectableObjectType("lvbmxuqibsxtkcu").withCanReRegister(true)
            .withContainerId("pfppd").withProtectedItemCount(1149215667269510415L).withDpmAgentVersion("gahxkumasjcaa")
            .withDpmServers(Arrays.asList("mmcpug", "ehqepvufhbzehe", "hoqhnl", "qnbldxe")).withUpgradeAvailable(false)
            .withProtectionStatus("schori").withExtendedInfo(
                new DpmContainerExtendedInfo().withLastRefreshedAt(OffsetDateTime.parse("2021-11-20T05:00:31Z")));
        model = BinaryData.fromObject(model).toObject(AzureBackupServerContainer.class);
        Assertions.assertEquals("rmoucsofl", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_BACKUP_SERVER, model.backupManagementType());
        Assertions.assertEquals("iyfc", model.registrationStatus());
        Assertions.assertEquals("beolh", model.healthStatus());
        Assertions.assertEquals("lvbmxuqibsxtkcu", model.protectableObjectType());
        Assertions.assertEquals(true, model.canReRegister());
        Assertions.assertEquals("pfppd", model.containerId());
        Assertions.assertEquals(1149215667269510415L, model.protectedItemCount());
        Assertions.assertEquals("gahxkumasjcaa", model.dpmAgentVersion());
        Assertions.assertEquals("mmcpug", model.dpmServers().get(0));
        Assertions.assertEquals(false, model.upgradeAvailable());
        Assertions.assertEquals("schori", model.protectionStatus());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-20T05:00:31Z"), model.extendedInfo().lastRefreshedAt());
    }
}
