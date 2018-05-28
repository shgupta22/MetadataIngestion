package com.hashmapinc.metadata.core.dataresource.rest.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hashmapinc.metadata.core.data.id.UUIDBased;
import com.hashmapinc.metadata.core.sink.SinkId;

import java.util.UUID;

public class RestResourceId extends UUIDBased implements SinkId {

    private static final long serialVersionUID = 1L;

    @JsonCreator
    public RestResourceId(@JsonProperty("id") UUID id) {
        super(id);
    }

    public static RestResourceId fromString(String restSinkId) {
        return new RestResourceId(UUID.fromString(restSinkId));
    }
}
