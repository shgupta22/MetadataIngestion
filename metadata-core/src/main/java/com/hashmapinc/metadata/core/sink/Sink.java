package com.hashmapinc.metadata.core.sink;

import com.hashmapinc.metadata.core.data.BaseData;
import com.hashmapinc.metadata.core.data.id.UUIDBased;

public abstract class Sink<I extends UUIDBased> extends BaseData<I> {

    private SinkType sinkType;

    public Sink() {
        super();
    }

    public Sink(I id) {
        super(id);
    }

    public Sink(Sink<I> sink) {
        super(sink);
    }

    public SinkType getSinkType() {
        return sinkType;
    }

    public void setSinkType(SinkType sinkType) {
        this.sinkType = sinkType;
    }
}
