// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.management.network.models.SecurityRuleInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The SecurityRuleAssociations model.
 */
@Fluent
public final class SecurityRuleAssociations {
    /*
     * Network interface and its custom security rules.
     */
    @JsonProperty(value = "networkInterfaceAssociation")
    private NetworkInterfaceAssociation networkInterfaceAssociation;

    /*
     * Subnet and it's custom security rules.
     */
    @JsonProperty(value = "subnetAssociation")
    private SubnetAssociation subnetAssociation;

    /*
     * Collection of default security rules of the network security group.
     */
    @JsonProperty(value = "defaultSecurityRules")
    private List<SecurityRuleInner> defaultSecurityRules;

    /*
     * Collection of effective security rules.
     */
    @JsonProperty(value = "effectiveSecurityRules")
    private List<EffectiveNetworkSecurityRule> effectiveSecurityRules;

    /**
     * Get the networkInterfaceAssociation property: Network interface and its
     * custom security rules.
     * 
     * @return the networkInterfaceAssociation value.
     */
    public NetworkInterfaceAssociation networkInterfaceAssociation() {
        return this.networkInterfaceAssociation;
    }

    /**
     * Set the networkInterfaceAssociation property: Network interface and its
     * custom security rules.
     * 
     * @param networkInterfaceAssociation the networkInterfaceAssociation value
     * to set.
     * @return the SecurityRuleAssociations object itself.
     */
    public SecurityRuleAssociations withNetworkInterfaceAssociation(NetworkInterfaceAssociation networkInterfaceAssociation) {
        this.networkInterfaceAssociation = networkInterfaceAssociation;
        return this;
    }

    /**
     * Get the subnetAssociation property: Subnet and it's custom security
     * rules.
     * 
     * @return the subnetAssociation value.
     */
    public SubnetAssociation subnetAssociation() {
        return this.subnetAssociation;
    }

    /**
     * Set the subnetAssociation property: Subnet and it's custom security
     * rules.
     * 
     * @param subnetAssociation the subnetAssociation value to set.
     * @return the SecurityRuleAssociations object itself.
     */
    public SecurityRuleAssociations withSubnetAssociation(SubnetAssociation subnetAssociation) {
        this.subnetAssociation = subnetAssociation;
        return this;
    }

    /**
     * Get the defaultSecurityRules property: Collection of default security
     * rules of the network security group.
     * 
     * @return the defaultSecurityRules value.
     */
    public List<SecurityRuleInner> defaultSecurityRules() {
        return this.defaultSecurityRules;
    }

    /**
     * Set the defaultSecurityRules property: Collection of default security
     * rules of the network security group.
     * 
     * @param defaultSecurityRules the defaultSecurityRules value to set.
     * @return the SecurityRuleAssociations object itself.
     */
    public SecurityRuleAssociations withDefaultSecurityRules(List<SecurityRuleInner> defaultSecurityRules) {
        this.defaultSecurityRules = defaultSecurityRules;
        return this;
    }

    /**
     * Get the effectiveSecurityRules property: Collection of effective
     * security rules.
     * 
     * @return the effectiveSecurityRules value.
     */
    public List<EffectiveNetworkSecurityRule> effectiveSecurityRules() {
        return this.effectiveSecurityRules;
    }

    /**
     * Set the effectiveSecurityRules property: Collection of effective
     * security rules.
     * 
     * @param effectiveSecurityRules the effectiveSecurityRules value to set.
     * @return the SecurityRuleAssociations object itself.
     */
    public SecurityRuleAssociations withEffectiveSecurityRules(List<EffectiveNetworkSecurityRule> effectiveSecurityRules) {
        this.effectiveSecurityRules = effectiveSecurityRules;
        return this;
    }
}
