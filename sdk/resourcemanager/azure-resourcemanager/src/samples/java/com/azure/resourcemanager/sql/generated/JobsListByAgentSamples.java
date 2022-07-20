// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for Jobs ListByAgent. */
public final class JobsListByAgentSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2017-03-01-preview/examples/ListJobsByAgent.json
     */
    /**
     * Sample code: List jobs in a job agent.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listJobsInAJobAgent(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getJobs().listByAgent("group1", "server1", "agent1", Context.NONE);
    }
}
