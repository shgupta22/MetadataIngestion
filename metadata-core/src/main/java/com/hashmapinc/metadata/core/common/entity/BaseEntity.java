package com.hashmapinc.metadata.core.common.entity;


import java.util.UUID;

public interface BaseEntity<D> extends ToData<D> {

    UUID getId();

    void setId(UUID id);

}