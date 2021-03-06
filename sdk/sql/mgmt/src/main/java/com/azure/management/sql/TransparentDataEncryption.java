// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.management.sql;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.rest.PagedFlux;
import com.azure.management.resources.fluentcore.arm.models.HasId;
import com.azure.management.resources.fluentcore.arm.models.HasName;
import com.azure.management.resources.fluentcore.arm.models.HasResourceGroup;
import com.azure.management.resources.fluentcore.model.HasInner;
import com.azure.management.resources.fluentcore.model.Refreshable;
import com.azure.management.sql.models.TransparentDataEncryptionInner;
import reactor.core.publisher.Mono;

import java.util.List;


/**
 * An immutable client-side representation of an Azure SQL database's TransparentDataEncryption.
 */
@Fluent
public interface TransparentDataEncryption extends
        Refreshable<TransparentDataEncryption>,
        HasInner<TransparentDataEncryptionInner>,
        HasResourceGroup,
        HasName,
        HasId {
    /**
     * @return name of the SQL Server to which this replication belongs
     */
    String sqlServerName();

    /**
     * @return name of the SQL Database to which this replication belongs
     */
    String databaseName();

    /**
     * @return the status of the Azure SQL Database Transparent Data Encryption
     */
    TransparentDataEncryptionStatus status();

    /**
     * Updates the state of the transparent data encryption status.
     *
     * @param transparentDataEncryptionState state of the data encryption to set
     * @return the new encryption settings after the update operation
     */
    TransparentDataEncryption updateStatus(TransparentDataEncryptionStatus transparentDataEncryptionState);

    /**
     * Updates the state of the transparent data encryption status.
     *
     * @param transparentDataEncryptionState state of the data encryption to set
     * @return a representation of the deferred computation of the new encryption settings after the update operation
     */
    Mono<TransparentDataEncryption> updateStatusAsync(TransparentDataEncryptionStatus transparentDataEncryptionState);

    /**
     * @return an Azure SQL Database Transparent Data Encryption Activities
     */
    List<TransparentDataEncryptionActivity> listActivities();

    /**
     * @return an Azure SQL Database Transparent Data Encryption Activities
     */
    PagedFlux<TransparentDataEncryptionActivity> listActivitiesAsync();
}

