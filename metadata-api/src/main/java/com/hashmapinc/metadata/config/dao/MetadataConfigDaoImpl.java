package com.hashmapinc.metadata.config.dao;

import com.hashmapinc.metadata.config.entity.MetadataConfigEntity;
import com.hashmapinc.metadata.config.model.MetadataConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.hashmapinc.metadata.core.util.UUIDConverter.fromTimeUUID;

//TODO: write the Dao utils having generic methods
//TODO: See @Transactional functionality
@Component
public class MetadataConfigDaoImpl implements MetadataConfigDao {

    @Autowired
    private MetadataConfigRepository metadataConfigRepository;

    @Override
    @Transactional
    public MetadataConfig save(MetadataConfig metadataConfig) {
        return metadataConfigRepository.save(new MetadataConfigEntity(metadataConfig)).toData();
    }

    @Override
    public Optional<MetadataConfig> findById(UUID id) {
        String key = fromTimeUUID(id);
        return Optional.of(metadataConfigRepository.findOne(key).toData());
    }

    @Override
    public List<MetadataConfig> find() {
        return null;
    }

    @Override
    @Transactional
    public boolean removeById(UUID id){
        String key = fromTimeUUID(id);
        metadataConfigRepository.delete(key);
        return metadataConfigRepository.findOne(key) == null;
    }

}
