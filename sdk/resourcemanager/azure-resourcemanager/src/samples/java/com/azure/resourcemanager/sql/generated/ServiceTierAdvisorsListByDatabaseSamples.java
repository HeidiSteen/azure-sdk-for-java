// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for ServiceTierAdvisors ListByDatabase. */
public final class ServiceTierAdvisorsListByDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2014-04-01/examples/ServiceTierAdvisorList.json
     */
    /**
     * Sample code: Get a list of a service tier advisors.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAListOfAServiceTierAdvisors(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getServiceTierAdvisors()
            .listByDatabase("sqlcrudtest-6852", "sqlcrudtest-2080", "sqlcrudtest-9187", Context.NONE);
    }
}
