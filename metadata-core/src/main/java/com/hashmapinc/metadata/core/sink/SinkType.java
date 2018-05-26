package com.hashmapinc.metadata.core.sink;

public enum  SinkType {

    REST("REST");

    private String sinkType;

    public String getSinkType() {
        return this.sinkType;
    }

    public void setSinkType(String sinkType) {
        this.sinkType = sinkType;
    }

    private SinkType(String sinkType) {
        this.sinkType = sinkType;
    }
}
