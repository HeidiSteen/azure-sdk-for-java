// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines flags that can be combined to control how regular expressions are used in the pattern analyzer and pattern
 * tokenizer.
 */
public final class RegexFlags extends ExpandableStringEnum<RegexFlags> {
    /** Static value CANON_EQ for RegexFlags. */
    public static final RegexFlags CANON_EQ = fromString("CANON_EQ");

    /** Static value CASE_INSENSITIVE for RegexFlags. */
    public static final RegexFlags CASE_INSENSITIVE = fromString("CASE_INSENSITIVE");

    /** Static value COMMENTS for RegexFlags. */
    public static final RegexFlags COMMENTS = fromString("COMMENTS");

    /** Static value DOTALL for RegexFlags. */
    public static final RegexFlags DOT_ALL = fromString("DOTALL");

    /** Static value LITERAL for RegexFlags. */
    public static final RegexFlags LITERAL = fromString("LITERAL");

    /** Static value MULTILINE for RegexFlags. */
    public static final RegexFlags MULTILINE = fromString("MULTILINE");

    /** Static value UNICODE_CASE for RegexFlags. */
    public static final RegexFlags UNICODE_CASE = fromString("UNICODE_CASE");

    /** Static value UNIX_LINES for RegexFlags. */
    public static final RegexFlags UNIX_LINES = fromString("UNIX_LINES");

    /**
     * Creates a new instance of RegexFlags value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RegexFlags() {}

    /**
     * Creates or finds a RegexFlags from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RegexFlags.
     */
    public static RegexFlags fromString(String name) {
        return fromString(name, RegexFlags.class);
    }

    /**
     * Gets known RegexFlags values.
     *
     * @return known RegexFlags values.
     */
    public static Collection<RegexFlags> values() {
        return values(RegexFlags.class);
    }
}
