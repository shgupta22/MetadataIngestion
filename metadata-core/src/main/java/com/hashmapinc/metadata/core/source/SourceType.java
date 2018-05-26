package com.hashmapinc.metadata.core.source;

public enum SourceType {
    JDBC("JDBC");

    private String sourceType;

    public String getSourceType() {
        return this.sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    private SourceType(String sourceType) {
        this.sourceType = sourceType;
    }
}
