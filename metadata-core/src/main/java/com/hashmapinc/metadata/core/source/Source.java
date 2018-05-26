package com.hashmapinc.metadata.core.source;

public abstract class Source {

    private SourceType sourceType;

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }
}
