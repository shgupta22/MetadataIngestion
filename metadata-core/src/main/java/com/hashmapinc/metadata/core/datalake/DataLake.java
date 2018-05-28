package com.hashmapinc.metadata.core.datalake;

import com.hashmapinc.metadata.core.dataresource.DataResource;
import com.hashmapinc.metadata.core.dataresource.DataResourceType;

public class DataLake {

    private DataResourceType dataResourceType;
    private DataResource dataResource;

    public DataLake() {
    }

    public DataLake(DataLake dataLake) {
        this.dataResourceType = dataLake.dataResourceType;
        this.dataResource = dataLake.dataResource;
    }

    public DataResourceType getDataResourceType() {
        return dataResourceType;
    }

    public void setDataResourceType(DataResourceType dataResourceType) {
        this.dataResourceType = dataResourceType;
    }

    public DataResource getDataResource() {
        return dataResource;
    }

    public void setDataResource(DataResource dataResource) {
        this.dataResource = dataResource;
    }

    @Override
    public String toString() {
        return "DataLake{" +
                "dataResourceType=" + dataResourceType +
                ", dataResource=" + dataResource +
                '}';
    }
}
