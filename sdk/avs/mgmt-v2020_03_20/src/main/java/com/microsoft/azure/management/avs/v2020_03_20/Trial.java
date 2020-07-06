/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_03_20;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.avs.v2020_03_20.implementation.AVSManager;
import com.microsoft.azure.management.avs.v2020_03_20.implementation.TrialInner;

/**
 * Type representing Trial.
 */
public interface Trial extends HasInner<TrialInner>, HasManager<AVSManager> {
    /**
     * @return the availableHosts value.
     */
    Integer availableHosts();

    /**
     * @return the status value.
     */
    TrialStatus status();

}