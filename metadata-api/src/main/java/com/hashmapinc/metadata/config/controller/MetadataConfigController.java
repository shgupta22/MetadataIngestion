package com.hashmapinc.metadata.config.controller;

import com.hashmapinc.metadata.config.model.MetadataConfig;
import com.hashmapinc.metadata.config.model.MetadataConfigId;
import com.hashmapinc.metadata.config.service.MetadataConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

//TODO: Add exception handling
//TODO: Add Logging
@RestController
@RequestMapping("/api")
public class MetadataConfigController {

    @Autowired
    private MetadataConfigService metadataConfigService;

    @RequestMapping(value = "/metaconfig", method = RequestMethod.POST)
    public MetadataConfig saveMetadataConfig(@RequestBody MetadataConfig metadataConfig) {
        return metadataConfigService.saveMetadataConfig(metadataConfig);
    }

    @RequestMapping(value = "/metaconfig/{id}", method = RequestMethod.GET)
    public MetadataConfig getMetadataConfig(@PathVariable String id){
        MetadataConfigId  metadataConfigId =  new MetadataConfigId(UUID.fromString(id));
        return metadataConfigService.findMetaDataConfigById(metadataConfigId);
    }

    @RequestMapping(value = "/metaconfig/{id}", method = RequestMethod.DELETE)
    public void deleteMetadataConfig(@PathVariable String id) {
        MetadataConfigId  metadataConfigId =  new MetadataConfigId(UUID.fromString(id));
        metadataConfigService.deleteMetadataConfig(metadataConfigId);
    }

}
