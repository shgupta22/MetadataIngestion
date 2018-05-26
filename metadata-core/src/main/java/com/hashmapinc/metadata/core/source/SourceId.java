package com.hashmapinc.metadata.core.source;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.UUID;

public interface SourceId extends Serializable {

    UUID NULL_UUID = UUID.fromString("13814000-1dd2-11b2-8080-808080808080");

    UUID getId();

    @JsonIgnore
    default boolean isNullUid() {
        return NULL_UUID.equals(getId());
    }
}
