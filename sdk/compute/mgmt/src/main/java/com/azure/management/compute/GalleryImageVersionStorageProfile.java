// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The GalleryImageVersionStorageProfile model.
 */
@Immutable
public final class GalleryImageVersionStorageProfile {
    /**
     * The source property.
     */
    @JsonProperty(value = "source")
    private GalleryArtifactVersionSource source;
    /*
     * This is the OS disk image.
     */
    @JsonProperty(value = "osDiskImage", access = JsonProperty.Access.WRITE_ONLY)
    private GalleryOSDiskImage osDiskImage;

    /*
     * A list of data disk images.
     */
    @JsonProperty(value = "dataDiskImages", access = JsonProperty.Access.WRITE_ONLY)
    private List<GalleryDataDiskImage> dataDiskImages;

    /**
     * Get the source value.
     *
     * @return the source value
     */
    public GalleryArtifactVersionSource source() {
        return this.source;
    }

    /**
     * Set the source value.
     *
     * @param source the source value to set
     * @return the GalleryImageVersionStorageProfile object itself.
     */
    public GalleryImageVersionStorageProfile withSource(GalleryArtifactVersionSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the osDiskImage property: This is the OS disk image.
     * 
     * @return the osDiskImage value.
     */
    public GalleryOSDiskImage osDiskImage() {
        return this.osDiskImage;
    }

    /**
     * Get the dataDiskImages property: A list of data disk images.
     * 
     * @return the dataDiskImages value.
     */
    public List<GalleryDataDiskImage> dataDiskImages() {
        return this.dataDiskImages;
    }
}
