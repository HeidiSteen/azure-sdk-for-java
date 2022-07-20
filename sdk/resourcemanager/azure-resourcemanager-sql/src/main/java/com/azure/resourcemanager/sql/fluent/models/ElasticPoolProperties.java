// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.models.ElasticPoolLicenseType;
import com.azure.resourcemanager.sql.models.ElasticPoolPerDatabaseSettings;
import com.azure.resourcemanager.sql.models.ElasticPoolState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of an elastic pool. */
@Fluent
public final class ElasticPoolProperties {
    /*
     * The state of the elastic pool.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private ElasticPoolState state;

    /*
     * The creation date of the elastic pool (ISO8601 format).
     */
    @JsonProperty(value = "creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationDate;

    /*
     * The storage limit for the database elastic pool in bytes.
     */
    @JsonProperty(value = "maxSizeBytes")
    private Long maxSizeBytes;

    /*
     * The per database settings for the elastic pool.
     */
    @JsonProperty(value = "perDatabaseSettings")
    private ElasticPoolPerDatabaseSettings perDatabaseSettings;

    /*
     * Whether or not this elastic pool is zone redundant, which means the
     * replicas of this elastic pool will be spread across multiple
     * availability zones.
     */
    @JsonProperty(value = "zoneRedundant")
    private Boolean zoneRedundant;

    /*
     * The license type to apply for this elastic pool.
     */
    @JsonProperty(value = "licenseType")
    private ElasticPoolLicenseType licenseType;

    /**
     * Get the state property: The state of the elastic pool.
     *
     * @return the state value.
     */
    public ElasticPoolState state() {
        return this.state;
    }

    /**
     * Get the creationDate property: The creation date of the elastic pool (ISO8601 format).
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the maxSizeBytes property: The storage limit for the database elastic pool in bytes.
     *
     * @return the maxSizeBytes value.
     */
    public Long maxSizeBytes() {
        return this.maxSizeBytes;
    }

    /**
     * Set the maxSizeBytes property: The storage limit for the database elastic pool in bytes.
     *
     * @param maxSizeBytes the maxSizeBytes value to set.
     * @return the ElasticPoolProperties object itself.
     */
    public ElasticPoolProperties withMaxSizeBytes(Long maxSizeBytes) {
        this.maxSizeBytes = maxSizeBytes;
        return this;
    }

    /**
     * Get the perDatabaseSettings property: The per database settings for the elastic pool.
     *
     * @return the perDatabaseSettings value.
     */
    public ElasticPoolPerDatabaseSettings perDatabaseSettings() {
        return this.perDatabaseSettings;
    }

    /**
     * Set the perDatabaseSettings property: The per database settings for the elastic pool.
     *
     * @param perDatabaseSettings the perDatabaseSettings value to set.
     * @return the ElasticPoolProperties object itself.
     */
    public ElasticPoolProperties withPerDatabaseSettings(ElasticPoolPerDatabaseSettings perDatabaseSettings) {
        this.perDatabaseSettings = perDatabaseSettings;
        return this;
    }

    /**
     * Get the zoneRedundant property: Whether or not this elastic pool is zone redundant, which means the replicas of
     * this elastic pool will be spread across multiple availability zones.
     *
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Set the zoneRedundant property: Whether or not this elastic pool is zone redundant, which means the replicas of
     * this elastic pool will be spread across multiple availability zones.
     *
     * @param zoneRedundant the zoneRedundant value to set.
     * @return the ElasticPoolProperties object itself.
     */
    public ElasticPoolProperties withZoneRedundant(Boolean zoneRedundant) {
        this.zoneRedundant = zoneRedundant;
        return this;
    }

    /**
     * Get the licenseType property: The license type to apply for this elastic pool.
     *
     * @return the licenseType value.
     */
    public ElasticPoolLicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: The license type to apply for this elastic pool.
     *
     * @param licenseType the licenseType value to set.
     * @return the ElasticPoolProperties object itself.
     */
    public ElasticPoolProperties withLicenseType(ElasticPoolLicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (perDatabaseSettings() != null) {
            perDatabaseSettings().validate();
        }
    }
}
