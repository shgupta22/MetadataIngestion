package com.hashmapinc.metadata.config.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hashmapinc.metadata.core.data.id.UUIDBased;

import java.util.UUID;

public class MetadataConfigId extends UUIDBased {

    private static final long serialVersionUID = 1L;

    @JsonCreator
    public MetadataConfigId(@JsonProperty("id") UUID id) {
        super(id);
    }

    public static MetadataConfigId fromString(String metadataConfigId) {
        return new MetadataConfigId(UUID.fromString(metadataConfigId));
    }
}
