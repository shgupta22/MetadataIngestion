package com.hashmapinc.metadata.core.source.jdbc.entity;

import com.hashmapinc.metadata.core.constants.ModelConstants;
import com.hashmapinc.metadata.core.entity.BaseSqlEntity;
import com.hashmapinc.metadata.core.source.SourceType;
import com.hashmapinc.metadata.core.source.jdbc.model.JdbcSource;
import com.hashmapinc.metadata.core.source.jdbc.model.JdbcSourceId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = ModelConstants.JDBC_SOURCE_TABLE_NAME)
public class JdbcSourceEntity extends BaseSqlEntity<JdbcSource> {

    @Column(name = ModelConstants.SOURCE_NAME)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = ModelConstants.SOURCE_TYPE)
    private SourceType sourceType;

    @Column(name = ModelConstants.JDBC_SOURCE_DBURL)
    private String dbUrl;

    @Column(name = ModelConstants.JDBC_SOURCE_USERNAME)
    private String username;

    @Column(name = ModelConstants.JDBC_SOURCE_PASSWORD)
    private String password;

    public JdbcSourceEntity() {
        super();
    }

    public JdbcSourceEntity(JdbcSource jdbcSource) {
        if (jdbcSource.getId() != null) {
            this.setId(jdbcSource.getId().getId());
        }

        this.sourceType = jdbcSource.getSourceType();
        this.dbUrl = jdbcSource.getDbUrl();
        this.username = jdbcSource.getUsername();
        this.password = jdbcSource.getPassword();
    }

    @Override
    public JdbcSource toData() {
        JdbcSource jdbcSource = new JdbcSource(new JdbcSourceId(getId()));
        jdbcSource.setSourceType(sourceType);
        jdbcSource.setDbUrl(dbUrl);
        jdbcSource.setUsername(username);
        jdbcSource.setPassword(password);
        return jdbcSource;
    }
}
