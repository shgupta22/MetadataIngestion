package com.hashmapinc.metadata.config.entity;

import com.hashmapinc.metadata.config.model.MetadataConfig;
import com.hashmapinc.metadata.config.model.MetadataConfigId;
import com.hashmapinc.metadata.core.constants.ModelConstants;
import com.hashmapinc.metadata.core.data.id.UUIDBased;
import com.hashmapinc.metadata.core.datalake.DataLake;
import com.hashmapinc.metadata.core.entity.BaseSqlEntity;
import com.hashmapinc.metadata.core.source.Source;
import com.hashmapinc.metadata.core.trigger.TriggerType;
import com.hashmapinc.metadata.core.util.UUIDConverter;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = ModelConstants.METADATA_CONFIG_TABLE_NAME)
public class MetadataConfigEntity extends BaseSqlEntity<MetadataConfig> {

    @Column(name = ModelConstants.METADATA_CONFIG_NAME)
    private String name;

//    @OneToOne(cascade = CascadeType.ALL)
    @Column(name = ModelConstants.METADATA_CONFIG_SOURCE_ID)
    private DataLake source;

//    @OneToOne(cascade = CascadeType.ALL)
    @Column(name =  ModelConstants.METADATA_CONFIG_SINK_ID)
    private DataLake sink;

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
        }

        this.name = metadataConfig.getName();
        this.source = metadataConfig.getSource();
        this.sink = metadataConfig.getSink();
        this.triggerType = metadataConfig.getTriggerType();
        this.triggerSchedule = metadataConfig.getTriggerSchedule();
    }

    @Override
    public MetadataConfig toData() {
        MetadataConfig metadataConfig = new MetadataConfig(new MetadataConfigId(getId()));
        metadataConfig.setName(name);
        metadataConfig.setSource(source);
        metadataConfig.setSink(sink);
        metadataConfig.setTriggerType(triggerType);
        metadataConfig.setTriggerSchedule(triggerSchedule);
        return metadataConfig;
    }
}
