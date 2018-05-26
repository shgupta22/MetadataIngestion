package com.hashmapinc.metadata.core.source.jdbc.model;

import com.hashmapinc.metadata.core.source.Source;
import com.hashmapinc.metadata.core.source.SourceType;

public class JdbcSource extends Source<JdbcSourceId> {

    private String dbUrl;
    private String username;
    private String password;

    public JdbcSource() {
        super();
    }

    public JdbcSource(JdbcSourceId id) {
        super(id);
    }

    public JdbcSource(JdbcSource jdbcSource) {
        super(jdbcSource);
        this.setSourceType(jdbcSource.getSourceType());
        this.dbUrl = jdbcSource.dbUrl;
        this.username = jdbcSource.username;
        this.password = jdbcSource.password;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "JdbcSource{" +
                "dbUrl=" + dbUrl +
                ", username=" + username +
                ", password=" + password +
                '}';
    }
}
