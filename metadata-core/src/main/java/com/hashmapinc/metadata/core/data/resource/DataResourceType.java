package com.hashmapinc.metadata.core.data.resource;

public enum DataResourceType {

    REST("REST"),
    JDBC("JDBC");

    private String dataResourceType;

    public String getDataResourceType() {
        return this.dataResourceType;
    }

    public void setDataResourceType(String dataResourceType) {
        this.dataResourceType = dataResourceType;
    }

    private DataResourceType(String dataResourceType) {
        this.dataResourceType = dataResourceType;
    }
}
