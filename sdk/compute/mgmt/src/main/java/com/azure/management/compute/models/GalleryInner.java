// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.management.compute.GalleryIdentifier;
import com.azure.management.compute.GalleryPropertiesProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Gallery model.
 */
@JsonFlatten
@Fluent
public class GalleryInner extends Resource {
    /*
     * The description of this Shared Image Gallery resource. This property is
     * updatable.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * Describes the gallery unique name.
     */
    @JsonProperty(value = "properties.identifier")
    private GalleryIdentifier identifier;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private GalleryPropertiesProvisioningState provisioningState;

    /**
     * Get the description property: The description of this Shared Image
     * Gallery resource. This property is updatable.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of this Shared Image
     * Gallery resource. This property is updatable.
     * 
     * @param description the description value to set.
     * @return the GalleryInner object itself.
     */
    public GalleryInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the identifier property: Describes the gallery unique name.
     * 
     * @return the identifier value.
     */
    public GalleryIdentifier identifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Describes the gallery unique name.
     * 
     * @param identifier the identifier value to set.
     * @return the GalleryInner object itself.
     */
    public GalleryInner withIdentifier(GalleryIdentifier identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only
     * appears in the response.
     * 
     * @return the provisioningState value.
     */
    public GalleryPropertiesProvisioningState provisioningState() {
        return this.provisioningState;
    }
}
