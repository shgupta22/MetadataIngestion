CREATE TABLE IF NOT EXISTS metadata_config (
    id varchar(31) NOT NULL CONSTRAINT user_settings_pkey PRIMARY KEY,
    name varchar NOT NULL,
    source_id varchar(31),
    sink_id varchar(31),
    trigger_type varchar,
    trigger_schdl varchar
    CONSTRAINT unq_code UNIQUE name
);