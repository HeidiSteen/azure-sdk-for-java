/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.NotificationRecipientEmails;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.RecipientEmailCollection;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.NotificationName;

class NotificationRecipientEmailsImpl extends WrapperImpl<NotificationRecipientEmailsInner> implements NotificationRecipientEmails {
    private final ApiManagementManager manager;

    NotificationRecipientEmailsImpl(ApiManagementManager manager) {
        super(manager.inner().notificationRecipientEmails());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public RecipientEmailContractImpl define(String name) {
        return wrapModel(name);
    }

    private RecipientEmailContractImpl wrapModel(RecipientEmailContractInner inner) {
        return  new RecipientEmailContractImpl(inner, manager());
    }

    private RecipientEmailContractImpl wrapModel(String name) {
        return new RecipientEmailContractImpl(name, this.manager());
    }

    @Override
    public Observable<RecipientEmailCollection> listByNotificationAsync(String resourceGroupName, String serviceName, NotificationName notificationName) {
        NotificationRecipientEmailsInner client = this.inner();
        return client.listByNotificationAsync(resourceGroupName, serviceName, notificationName)
        .map(new Func1<RecipientEmailCollectionInner, RecipientEmailCollection>() {
            @Override
            public RecipientEmailCollection call(RecipientEmailCollectionInner inner) {
                return new RecipientEmailCollectionImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable checkEntityExistsAsync(String resourceGroupName, String serviceName, NotificationName notificationName, String email) {
        NotificationRecipientEmailsInner client = this.inner();
        return client.checkEntityExistsAsync(resourceGroupName, serviceName, notificationName, email).toCompletable();
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, NotificationName notificationName, String email) {
        NotificationRecipientEmailsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, notificationName, email).toCompletable();
    }

}
