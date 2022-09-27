// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for SecurityConnectorApplications List. */
public final class SecurityConnectorApplicationsListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2022-07-01-preview/examples/Applications/ListBySecurityConnectorApplications_example.json
     */
    /**
     * Sample code: List security applications by security connector level scope.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void listSecurityApplicationsBySecurityConnectorLevelScope(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.securityConnectorApplications().list("gcpResourceGroup", "gcpconnector", Context.NONE);
    }
}