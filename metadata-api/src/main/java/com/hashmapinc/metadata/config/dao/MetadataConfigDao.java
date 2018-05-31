//package com.hashmapinc.metadata.config.dao;
//
//import com.hashmapinc.metadata.config.model.MetadataConfig;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//public interface MetadataConfigDao {
//
//    MetadataConfig save(MetadataConfig metadataConfig);
//
//    Optional<MetadataConfig> findMetadataConfigById(UUID id);
//
//    Optional<MetadataConfig> findMetadataConfigByIdAndName(UUID id, String name);
//
//    Optional<MetadataConfig> findMetadataConfigBySourceId(UUID sourceId);
//
//    Optional<MetadataConfig> findMetadataConfigBySinkId(UUID sinkId);
//
//    List<MetadataConfig> find();
//}
