/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for PoolLifetimeOption.
 */
public enum PoolLifetimeOption {
    /** Enum value jobSchedule. */
    JOB_SCHEDULE("jobSchedule"),

    /** Enum value job. */
    JOB("job");

    /** The actual serialized value for a PoolLifetimeOption instance. */
    private String value;

    PoolLifetimeOption(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PoolLifetimeOption instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PoolLifetimeOption object, or null if unable to parse.
     */
    @JsonCreator
    public static PoolLifetimeOption fromString(String value) {
        PoolLifetimeOption[] items = PoolLifetimeOption.values();
        for (PoolLifetimeOption item : items) {
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
