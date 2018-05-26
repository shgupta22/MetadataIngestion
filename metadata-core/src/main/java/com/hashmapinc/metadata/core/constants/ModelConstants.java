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
     * Source Constants
     */
    public static final String SOURCE_TYPE = "source_type";
    public static final String SOURCE_NAME = "source_name";

    /**
     * JDBC Source Constants
     */
    public static final String JDBC_SOURCE_TABLE_NAME = "jdbc_source";
    public static final String JDBC_SOURCE_DBURL = "dburl";
    public static final String JDBC_SOURCE_USERNAME = "username";
    public static final String JDBC_SOURCE_PASSWORD = "password";

    /**
     * Sink Constants
     */
    public static final String SINK_TYPE = "sink_type";
    public static final String SINK_NAME = "sink_name";

    /**
     * REST Sink Constants
     */
    public static final String REST_SINK_TABLE_NAME = "rest_sink";
}
