package com.hashmapinc.metadata.config.install;

import com.hashmapinc.metadata.config.exceptions.MetadataInstallException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Paths;

@Service
//@Profile("install")
@Slf4j
public class MetadataServiceInstall {

    @Value("${install.data_dir}")
    private String dataDir;

    @Autowired
    private DatabaseSchemaService databaseSchemaService;

    public void performInstall() {
        try {
            log.info("Starting Metadata Ingestion Service Installation...");

            if (this.dataDir == null) {
                throw new RuntimeException("'install.data_dir' property should specified!");
            }
            if (!Files.isDirectory(Paths.get(this.dataDir))) {
                throw new RuntimeException("'install.data_dir' property value is not a valid directory!");
            }

            log.info("Installing DataBase schema...");

            databaseSchemaService.createDatabaseSchema();
        } catch (Exception e) {
            log.error("Unexpected error during Metadata Ingestion Service installation!", e);
            throw new MetadataInstallException("Unexpected error during Metadata Ingestion Service installation!", e);
        }
    }
}
