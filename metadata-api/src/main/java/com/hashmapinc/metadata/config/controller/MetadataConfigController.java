package com.hashmapinc.metadata.config.controller;

import com.hashmapinc.metadata.config.dao.MetadataConfigRepository;
import com.hashmapinc.metadata.config.entity.MetadataConfigEntity;
import com.hashmapinc.metadata.config.model.MetadataConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metaconfig")
public class MetadataConfigController {

    @Autowired
    MetadataConfigRepository metadataConfigRepository;

    @RequestMapping(value = "/account", method = RequestMethod.POST)
    public MetadataConfigEntity createAccount(@RequestBody MetadataConfig metadataConfig) {
        System.out.println("In Post request.... {}" + metadataConfig.getName());
        return metadataConfigRepository.save(new MetadataConfigEntity(metadataConfig));
    }
}
