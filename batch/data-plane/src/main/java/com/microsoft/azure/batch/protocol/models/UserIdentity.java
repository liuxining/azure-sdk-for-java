// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The definition of the user identity under which the task is run.
 * Specify either the userName or autoUser property, but not both.
 */
public class UserIdentity {
    /**
     * The name of the user identity under which the task is run.
     * The userName and autoUser properties are mutually exclusive; you must
     * specify one but not both.
     */
    @JsonProperty(value = "username")
    private String userName;

    /**
     * The auto user under which the task is run.
     * The userName and autoUser properties are mutually exclusive; you must
     * specify one but not both.
     */
    @JsonProperty(value = "autoUser")
    private AutoUserSpecification autoUser;

    /**
     * Get the userName and autoUser properties are mutually exclusive; you must specify one but not both.
     *
     * @return the userName value
     */
    public String userName() {
        return this.userName;
    }

    /**
     * Set the userName and autoUser properties are mutually exclusive; you must specify one but not both.
     *
     * @param userName the userName value to set
     * @return the UserIdentity object itself.
     */
    public UserIdentity withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the userName and autoUser properties are mutually exclusive; you must specify one but not both.
     *
     * @return the autoUser value
     */
    public AutoUserSpecification autoUser() {
        return this.autoUser;
    }

    /**
     * Set the userName and autoUser properties are mutually exclusive; you must specify one but not both.
     *
     * @param autoUser the autoUser value to set
     * @return the UserIdentity object itself.
     */
    public UserIdentity withAutoUser(AutoUserSpecification autoUser) {
        this.autoUser = autoUser;
        return this;
    }

}