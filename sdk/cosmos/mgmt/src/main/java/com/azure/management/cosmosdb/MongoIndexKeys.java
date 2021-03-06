// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The MongoIndexKeys model.
 */
@Fluent
public final class MongoIndexKeys {
    /*
     * List of keys for each MongoDB collection in the Azure Cosmos DB service
     */
    @JsonProperty(value = "keys")
    private List<String> keys;

    /**
     * Get the keys property: List of keys for each MongoDB collection in the
     * Azure Cosmos DB service.
     * 
     * @return the keys value.
     */
    public List<String> keys() {
        return this.keys;
    }

    /**
     * Set the keys property: List of keys for each MongoDB collection in the
     * Azure Cosmos DB service.
     * 
     * @param keys the keys value to set.
     * @return the MongoIndexKeys object itself.
     */
    public MongoIndexKeys withKeys(List<String> keys) {
        this.keys = keys;
        return this;
    }
}
