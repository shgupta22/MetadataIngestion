package com.hashmapinc.metadata.core.data.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hashmapinc.metadata.core.common.data.id.UUIDBased;
import com.hashmapinc.metadata.core.data.resource.jdbc.model.JdbcResourceId;

import java.util.UUID;

public class DataResourceId extends UUIDBased {

    private static final long serialVersionUID = 1L;

    @JsonCreator
    public DataResourceId(@JsonProperty("id") UUID id) {
        super(id);
    }

    public static JdbcResourceId fromString(String jdbcSourceId) {
        return new JdbcResourceId(UUID.fromString(jdbcSourceId));
    }
}
