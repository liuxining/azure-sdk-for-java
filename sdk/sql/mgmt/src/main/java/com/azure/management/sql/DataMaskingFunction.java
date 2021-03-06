// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DataMaskingFunction.
 */
public enum DataMaskingFunction {
    /**
     * Enum value Default.
     */
    DEFAULT("Default"),

    /**
     * Enum value CCN.
     */
    CCN("CCN"),

    /**
     * Enum value Email.
     */
    EMAIL("Email"),

    /**
     * Enum value Number.
     */
    NUMBER("Number"),

    /**
     * Enum value SSN.
     */
    SSN("SSN"),

    /**
     * Enum value Text.
     */
    TEXT("Text");

    /**
     * The actual serialized value for a DataMaskingFunction instance.
     */
    private final String value;

    DataMaskingFunction(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DataMaskingFunction instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed DataMaskingFunction object, or null if unable to parse.
     */
    @JsonCreator
    public static DataMaskingFunction fromString(String value) {
        DataMaskingFunction[] items = DataMaskingFunction.values();
        for (DataMaskingFunction item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
