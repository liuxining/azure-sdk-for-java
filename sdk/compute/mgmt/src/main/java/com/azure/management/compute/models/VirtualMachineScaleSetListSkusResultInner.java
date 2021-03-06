// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The VirtualMachineScaleSetListSkusResult model.
 */
@Fluent
public final class VirtualMachineScaleSetListSkusResultInner {
    /*
     * The list of skus available for the virtual machine scale set.
     */
    @JsonProperty(value = "value", required = true)
    private List<VirtualMachineScaleSetSkuInner> value;

    /*
     * The uri to fetch the next page of Virtual Machine Scale Set Skus. Call
     * ListNext() with this to fetch the next page of VMSS Skus.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of skus available for the virtual
     * machine scale set.
     * 
     * @return the value value.
     */
    public List<VirtualMachineScaleSetSkuInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of skus available for the virtual
     * machine scale set.
     * 
     * @param value the value value to set.
     * @return the VirtualMachineScaleSetListSkusResultInner object itself.
     */
    public VirtualMachineScaleSetListSkusResultInner withValue(List<VirtualMachineScaleSetSkuInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of Virtual
     * Machine Scale Set Skus. Call ListNext() with this to fetch the next page
     * of VMSS Skus.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of Virtual
     * Machine Scale Set Skus. Call ListNext() with this to fetch the next page
     * of VMSS Skus.
     * 
     * @param nextLink the nextLink value to set.
     * @return the VirtualMachineScaleSetListSkusResultInner object itself.
     */
    public VirtualMachineScaleSetListSkusResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
