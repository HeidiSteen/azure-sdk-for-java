// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.models;

/**
 * A value that specifies whether we want to calculate scoring statistics (such as document frequency) globally for more
 * consistent scoring, or locally, for lower latency. The default is 'local'. Use 'global' to aggregate scoring
 * statistics globally before scoring. Using global scoring statistics can increase latency of search queries.
 */
public enum ScoringStatistics {
    /** Enum value local. */
    LOCAL("local"),

    /** Enum value global. */
    GLOBAL("global");

    /** The actual serialized value for a ScoringStatistics instance. */
    private final String value;

    ScoringStatistics(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ScoringStatistics instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ScoringStatistics object, or null if unable to parse.
     */
    public static ScoringStatistics fromString(String value) {
        if (value == null) {
            return null;
        }
        ScoringStatistics[] items = ScoringStatistics.values();
        for (ScoringStatistics item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return this.value;
    }
}
