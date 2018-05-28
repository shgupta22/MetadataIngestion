package com.hashmapinc.metadata.config.dao;

import com.hashmapinc.metadata.config.model.MetadataConfig;
import org.springframework.data.repository.CrudRepository;

public interface MetadataConfigRepository extends CrudRepository<MetadataConfig, String> {

}
