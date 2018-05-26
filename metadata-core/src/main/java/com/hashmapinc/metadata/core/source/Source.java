package com.hashmapinc.metadata.core.source;

import com.hashmapinc.metadata.core.data.BaseData;
import com.hashmapinc.metadata.core.data.id.UUIDBased;

public abstract class Source<I extends UUIDBased> extends BaseData<I> {

    private SourceType sourceType;

    public Source() {
        super();
    }

    public Source(I id) {
        super(id);
    }

    public Source(Source<I> source) {
        super(source);
    }

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }
}
