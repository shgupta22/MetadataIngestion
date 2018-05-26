package com.hashmapinc.metadata.config.model;

import com.hashmapinc.metadata.core.data.BaseData;
import com.hashmapinc.metadata.core.sink.SinkId;
import com.hashmapinc.metadata.core.source.SourceId;
import com.hashmapinc.metadata.core.trigger.TriggerType;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
public class MetadataConfig extends BaseData<MetadataConfigId> {

    private String name;
    private SourceId sourceId;
    private SinkId sinkId;
    private TriggerType triggerType;
    private String triggerSchedule;

    public MetadataConfig() {
        super();
    }

    public MetadataConfig(MetadataConfigId id) {
        super(id);
    }

    public MetadataConfig(MetadataConfig metadataConfig) {
        super(metadataConfig);
        this.name = metadataConfig.name;
        this.sourceId = metadataConfig.sourceId;
        this.sinkId = metadataConfig.sinkId;
        this.triggerType = metadataConfig.triggerType;
        this.triggerSchedule = metadataConfig.triggerSchedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SourceId getSourceId() {
        return sourceId;
    }

    public void setSourceId(SourceId sourceId) {
        this.sourceId = sourceId;
    }

    public SinkId getSinkId() {
        return sinkId;
    }

    public void setSinkId(SinkId sinkId) {
        this.sinkId = sinkId;
    }

    public TriggerType getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(TriggerType triggerType) {
        this.triggerType = triggerType;
    }

    public String getTriggerSchedule() {
        return triggerSchedule;
    }

    public void setTriggerSchedule(String triggerSchedule) {
        this.triggerSchedule = triggerSchedule;
    }

    @Override
    public String toString() {
        return "MetadataConfig{" +
                "name=" + name +
                ", sourceId=" + sourceId +
                ", sinkId=" + sinkId +
                ", triggerType=" + triggerType +
                ", triggerSchedule=" + triggerSchedule +
                '}';
    }
}
