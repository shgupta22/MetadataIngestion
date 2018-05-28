package com.hashmapinc.metadata.core.constants;

import java.util.UUID;

public class ModelConstants {

    private ModelConstants() {
    }

    /**
     * Generic constants.
     */
    public static final String ID_PROPERTY = "id";
    public static final String METADATA_CONFIG_ID = "metadata_id";
    public static final String SOURCE_ID = "source_id";
    public static final String SINK_ID = "sink_id";
    public static final String TRIGGER_ID = "trigger_id";

    /**
     * Metadata Config Constants
     */
    public static final String METADATA_CONFIG_TABLE_NAME = "metadata_config";
    public static final String METADATA_CONFIG_NAME = "name";
    public static final String METADATA_CONFIG_SOURCE_ID = "source_id";
    public static final String METADATA_CONFIG_SINK_ID = "sink_id";
    public static final String METADATA_CONFIG_TRIGGER_TYPE = "trigger_type";
    public static final String METADATA_CONFIG_TRIGGER_SCHEDULE = "trigger_schdl";

    /**
     * JDBC Source Constants
     */
    public static final String JDBC_TABLE_NAME = "jdbc";
    public static final String JDBC_DBURL = "db_url";
    public static final String JDBC_USERNAME = "username";
    public static final String JDBC_PASSWORD = "password";

    /**
     * REST Sink Constants
     */
    public static final String REST_SINK_TABLE_NAME = "rest_sink";
    public static final String REST_URL = "url";
    public static final String REST_USERNAME = "username";
    public static final String REST_PASSWORD = "password";
}
