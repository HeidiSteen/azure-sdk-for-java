// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for ManagedInstanceAdministrators Get. */
public final class ManagedInstanceAdministratorsGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2017-03-01-preview/examples/ManagedInstanceAdministratorGet.json
     */
    /**
     * Sample code: Get administrator of managed instance.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAdministratorOfManagedInstance(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getManagedInstanceAdministrators()
            .getWithResponse("Default-SQL-SouthEastAsia", "managedInstance", Context.NONE);
    }
}
