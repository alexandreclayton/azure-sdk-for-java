// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ExpressRouteServiceProviderListResult model. */
@Fluent
public final class ExpressRouteServiceProviderListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteServiceProviderListResultInner.class);

    /*
     * A list of ExpressRouteResourceProvider resources.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteServiceProviderInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of ExpressRouteResourceProvider resources.
     *
     * @return the value value.
     */
    public List<ExpressRouteServiceProviderInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of ExpressRouteResourceProvider resources.
     *
     * @param value the value value to set.
     * @return the ExpressRouteServiceProviderListResultInner object itself.
     */
    public ExpressRouteServiceProviderListResultInner withValue(List<ExpressRouteServiceProviderInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ExpressRouteServiceProviderListResultInner object itself.
     */
    public ExpressRouteServiceProviderListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}