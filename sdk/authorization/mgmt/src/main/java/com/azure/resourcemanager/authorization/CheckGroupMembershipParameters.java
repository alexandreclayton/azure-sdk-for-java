// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** The CheckGroupMembershipParameters model. */
@Fluent
public final class CheckGroupMembershipParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CheckGroupMembershipParameters.class);

    /*
     * The object ID of the group to check.
     */
    @JsonProperty(value = "groupId", required = true)
    private String groupId;

    /*
     * The object ID of the contact, group, user, or service principal to check
     * for membership in the specified group.
     */
    @JsonProperty(value = "memberId", required = true)
    private String memberId;

    /*
     * Request parameters for IsMemberOf API call.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the groupId property: The object ID of the group to check.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: The object ID of the group to check.
     *
     * @param groupId the groupId value to set.
     * @return the CheckGroupMembershipParameters object itself.
     */
    public CheckGroupMembershipParameters withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the memberId property: The object ID of the contact, group, user, or service principal to check for
     * membership in the specified group.
     *
     * @return the memberId value.
     */
    public String memberId() {
        return this.memberId;
    }

    /**
     * Set the memberId property: The object ID of the contact, group, user, or service principal to check for
     * membership in the specified group.
     *
     * @param memberId the memberId value to set.
     * @return the CheckGroupMembershipParameters object itself.
     */
    public CheckGroupMembershipParameters withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * Get the additionalProperties property: Request parameters for IsMemberOf API call.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Request parameters for IsMemberOf API call.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the CheckGroupMembershipParameters object itself.
     */
    public CheckGroupMembershipParameters withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (groupId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property groupId in model CheckGroupMembershipParameters"));
        }
        if (memberId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property memberId in model CheckGroupMembershipParameters"));
        }
    }
}