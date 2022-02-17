// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appconfiguration.fluent.models.ConfigurationStoreInner;
import com.azure.resourcemanager.appconfiguration.models.ApiKey;
import com.azure.resourcemanager.appconfiguration.models.ConfigurationStore;
import com.azure.resourcemanager.appconfiguration.models.ConfigurationStoreUpdateParameters;
import com.azure.resourcemanager.appconfiguration.models.CreateMode;
import com.azure.resourcemanager.appconfiguration.models.EncryptionProperties;
import com.azure.resourcemanager.appconfiguration.models.PrivateEndpointConnectionReference;
import com.azure.resourcemanager.appconfiguration.models.ProvisioningState;
import com.azure.resourcemanager.appconfiguration.models.PublicNetworkAccess;
import com.azure.resourcemanager.appconfiguration.models.RegenerateKeyParameters;
import com.azure.resourcemanager.appconfiguration.models.ResourceIdentity;
import com.azure.resourcemanager.appconfiguration.models.Sku;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ConfigurationStoreImpl
    implements ConfigurationStore, ConfigurationStore.Definition, ConfigurationStore.Update {
    private ConfigurationStoreInner innerObject;

    private final com.azure.resourcemanager.appconfiguration.AppConfigurationManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ResourceIdentity identity() {
        return this.innerModel().identity();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public OffsetDateTime creationDate() {
        return this.innerModel().creationDate();
    }

    public String endpoint() {
        return this.innerModel().endpoint();
    }

    public EncryptionProperties encryption() {
        return this.innerModel().encryption();
    }

    public List<PrivateEndpointConnectionReference> privateEndpointConnections() {
        List<PrivateEndpointConnectionReference> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public Boolean disableLocalAuth() {
        return this.innerModel().disableLocalAuth();
    }

    public Integer softDeleteRetentionInDays() {
        return this.innerModel().softDeleteRetentionInDays();
    }

    public Boolean enablePurgeProtection() {
        return this.innerModel().enablePurgeProtection();
    }

    public CreateMode createMode() {
        return this.innerModel().createMode();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ConfigurationStoreInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String configStoreName;

    private ConfigurationStoreUpdateParameters updateConfigStoreUpdateParameters;

    public ConfigurationStoreImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ConfigurationStore create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConfigurationStores()
                .create(resourceGroupName, configStoreName, this.innerModel(), Context.NONE);
        return this;
    }

    public ConfigurationStore create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConfigurationStores()
                .create(resourceGroupName, configStoreName, this.innerModel(), context);
        return this;
    }

    ConfigurationStoreImpl(
        String name, com.azure.resourcemanager.appconfiguration.AppConfigurationManager serviceManager) {
        this.innerObject = new ConfigurationStoreInner();
        this.serviceManager = serviceManager;
        this.configStoreName = name;
    }

    public ConfigurationStoreImpl update() {
        this.updateConfigStoreUpdateParameters = new ConfigurationStoreUpdateParameters();
        return this;
    }

    public ConfigurationStore apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConfigurationStores()
                .update(resourceGroupName, configStoreName, updateConfigStoreUpdateParameters, Context.NONE);
        return this;
    }

    public ConfigurationStore apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConfigurationStores()
                .update(resourceGroupName, configStoreName, updateConfigStoreUpdateParameters, context);
        return this;
    }

    ConfigurationStoreImpl(
        ConfigurationStoreInner innerObject,
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.configStoreName = Utils.getValueFromIdByName(innerObject.id(), "configurationStores");
    }

    public ConfigurationStore refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConfigurationStores()
                .getByResourceGroupWithResponse(resourceGroupName, configStoreName, Context.NONE)
                .getValue();
        return this;
    }

    public ConfigurationStore refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getConfigurationStores()
                .getByResourceGroupWithResponse(resourceGroupName, configStoreName, context)
                .getValue();
        return this;
    }

    public PagedIterable<ApiKey> listKeys() {
        return serviceManager.configurationStores().listKeys(resourceGroupName, configStoreName);
    }

    public PagedIterable<ApiKey> listKeys(String skipToken, Context context) {
        return serviceManager.configurationStores().listKeys(resourceGroupName, configStoreName, skipToken, context);
    }

    public ApiKey regenerateKey(RegenerateKeyParameters regenerateKeyParameters) {
        return serviceManager
            .configurationStores()
            .regenerateKey(resourceGroupName, configStoreName, regenerateKeyParameters);
    }

    public Response<ApiKey> regenerateKeyWithResponse(
        RegenerateKeyParameters regenerateKeyParameters, Context context) {
        return serviceManager
            .configurationStores()
            .regenerateKeyWithResponse(resourceGroupName, configStoreName, regenerateKeyParameters, context);
    }

    public ConfigurationStoreImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ConfigurationStoreImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ConfigurationStoreImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateConfigStoreUpdateParameters.withSku(sku);
            return this;
        }
    }

    public ConfigurationStoreImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateConfigStoreUpdateParameters.withTags(tags);
            return this;
        }
    }

    public ConfigurationStoreImpl withIdentity(ResourceIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateConfigStoreUpdateParameters.withIdentity(identity);
            return this;
        }
    }

    public ConfigurationStoreImpl withEncryption(EncryptionProperties encryption) {
        if (isInCreateMode()) {
            this.innerModel().withEncryption(encryption);
            return this;
        } else {
            this.updateConfigStoreUpdateParameters.withEncryption(encryption);
            return this;
        }
    }

    public ConfigurationStoreImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
            return this;
        } else {
            this.updateConfigStoreUpdateParameters.withPublicNetworkAccess(publicNetworkAccess);
            return this;
        }
    }

    public ConfigurationStoreImpl withDisableLocalAuth(Boolean disableLocalAuth) {
        if (isInCreateMode()) {
            this.innerModel().withDisableLocalAuth(disableLocalAuth);
            return this;
        } else {
            this.updateConfigStoreUpdateParameters.withDisableLocalAuth(disableLocalAuth);
            return this;
        }
    }

    public ConfigurationStoreImpl withSoftDeleteRetentionInDays(Integer softDeleteRetentionInDays) {
        this.innerModel().withSoftDeleteRetentionInDays(softDeleteRetentionInDays);
        return this;
    }

    public ConfigurationStoreImpl withEnablePurgeProtection(Boolean enablePurgeProtection) {
        this.innerModel().withEnablePurgeProtection(enablePurgeProtection);
        return this;
    }

    public ConfigurationStoreImpl withCreateMode(CreateMode createMode) {
        this.innerModel().withCreateMode(createMode);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
