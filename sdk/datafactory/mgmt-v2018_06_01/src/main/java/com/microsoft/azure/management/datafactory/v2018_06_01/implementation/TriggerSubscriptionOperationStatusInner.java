/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import com.microsoft.azure.management.datafactory.v2018_06_01.EventSubscriptionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the response of a trigger subscription operation.
 */
public class TriggerSubscriptionOperationStatusInner {
    /**
     * Trigger name.
     */
    @JsonProperty(value = "triggerName", access = JsonProperty.Access.WRITE_ONLY)
    private String triggerName;

    /**
     * Event Subscription Status. Possible values include: 'Enabled',
     * 'Provisioning', 'Deprovisioning', 'Disabled', 'Unknown'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private EventSubscriptionStatus status;

    /**
     * Get trigger name.
     *
     * @return the triggerName value
     */
    public String triggerName() {
        return this.triggerName;
    }

    /**
     * Get event Subscription Status. Possible values include: 'Enabled', 'Provisioning', 'Deprovisioning', 'Disabled', 'Unknown'.
     *
     * @return the status value
     */
    public EventSubscriptionStatus status() {
        return this.status;
    }

}
