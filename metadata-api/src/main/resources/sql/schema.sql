CREATE TABLE IF NOT EXISTS metadata_config (
    id varchar(31) NOT NULL CONSTRAINT metadata_config_pkey PRIMARY KEY,
    name varchar NOT NULL,
    source_id varchar(31) NOT NULL,
    sink_id varchar(31) NOT NULL,
    trigger_type varchar NOT NULL,
    trigger_schdl varchar
);

CREATE TABLE IF NOT EXISTS jdbc (
    id varchar(31) NOT NULL CONSTRAINT jdbc_pkey PRIMARY KEY,
    db_url varchar NOT NULL,
    username varchar NOT NULL,
    password  varchar NOT NULL
);

CREATE TABLE IF NOT EXISTS rest (
    id varchar(31) NOT NULL CONSTRAINT rest_pkey PRIMARY KEY,
    url varchar NOT NULL,
    username varchar NOT NULL,
    password  varchar NOT NULL
);
