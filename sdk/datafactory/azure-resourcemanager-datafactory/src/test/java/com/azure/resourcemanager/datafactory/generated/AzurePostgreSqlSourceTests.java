// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzurePostgreSqlSource;

public final class AzurePostgreSqlSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzurePostgreSqlSource model = BinaryData.fromString(
            "{\"type\":\"AzurePostgreSqlSource\",\"query\":\"datahbfttptsdee\",\"queryTimeout\":\"dataovanag\",\"additionalColumns\":\"dataacsfbmb\",\"sourceRetryCount\":\"dataefqku\",\"sourceRetryWait\":\"datayumoamqxwluslxyt\",\"maxConcurrentConnections\":\"databjledjxblobknfpd\",\"disableMetricsCollection\":\"datahzgj\",\"\":{\"ccypxsrhbqlbnufl\":\"datamctbg\",\"xhbpyoqfbj\":\"datazawkkz\",\"jpjnhwwyhx\":\"dataclboi\",\"hhw\":\"dataythxzrvjfsmfk\"}}")
            .toObject(AzurePostgreSqlSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzurePostgreSqlSource model
            = new AzurePostgreSqlSource().withSourceRetryCount("dataefqku").withSourceRetryWait("datayumoamqxwluslxyt")
                .withMaxConcurrentConnections("databjledjxblobknfpd").withDisableMetricsCollection("datahzgj")
                .withQueryTimeout("dataovanag").withAdditionalColumns("dataacsfbmb").withQuery("datahbfttptsdee");
        model = BinaryData.fromObject(model).toObject(AzurePostgreSqlSource.class);
    }
}
