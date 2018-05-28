package com.hashmapinc.metadata.core.dataresource;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.hashmapinc.metadata.core.dataresource.jdbc.model.JdbcResource;
import com.hashmapinc.metadata.core.dataresource.rest.model.RestResource;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = JdbcResource.class, name = ""),
        @JsonSubTypes.Type(value = RestResource.class, name = "")})
public interface DataResource {

    void push();

    void pull();
}
