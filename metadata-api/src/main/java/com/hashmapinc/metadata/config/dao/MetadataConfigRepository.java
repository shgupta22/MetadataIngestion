package com.hashmapinc.metadata.config.dao;

import com.hashmapinc.metadata.config.entity.MetadataConfigEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetadataConfigRepository extends JpaRepository<MetadataConfigEntity, String> {

}
