package com.hashmapinc.metadata.config.service;

import com.hashmapinc.metadata.config.model.MetadataConfig;
import com.hashmapinc.metadata.config.model.MetadataConfigId;

public interface MetadataConfigService  {

    MetadataConfig findMetadataConfigById(MetadataConfigId metadataConfigId);

    MetadataConfig saveMetadataConfig(MetadataConfig metadataConfig);

    void deleteMetadataConfig(MetadataConfigId metadataConfigId);

}