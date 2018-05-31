//package com.hashmapinc.metadata.config.dao;
//
//import com.hashmapinc.metadata.config.model.MetadataConfig;
//import com.hashmapinc.metadata.core.util.UUIDConverter;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//public class MetadataConfigDaoImpl implements MetadataConfigDao {
//
//    @Autowired
//    private MetadataConfigRepository metadataConfigRepository;
//
//    @Override
//    public MetadataConfig save(MetadataConfig metadataConfig) {
//
//        return metadataConfigRepository.save(metadataConfig);
//    }
//
//    @Override
//    public Optional<MetadataConfig> findMetadataConfigById(UUID id) {
//        return Optional.of(metadataConfigRepository.findOne(UUIDConverter.fromTimeUUID(id)));
//    }
//
//    @Override
//    public Optional<MetadataConfig> findMetadataConfigByIdAndName(UUID id, String name) {
//        return null;
//    }
//
//    @Override
//    public Optional<MetadataConfig> findMetadataConfigBySourceId(UUID sourceId) {
//        return null;
//    }
//
//    @Override
//    public Optional<MetadataConfig> findMetadataConfigBySinkId(UUID sinkId) {
//        return null;
//    }
//
//    @Override
//    public List<MetadataConfig> find() {
//        return null;
//    }
//}
