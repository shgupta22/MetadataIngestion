package com.hashmapinc.metadata.core.dataresource.rest.model;

import com.hashmapinc.metadata.core.dataresource.DataResource;
import com.hashmapinc.metadata.core.sink.Sink;

public class RestSink extends Sink<RestSinkId> implements DataResource {

    private String dbUrl;
    private String username;
    private String password;

    public RestSink() {
        super();
    }

    public RestSink(RestSinkId id) {
        super(id);
    }

    public RestSink(RestSink restSink) {
        this.dbUrl = restSink.dbUrl;
        this.username = restSink.username;
        this.password = restSink.password;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void push() {

    }

    @Override
    public void pull() {

    }

    @Override
    public String toString() {
        return "RestSink{" +
                "dbUrl=" + dbUrl +
                ", username=" + username +
                ", password=" + password +
                '}';
    }
}
