// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResponseSectionType. */
public final class ResponseSectionType extends ExpandableStringEnum<ResponseSectionType> {
    /** Static value CAR_TRAIN for ResponseSectionType. */
    public static final ResponseSectionType CAR_OR_TRAIN = fromString("CAR_TRAIN");

    /** Static value COUNTRY for ResponseSectionType. */
    public static final ResponseSectionType COUNTRY = fromString("COUNTRY");

    /** Static value FERRY for ResponseSectionType. */
    public static final ResponseSectionType FERRY = fromString("FERRY");

    /** Static value MOTORWAY for ResponseSectionType. */
    public static final ResponseSectionType MOTORWAY = fromString("MOTORWAY");

    /** Static value PEDESTRIAN for ResponseSectionType. */
    public static final ResponseSectionType PEDESTRIAN = fromString("PEDESTRIAN");

    /** Static value TOLL_ROAD for ResponseSectionType. */
    public static final ResponseSectionType TOLL_ROAD = fromString("TOLL_ROAD");

    /** Static value TOLL_VIGNETTE for ResponseSectionType. */
    public static final ResponseSectionType TOLL_VIGNETTE = fromString("TOLL_VIGNETTE");

    /** Static value TRAFFIC for ResponseSectionType. */
    public static final ResponseSectionType TRAFFIC = fromString("TRAFFIC");

    /** Static value TRAVEL_MODE for ResponseSectionType. */
    public static final ResponseSectionType TRAVEL_MODE = fromString("TRAVEL_MODE");

    /** Static value TUNNEL for ResponseSectionType. */
    public static final ResponseSectionType TUNNEL = fromString("TUNNEL");

    /** Static value CARPOOL for ResponseSectionType. */
    public static final ResponseSectionType CARPOOL = fromString("CARPOOL");

    /** Static value URBAN for ResponseSectionType. */
    public static final ResponseSectionType URBAN = fromString("URBAN");

    /**
     * Creates or finds a ResponseSectionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResponseSectionType.
     */
    @JsonCreator
    public static ResponseSectionType fromString(String name) {
        return fromString(name, ResponseSectionType.class);
    }

    /**
     * Gets known ResponseSectionType values.
     *
     * @return known ResponseSectionType values.
     */
    public static Collection<ResponseSectionType> values() {
        return values(ResponseSectionType.class);
    }
}
