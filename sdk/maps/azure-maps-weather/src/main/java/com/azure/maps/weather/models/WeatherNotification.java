// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The WeatherNotification model. */
@Fluent
public final class WeatherNotification {
    /*
     * A type of notification generated to warn drivers of the onset of a hazard, or increase in intensity of a hazard.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * A severity/hazard index.
     * * `0` - No hazard.
     * * `1` - Be informed, be aware.
     * * `2` - Pay attention, be prepared.
     * * `3` - Take action.
     * * `4` - Life threatening, emergency.
     */
    @JsonProperty(value = "hazardIndex")
    private HazardIndex hazardIndex;

    /*
     * A unique identifier (non-displayable) for each type of hazard: LightRain, ModerateRain, HeavyRain, LightMix,
     * ModerateMix, HeavyMix, LightSnow, ModerateSnow, HeavySnow, LightIce, ModerateIce, HeavyIce, Hail, LargeHail,
     * SunGlare, SunGlareHigh, Lightning, SevereLightning, WindModerate, WindHigh, WindExtreme, FloodWarning,
     * FlashFloodWarning, TornadoWarning, TsunamiWarning, SevereThunderstormWarning.
     */
    @JsonProperty(value = "hazardCode")
    private String hazardCode;

    /*
     * A displayable short phrase describing the forecasted conditions and precipitation intensity/type.
     */
    @JsonProperty(value = "shortPhrase")
    private String shortDescription;

    /** Set default WeatherNotification constructor to private */
    private WeatherNotification() {}

    /**
     * Get the type property: A type of notification generated to warn drivers of the onset of a hazard, or increase in
     * intensity of a hazard.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Get the hazardIndex property: A severity/hazard index. * `0` - No hazard. * `1` - Be informed, be aware. * `2` -
     * Pay attention, be prepared. * `3` - Take action. * `4` - Life threatening, emergency.
     *
     * @return the hazardIndex value.
     */
    public HazardIndex getHazardIndex() {
        return this.hazardIndex;
    }

    /**
     * Get the hazardCode property: A unique identifier (non-displayable) for each type of hazard: LightRain,
     * ModerateRain, HeavyRain, LightMix, ModerateMix, HeavyMix, LightSnow, ModerateSnow, HeavySnow, LightIce,
     * ModerateIce, HeavyIce, Hail, LargeHail, SunGlare, SunGlareHigh, Lightning, SevereLightning, WindModerate,
     * WindHigh, WindExtreme, FloodWarning, FlashFloodWarning, TornadoWarning, TsunamiWarning,
     * SevereThunderstormWarning.
     *
     * @return the hazardCode value.
     */
    public String getHazardCode() {
        return this.hazardCode;
    }

    /**
     * Get the shortDescription property: A displayable short phrase describing the forecasted conditions and
     * precipitation intensity/type.
     *
     * @return the shortDescription value.
     */
    public String getShortDescription() {
        return this.shortDescription;
    }
}
