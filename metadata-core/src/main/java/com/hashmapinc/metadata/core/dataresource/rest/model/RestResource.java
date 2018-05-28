package com.hashmapinc.metadata.core.dataresource.rest.model;

import com.hashmapinc.metadata.core.dataresource.DataResource;
import com.hashmapinc.metadata.core.sink.Sink;

public class RestResource extends Sink<RestResourceId> implements DataResource {

    private String dbUrl;
    private String username;
    private String password;

    public RestResource() {
        super();
    }

    public RestResource(RestResourceId id) {
        super(id);
    }

    public RestResource(RestResource restResource) {
        this.dbUrl = restResource.dbUrl;
        this.username = restResource.username;
        this.password = restResource.password;
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
        return "RestResource{" +
                "dbUrl=" + dbUrl +
                ", username=" + username +
                ", password=" + password +
                '}';
    }
}
