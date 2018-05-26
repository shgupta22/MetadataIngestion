package com.hashmapinc.metadata.core.entity;

import com.hashmapinc.metadata.core.entity.ToData;

import java.util.UUID;

public interface BaseEntity<D> extends ToData<D> {

    UUID getId();

    void setId(UUID id);

}