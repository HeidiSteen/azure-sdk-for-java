// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ServiceNowSource;

public final class ServiceNowSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceNowSource model = BinaryData.fromString(
            "{\"type\":\"ServiceNowSource\",\"query\":\"dataqmdxcwxfmrmwd\",\"queryTimeout\":\"datapsypmthfv\",\"additionalColumns\":\"datalafcxdldhhkde\",\"sourceRetryCount\":\"datawpzhfxvl\",\"sourceRetryWait\":\"dataurhsmg\",\"maxConcurrentConnections\":\"databtuujcuavctxyrm\",\"disableMetricsCollection\":\"datahrzmy\",\"\":{\"xvotidlwmewrgu\":\"datanwa\"}}")
            .toObject(ServiceNowSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceNowSource model = new ServiceNowSource().withSourceRetryCount("datawpzhfxvl")
            .withSourceRetryWait("dataurhsmg").withMaxConcurrentConnections("databtuujcuavctxyrm")
            .withDisableMetricsCollection("datahrzmy").withQueryTimeout("datapsypmthfv")
            .withAdditionalColumns("datalafcxdldhhkde").withQuery("dataqmdxcwxfmrmwd");
        model = BinaryData.fromObject(model).toObject(ServiceNowSource.class);
    }
}
