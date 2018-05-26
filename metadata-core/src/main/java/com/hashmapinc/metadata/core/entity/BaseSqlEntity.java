package com.hashmapinc.metadata.core.entity;

import com.hashmapinc.metadata.core.entity.BaseEntity;
import com.hashmapinc.metadata.core.util.UUIDConverter;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@Data
@MappedSuperclass
public abstract class BaseSqlEntity<D> implements BaseEntity<D> {

    @Id
    @Column(name = "id")
    protected String id;

    @Override
    public UUID getId() {
        if (id == null) {
            return null;
        }
        return UUIDConverter.fromString(id);
    }

    public void setId(UUID id) {
        this.id = UUIDConverter.fromTimeUUID(id);
    }

    protected UUID toUUID(String src){
        return UUIDConverter.fromString(src);
    }

    protected String toString(UUID timeUUID){
        return UUIDConverter.fromTimeUUID(timeUUID);
    }

}
