package com.hashmapinc.metadata.config.dao;

import com.hashmapinc.metadata.config.model.MetadataConfig;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MetadataConfigDao {

    MetadataConfig save(MetadataConfig metadataConfig);

    Optional<MetadataConfig> findById(UUID id);

    List<MetadataConfig> find();

    boolean removeById(UUID id);
}
