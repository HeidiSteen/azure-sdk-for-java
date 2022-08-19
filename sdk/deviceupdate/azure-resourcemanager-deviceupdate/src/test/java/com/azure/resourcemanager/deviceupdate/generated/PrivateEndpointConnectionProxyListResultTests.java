// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceupdate.fluent.models.PrivateEndpointConnectionProxyInner;
import com.azure.resourcemanager.deviceupdate.models.PrivateEndpointConnectionProxyListResult;
import com.azure.resourcemanager.deviceupdate.models.RemotePrivateEndpoint;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointConnectionProxyListResultTests {
    @Test
    public void testDeserialize() {
        PrivateEndpointConnectionProxyListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\"},\"eTag\":\"bxetqgtzxdpn\",\"remotePrivateEndpoint\":{\"id\":\"qwxrjfeallnw\",\"location\":\"bisnja\",\"immutableSubscriptionId\":\"mngnzscxaqw\",\"immutableResourceId\":\"chcbonqvpkvlrxnj\",\"vnetTrafficTag\":\"seiphe\",\"manualPrivateLinkServiceConnections\":[],\"privateLinkServiceConnections\":[],\"privateLinkServiceProxies\":[],\"connectionDetails\":[]},\"status\":\"yyien\",\"id\":\"bdlwtgrhpdjpj\",\"name\":\"masxazjpqyegu\",\"type\":\"lhbxxhejjzzvdud\"},{\"properties\":{\"provisioningState\":\"Creating\"},\"eTag\":\"hotwmcynpwlbjnp\",\"remotePrivateEndpoint\":{\"id\":\"ftadehxnltyfs\",\"location\":\"pusuesn\",\"immutableSubscriptionId\":\"dejbavo\",\"immutableResourceId\":\"zdmohctbqvu\",\"vnetTrafficTag\":\"xdn\",\"manualPrivateLinkServiceConnections\":[],\"privateLinkServiceConnections\":[],\"privateLinkServiceProxies\":[],\"connectionDetails\":[]},\"status\":\"ujjugwdkcglh\",\"id\":\"lazjdyggdtjixhbk\",\"name\":\"ofqweykhmenevfye\",\"type\":\"fwhybcibvy\"}],\"nextLink\":\"c\"}")
                .toObject(PrivateEndpointConnectionProxyListResult.class);
        Assertions.assertEquals("qwxrjfeallnw", model.value().get(0).remotePrivateEndpoint().id());
        Assertions.assertEquals("bisnja", model.value().get(0).remotePrivateEndpoint().location());
        Assertions.assertEquals("mngnzscxaqw", model.value().get(0).remotePrivateEndpoint().immutableSubscriptionId());
        Assertions.assertEquals("chcbonqvpkvlrxnj", model.value().get(0).remotePrivateEndpoint().immutableResourceId());
        Assertions.assertEquals("seiphe", model.value().get(0).remotePrivateEndpoint().vnetTrafficTag());
        Assertions.assertEquals("yyien", model.value().get(0).status());
        Assertions.assertEquals("c", model.nextLink());
    }

    @Test
    public void testSerialize() {
        PrivateEndpointConnectionProxyListResult model =
            new PrivateEndpointConnectionProxyListResult()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateEndpointConnectionProxyInner()
                                .withRemotePrivateEndpoint(
                                    new RemotePrivateEndpoint()
                                        .withId("qwxrjfeallnw")
                                        .withLocation("bisnja")
                                        .withImmutableSubscriptionId("mngnzscxaqw")
                                        .withImmutableResourceId("chcbonqvpkvlrxnj")
                                        .withVnetTrafficTag("seiphe")
                                        .withManualPrivateLinkServiceConnections(Arrays.asList())
                                        .withPrivateLinkServiceConnections(Arrays.asList())
                                        .withPrivateLinkServiceProxies(Arrays.asList())
                                        .withConnectionDetails(Arrays.asList()))
                                .withStatus("yyien"),
                            new PrivateEndpointConnectionProxyInner()
                                .withRemotePrivateEndpoint(
                                    new RemotePrivateEndpoint()
                                        .withId("ftadehxnltyfs")
                                        .withLocation("pusuesn")
                                        .withImmutableSubscriptionId("dejbavo")
                                        .withImmutableResourceId("zdmohctbqvu")
                                        .withVnetTrafficTag("xdn")
                                        .withManualPrivateLinkServiceConnections(Arrays.asList())
                                        .withPrivateLinkServiceConnections(Arrays.asList())
                                        .withPrivateLinkServiceProxies(Arrays.asList())
                                        .withConnectionDetails(Arrays.asList()))
                                .withStatus("ujjugwdkcglh")))
                .withNextLink("c");
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProxyListResult.class);
        Assertions.assertEquals("qwxrjfeallnw", model.value().get(0).remotePrivateEndpoint().id());
        Assertions.assertEquals("bisnja", model.value().get(0).remotePrivateEndpoint().location());
        Assertions.assertEquals("mngnzscxaqw", model.value().get(0).remotePrivateEndpoint().immutableSubscriptionId());
        Assertions.assertEquals("chcbonqvpkvlrxnj", model.value().get(0).remotePrivateEndpoint().immutableResourceId());
        Assertions.assertEquals("seiphe", model.value().get(0).remotePrivateEndpoint().vnetTrafficTag());
        Assertions.assertEquals("yyien", model.value().get(0).status());
        Assertions.assertEquals("c", model.nextLink());
    }
}