// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ApplicationGatewayPathRule model.
 */
@JsonFlatten
@Fluent
public class ApplicationGatewayPathRuleInner extends SubResource {
    /*
     * Name of the path rule that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Path rules of URL path map.
     */
    @JsonProperty(value = "properties.paths")
    private List<String> paths;

    /*
     * Reference to another subresource.
     */
    @JsonProperty(value = "properties.backendAddressPool")
    private SubResource backendAddressPool;

    /*
     * Reference to another subresource.
     */
    @JsonProperty(value = "properties.backendHttpSettings")
    private SubResource backendHttpSettings;

    /*
     * Reference to another subresource.
     */
    @JsonProperty(value = "properties.redirectConfiguration")
    private SubResource redirectConfiguration;

    /*
     * Reference to another subresource.
     */
    @JsonProperty(value = "properties.rewriteRuleSet")
    private SubResource rewriteRuleSet;

    /*
     * Path rule of URL path map resource. Possible values are: 'Updating',
     * 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the name property: Name of the path rule that is unique within an
     * Application Gateway.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the path rule that is unique within an
     * Application Gateway.
     * 
     * @param name the name value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever
     * the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever
     * the resource is updated.
     * 
     * @param etag the etag value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type property: Type of the resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the resource.
     * 
     * @param type the type value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the paths property: Path rules of URL path map.
     * 
     * @return the paths value.
     */
    public List<String> paths() {
        return this.paths;
    }

    /**
     * Set the paths property: Path rules of URL path map.
     * 
     * @param paths the paths value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withPaths(List<String> paths) {
        this.paths = paths;
        return this;
    }

    /**
     * Get the backendAddressPool property: Reference to another subresource.
     * 
     * @return the backendAddressPool value.
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool property: Reference to another subresource.
     * 
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the backendHttpSettings property: Reference to another subresource.
     * 
     * @return the backendHttpSettings value.
     */
    public SubResource backendHttpSettings() {
        return this.backendHttpSettings;
    }

    /**
     * Set the backendHttpSettings property: Reference to another subresource.
     * 
     * @param backendHttpSettings the backendHttpSettings value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withBackendHttpSettings(SubResource backendHttpSettings) {
        this.backendHttpSettings = backendHttpSettings;
        return this;
    }

    /**
     * Get the redirectConfiguration property: Reference to another
     * subresource.
     * 
     * @return the redirectConfiguration value.
     */
    public SubResource redirectConfiguration() {
        return this.redirectConfiguration;
    }

    /**
     * Set the redirectConfiguration property: Reference to another
     * subresource.
     * 
     * @param redirectConfiguration the redirectConfiguration value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withRedirectConfiguration(SubResource redirectConfiguration) {
        this.redirectConfiguration = redirectConfiguration;
        return this;
    }

    /**
     * Get the rewriteRuleSet property: Reference to another subresource.
     * 
     * @return the rewriteRuleSet value.
     */
    public SubResource rewriteRuleSet() {
        return this.rewriteRuleSet;
    }

    /**
     * Set the rewriteRuleSet property: Reference to another subresource.
     * 
     * @param rewriteRuleSet the rewriteRuleSet value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withRewriteRuleSet(SubResource rewriteRuleSet) {
        this.rewriteRuleSet = rewriteRuleSet;
        return this;
    }

    /**
     * Get the provisioningState property: Path rule of URL path map resource.
     * Possible values are: 'Updating', 'Deleting', and 'Failed'.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Path rule of URL path map resource.
     * Possible values are: 'Updating', 'Deleting', and 'Failed'.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayPathRuleInner object itself.
     */
    public ApplicationGatewayPathRuleInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }
}
