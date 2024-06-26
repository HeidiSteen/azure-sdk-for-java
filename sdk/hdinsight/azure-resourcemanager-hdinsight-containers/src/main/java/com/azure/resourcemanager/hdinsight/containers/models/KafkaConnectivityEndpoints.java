// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Kafka bootstrap server and broker related connectivity endpoints.
 */
@Fluent
public final class KafkaConnectivityEndpoints {
    /*
     * bootstrap server connectivity endpoint.
     */
    @JsonProperty(value = "bootstrapServerEndpoint")
    private String bootstrapServerEndpoint;

    /*
     * Kafka broker endpoint list.
     */
    @JsonProperty(value = "brokerEndpoints")
    private List<String> brokerEndpoints;

    /**
     * Creates an instance of KafkaConnectivityEndpoints class.
     */
    public KafkaConnectivityEndpoints() {
    }

    /**
     * Get the bootstrapServerEndpoint property: bootstrap server connectivity endpoint.
     * 
     * @return the bootstrapServerEndpoint value.
     */
    public String bootstrapServerEndpoint() {
        return this.bootstrapServerEndpoint;
    }

    /**
     * Set the bootstrapServerEndpoint property: bootstrap server connectivity endpoint.
     * 
     * @param bootstrapServerEndpoint the bootstrapServerEndpoint value to set.
     * @return the KafkaConnectivityEndpoints object itself.
     */
    public KafkaConnectivityEndpoints withBootstrapServerEndpoint(String bootstrapServerEndpoint) {
        this.bootstrapServerEndpoint = bootstrapServerEndpoint;
        return this;
    }

    /**
     * Get the brokerEndpoints property: Kafka broker endpoint list.
     * 
     * @return the brokerEndpoints value.
     */
    public List<String> brokerEndpoints() {
        return this.brokerEndpoints;
    }

    /**
     * Set the brokerEndpoints property: Kafka broker endpoint list.
     * 
     * @param brokerEndpoints the brokerEndpoints value to set.
     * @return the KafkaConnectivityEndpoints object itself.
     */
    public KafkaConnectivityEndpoints withBrokerEndpoints(List<String> brokerEndpoints) {
        this.brokerEndpoints = brokerEndpoints;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
