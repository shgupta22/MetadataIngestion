package com.hashmapinc.metadata.config.entity;

import com.fasterxml.uuid.Generators;
import com.hashmapinc.metadata.config.model.MetadataConfig;
import com.hashmapinc.metadata.config.model.MetadataConfigId;
import com.hashmapinc.metadata.core.common.constants.ModelConstants;
import com.hashmapinc.metadata.core.common.entity.BaseSqlEntity;
import com.hashmapinc.metadata.core.data.resource.DataResource;
import com.hashmapinc.metadata.core.data.resource.jdbc.model.JdbcResource;
import com.hashmapinc.metadata.core.data.resource.jdbc.model.JdbcResourceId;
import com.hashmapinc.metadata.core.data.resource.rest.model.RestResource;
import com.hashmapinc.metadata.core.data.resource.rest.model.RestResourceId;
import com.hashmapinc.metadata.core.trigger.TriggerType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;


import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Slf4j
@Table(name = ModelConstants.METADATA_CONFIG_TABLE_NAME)
public class MetadataConfigEntity extends BaseSqlEntity<MetadataConfig> {

    @Column(name = ModelConstants.METADATA_CONFIG_NAME)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private DataResourceEntity source;

    @OneToOne(cascade = CascadeType.ALL)
    private DataResourceEntity sink;

    @Enumerated(EnumType.STRING)
    @Column(name = ModelConstants.METADATA_CONFIG_TRIGGER_TYPE)
    private TriggerType triggerType;

    @Column(name = ModelConstants.METADATA_CONFIG_TRIGGER_SCHEDULE)
    private String triggerSchedule;

    public MetadataConfigEntity() {
        super();
    }

    public MetadataConfigEntity(MetadataConfig metadataConfig) {
        if (metadataConfig.getId() != null) {
            this.setId(metadataConfig.getId().getId());
        } else {
            this.setId(Generators.timeBasedGenerator().generate());
        }

        this.name = metadataConfig.getName();

        this.source = getDataResourceEntity(metadataConfig.getSource());
        this.sink = getDataResourceEntity(metadataConfig.getSink());
        this.triggerType = metadataConfig.getTriggerType();
        this.triggerSchedule = metadataConfig.getTriggerSchedule();
    }

    @Override
    public MetadataConfig toData() {
        MetadataConfig metadataConfig = new MetadataConfig(new MetadataConfigId(getId()));
        metadataConfig.setName(name);
        metadataConfig.setSource(getDataResource(source));
        metadataConfig.setSink(getDataResource(sink));
        metadataConfig.setTriggerType(triggerType);
        metadataConfig.setTriggerSchedule(triggerSchedule);
        return metadataConfig;
    }

    private DataResourceEntity getDataResourceEntity(DataResource dataResource) {
        if (dataResource instanceof JdbcResource) {
            return new JdbcResourceEntity((JdbcResource) dataResource);
        }
        if (dataResource instanceof RestResource) {
            return new RestResourceEntity((RestResource) dataResource);
        }
        return null;
    }

    private DataResource getDataResource(DataResourceEntity dataResourceEntity) {
        if (dataResourceEntity instanceof JdbcResourceEntity) {
            JdbcResource jdbcResource = new JdbcResource();
            jdbcResource.setId(new JdbcResourceId(dataResourceEntity.getId()));
            jdbcResource.setDbUrl(((JdbcResourceEntity) dataResourceEntity).getDbUrl());
            jdbcResource.setUsername(((JdbcResourceEntity) dataResourceEntity).getUsername());
            jdbcResource.setPassword(((JdbcResourceEntity) dataResourceEntity).getPassword());
            return jdbcResource;
        }
        if (dataResourceEntity instanceof RestResourceEntity) {
            RestResource restResource = new RestResource();
            restResource.setId(new RestResourceId(dataResourceEntity.getId()));
            restResource.setUrl(((RestResourceEntity) dataResourceEntity).getUrl());
            restResource.setUsername(((RestResourceEntity) dataResourceEntity).getUsername());
            restResource.setPassword(((RestResourceEntity) dataResourceEntity).getPassword());
            return restResource;
        }
        return null;
    }
}
