package com.hashmapinc.metadata.core.sink.rest.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hashmapinc.metadata.core.data.id.UUIDBased;
import com.hashmapinc.metadata.core.sink.SinkId;

import java.util.UUID;

public class RestSinkId extends UUIDBased implements SinkId {

    private static final long serialVersionUID = 1L;

    @JsonCreator
    public RestSinkId(@JsonProperty("id") UUID id) {
        super(id);
    }

    public static RestSinkId fromString(String restSinkId) {
        return new RestSinkId(UUID.fromString(restSinkId));
    }
}
