package com.hashmapinc.metadata.core.source.jdbc.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hashmapinc.metadata.core.data.id.UUIDBased;
import com.hashmapinc.metadata.core.source.SourceId;

import java.util.UUID;

public class JdbcSourceId extends UUIDBased implements SourceId {

    private static final long serialVersionUID = 1L;

    @JsonCreator
    public JdbcSourceId(@JsonProperty("id") UUID id) {
        super(id);
    }

    public static JdbcSourceId fromString(String jdbcSourceId) {
        return new JdbcSourceId(UUID.fromString(jdbcSourceId));
    }
}
