// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.ServerAzureADAdministratorInner;
import com.azure.resourcemanager.sql.models.AdministratorName;
import com.azure.resourcemanager.sql.models.AdministratorType;
import java.util.UUID;

/** Samples for ServerAzureADAdministrators CreateOrUpdate. */
public final class ServerAzureADAdministratorsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2019-06-01-preview/examples/AdministratorCreateOrUpdate.json
     */
    /**
     * Sample code: Creates or updates an existing Azure Active Directory administrator.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createsOrUpdatesAnExistingAzureActiveDirectoryAdministrator(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServerAzureADAdministrators()
            .createOrUpdate(
                "sqlcrudtest-4799",
                "sqlcrudtest-6440",
                AdministratorName.ACTIVE_DIRECTORY,
                new ServerAzureADAdministratorInner()
                    .withAdministratorType(AdministratorType.ACTIVE_DIRECTORY)
                    .withLogin("bob@contoso.com")
                    .withSid(UUID.fromString("c6b82b90-a647-49cb-8a62-0d2d3cb7ac7c"))
                    .withTenantId(UUID.fromString("c6b82b90-a647-49cb-8a62-0d2d3cb7ac7c"))
                    .withAzureADOnlyAuthentication(true),
                Context.NONE);
    }
}
