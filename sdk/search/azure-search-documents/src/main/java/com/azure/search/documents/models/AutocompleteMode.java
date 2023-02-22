// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.models;

/**
 * Specifies the mode for Autocomplete. The default is 'oneTerm'. Use 'twoTerms' to get shingles and
 * 'oneTermWithContext' to use the current context in producing autocomplete terms.
 */
public enum AutocompleteMode {
    /** Enum value oneTerm. */
    ONE_TERM("oneTerm"),

    /** Enum value twoTerms. */
    TWO_TERMS("twoTerms"),

    /** Enum value oneTermWithContext. */
    ONE_TERM_WITH_CONTEXT("oneTermWithContext");

    /** The actual serialized value for a AutocompleteMode instance. */
    private final String value;

    AutocompleteMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AutocompleteMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AutocompleteMode object, or null if unable to parse.
     */
    public static AutocompleteMode fromString(String value) {
        if (value == null) {
            return null;
        }
        AutocompleteMode[] items = AutocompleteMode.values();
        for (AutocompleteMode item : items) {
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
