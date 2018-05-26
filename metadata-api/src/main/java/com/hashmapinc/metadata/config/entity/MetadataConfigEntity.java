package com.hashmapinc.metadata.config.entity;

import com.hashmapinc.metadata.config.model.MetadataConfig;
import com.hashmapinc.metadata.config.model.MetadataConfigId;
import com.hashmapinc.metadata.core.constants.ModelConstants;
import com.hashmapinc.metadata.core.entity.BaseSqlEntity;
import com.hashmapinc.metadata.core.sink.SinkId;
import com.hashmapinc.metadata.core.source.SourceId;
import com.hashmapinc.metadata.core.trigger.TriggerType;
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

    @Column(name = ModelConstants.METADATA_CONFIG_SOURCE_ID)
    private SourceId sourceId;

    @Column(name = ModelConstants.METADATA_CONFIG_SINK_ID)
    private SinkId sinkId;

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
        this.sourceId = metadataConfig.getSourceId();
        this.sinkId = metadataConfig.getSinkId();
        this.triggerType = metadataConfig.getTriggerType();
        this.triggerSchedule = metadataConfig.getTriggerSchedule();
    }

    @Override
    public MetadataConfig toData() {
        MetadataConfig metadataConfig = new MetadataConfig(new MetadataConfigId(getId()));
        metadataConfig.setName(name);
        metadataConfig.setSourceId(sourceId);
        metadataConfig.setSinkId(sinkId);
        metadataConfig.setTriggerType(triggerType);
        metadataConfig.setTriggerSchedule(triggerSchedule);
        return metadataConfig;
    }
}
