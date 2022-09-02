// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

/** Samples for Deployments Create. */
public final class DeploymentsCreateSamples {
    /*
     * x-ms-original-file: specification/nginx/resource-manager/NGINX.NGINXPLUS/stable/2022-08-01/examples/Deployments_Create.json
     */
    /**
     * Sample code: Deployments_Create.
     *
     * @param manager Entry point to NginxManager.
     */
    public static void deploymentsCreate(com.azure.resourcemanager.nginx.NginxManager manager) {
        manager
            .deployments()
            .define("myDeployment")
            .withRegion((String) null)
            .withExistingResourceGroup("myResourceGroup")
            .create();
    }
}