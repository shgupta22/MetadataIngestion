package com.hashmapinc.metadata.core.dataresource.jdbc.entity;

import com.hashmapinc.metadata.core.constants.ModelConstants;
import com.hashmapinc.metadata.core.entity.BaseSqlEntity;
import com.hashmapinc.metadata.core.dataresource.jdbc.model.JdbcResource;
import com.hashmapinc.metadata.core.dataresource.jdbc.model.JdbcResourceId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = ModelConstants.JDBC_TABLE_NAME)
public class JdbcResourceEntity extends BaseSqlEntity<JdbcResource> {

    @Column(name = ModelConstants.JDBC_DBURL)
    private String dbUrl;

    @Column(name = ModelConstants.JDBC_USERNAME)
    private String username;

    @Column(name = ModelConstants.JDBC_PASSWORD)
    private String password;

    public JdbcResourceEntity() {
        super();
    }

    public JdbcResourceEntity(JdbcResource jdbcResource) {
        if (jdbcResource.getId() != null) {
            this.setId(jdbcResource.getId().getId());
        }

        this.dbUrl = jdbcResource.getDbUrl();
        this.username = jdbcResource.getUsername();
        this.password = jdbcResource.getPassword();
    }

    @Override
    public JdbcResource toData() {
        JdbcResource jdbcResource = new JdbcResource(new JdbcResourceId(getId()));
        jdbcResource.setDbUrl(dbUrl);
        jdbcResource.setUsername(username);
        jdbcResource.setPassword(password);
        return jdbcResource;
    }
}
