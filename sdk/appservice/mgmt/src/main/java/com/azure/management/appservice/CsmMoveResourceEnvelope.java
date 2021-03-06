// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The CsmMoveResourceEnvelope model.
 */
@Fluent
public final class CsmMoveResourceEnvelope {
    /*
     * The targetResourceGroup property.
     */
    @JsonProperty(value = "targetResourceGroup")
    private String targetResourceGroup;

    /*
     * The resources property.
     */
    @JsonProperty(value = "resources")
    private List<String> resources;

    /**
     * Get the targetResourceGroup property: The targetResourceGroup property.
     * 
     * @return the targetResourceGroup value.
     */
    public String targetResourceGroup() {
        return this.targetResourceGroup;
    }

    /**
     * Set the targetResourceGroup property: The targetResourceGroup property.
     * 
     * @param targetResourceGroup the targetResourceGroup value to set.
     * @return the CsmMoveResourceEnvelope object itself.
     */
    public CsmMoveResourceEnvelope withTargetResourceGroup(String targetResourceGroup) {
        this.targetResourceGroup = targetResourceGroup;
        return this;
    }

    /**
     * Get the resources property: The resources property.
     * 
     * @return the resources value.
     */
    public List<String> resources() {
        return this.resources;
    }

    /**
     * Set the resources property: The resources property.
     * 
     * @param resources the resources value to set.
     * @return the CsmMoveResourceEnvelope object itself.
     */
    public CsmMoveResourceEnvelope withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }
}
