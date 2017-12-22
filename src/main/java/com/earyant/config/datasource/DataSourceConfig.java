package com.earyant.config.datasource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by earyant on 2017 : 09 : 2017/9/21 0021 : 11:36 : .
 * idc  com.earyant.config.datasource
 */
@Configuration
public class DataSourceConfig {
    @Bean(name = "primaryDS")
    @Qualifier("primaryDS")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource.primary")
    public DataSource primaryDataSource(){
        return DataSourceBuilder.create().type( com.alibaba.druid.pool.DruidDataSource.class ).build();
    }

    @Bean(name = "secondaryDS")
    @Qualifier("secondaryDS")
    @ConfigurationProperties(prefix="spring.datasource.secondary")
    public DataSource secondaryDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean("sysJdbcTemplate")
    public JdbcTemplate sysJdbcTemplate(@Qualifier("primaryDS") DataSource ds) {
        return new JdbcTemplate(ds);
    }

    @Bean("busJdbcTemplate")
    public JdbcTemplate busJdbcTemplate(@Qualifier("secondaryDS") DataSource ds) {
        return new JdbcTemplate(ds);
    }
}
