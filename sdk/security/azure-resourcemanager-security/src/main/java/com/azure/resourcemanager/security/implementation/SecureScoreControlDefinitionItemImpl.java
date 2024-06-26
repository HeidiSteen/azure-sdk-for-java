// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.resourcemanager.security.fluent.models.SecureScoreControlDefinitionItemInner;
import com.azure.resourcemanager.security.models.AzureResourceLink;
import com.azure.resourcemanager.security.models.SecureScoreControlDefinitionItem;
import com.azure.resourcemanager.security.models.SecureScoreControlDefinitionSource;
import java.util.Collections;
import java.util.List;

public final class SecureScoreControlDefinitionItemImpl implements SecureScoreControlDefinitionItem {
    private SecureScoreControlDefinitionItemInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    SecureScoreControlDefinitionItemImpl(SecureScoreControlDefinitionItemInner innerObject,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public Integer maxScore() {
        return this.innerModel().maxScore();
    }

    public SecureScoreControlDefinitionSource source() {
        return this.innerModel().source();
    }

    public List<AzureResourceLink> assessmentDefinitions() {
        List<AzureResourceLink> inner = this.innerModel().assessmentDefinitions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SecureScoreControlDefinitionItemInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
