// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * This parameter is only valid if the query type is 'semantic'. If set, the query returns captions extracted from key
 * passages in the highest ranked documents. When Captions is set to 'extractive', highlighting is enabled by default,
 * and can be configured by appending the pipe character '|' followed by the 'highlight-&lt;true/false&gt;' option, such
 * as 'extractive|highlight-true'. Defaults to 'None'.
 */
public final class QueryCaptionType extends ExpandableStringEnum<QueryCaptionType> {
    /** Static value none for QueryCaptionType. */
    public static final QueryCaptionType NONE = fromString("none");

    /** Static value extractive for QueryCaptionType. */
    public static final QueryCaptionType EXTRACTIVE = fromString("extractive");

    /**
     * Creates a new instance of QueryCaptionType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public QueryCaptionType() {}

    /**
     * Creates or finds a QueryCaptionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding QueryCaptionType.
     */
    public static QueryCaptionType fromString(String name) {
        return fromString(name, QueryCaptionType.class);
    }

    /**
     * Gets known QueryCaptionType values.
     *
     * @return known QueryCaptionType values.
     */
    public static Collection<QueryCaptionType> values() {
        return values(QueryCaptionType.class);
    }
}
