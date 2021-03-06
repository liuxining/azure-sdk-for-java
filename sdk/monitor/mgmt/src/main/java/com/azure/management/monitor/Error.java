// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Error model.
 */
@Fluent
public final class Error {
    /*
     * Error code identifying the specific error.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * Error message in the caller's locale.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Get the code property: Error code identifying the specific error.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: Error code identifying the specific error.
     * 
     * @param code the code value to set.
     * @return the Error object itself.
     */
    public Error withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: Error message in the caller's locale.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Error message in the caller's locale.
     * 
     * @param message the message value to set.
     * @return the Error object itself.
     */
    public Error withMessage(String message) {
        this.message = message;
        return this;
    }
}
