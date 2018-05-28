package com.hashmapinc.metadata.core.dataresource;

import com.hashmapinc.metadata.core.data.BaseData;
import com.hashmapinc.metadata.core.data.id.UUIDBased;

public interface DataResource {

    void push();

    void pull();
}
