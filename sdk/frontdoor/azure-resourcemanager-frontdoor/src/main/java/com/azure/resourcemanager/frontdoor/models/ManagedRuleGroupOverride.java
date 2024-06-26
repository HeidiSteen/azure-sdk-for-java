// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines a managed rule group override setting. */
@Fluent
public final class ManagedRuleGroupOverride {
    /*
     * Describes the managed rule group to override.
     */
    @JsonProperty(value = "ruleGroupName", required = true)
    private String ruleGroupName;

    /*
     * Describes the exclusions that are applied to all rules in the group.
     */
    @JsonProperty(value = "exclusions")
    private List<ManagedRuleExclusion> exclusions;

    /*
     * List of rules that will be disabled. If none specified, all rules in the group will be disabled.
     */
    @JsonProperty(value = "rules")
    private List<ManagedRuleOverride> rules;

    /** Creates an instance of ManagedRuleGroupOverride class. */
    public ManagedRuleGroupOverride() {
    }

    /**
     * Get the ruleGroupName property: Describes the managed rule group to override.
     *
     * @return the ruleGroupName value.
     */
    public String ruleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * Set the ruleGroupName property: Describes the managed rule group to override.
     *
     * @param ruleGroupName the ruleGroupName value to set.
     * @return the ManagedRuleGroupOverride object itself.
     */
    public ManagedRuleGroupOverride withRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
        return this;
    }

    /**
     * Get the exclusions property: Describes the exclusions that are applied to all rules in the group.
     *
     * @return the exclusions value.
     */
    public List<ManagedRuleExclusion> exclusions() {
        return this.exclusions;
    }

    /**
     * Set the exclusions property: Describes the exclusions that are applied to all rules in the group.
     *
     * @param exclusions the exclusions value to set.
     * @return the ManagedRuleGroupOverride object itself.
     */
    public ManagedRuleGroupOverride withExclusions(List<ManagedRuleExclusion> exclusions) {
        this.exclusions = exclusions;
        return this;
    }

    /**
     * Get the rules property: List of rules that will be disabled. If none specified, all rules in the group will be
     * disabled.
     *
     * @return the rules value.
     */
    public List<ManagedRuleOverride> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: List of rules that will be disabled. If none specified, all rules in the group will be
     * disabled.
     *
     * @param rules the rules value to set.
     * @return the ManagedRuleGroupOverride object itself.
     */
    public ManagedRuleGroupOverride withRules(List<ManagedRuleOverride> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleGroupName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property ruleGroupName in model ManagedRuleGroupOverride"));
        }
        if (exclusions() != null) {
            exclusions().forEach(e -> e.validate());
        }
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedRuleGroupOverride.class);
}
