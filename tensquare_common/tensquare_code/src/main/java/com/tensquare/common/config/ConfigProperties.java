package com.tensquare.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @auther tangh
 * @date 2019/1/7 0007 19:42
 */
@Configuration
@ConfigurationProperties(prefix = "config", ignoreUnknownFields = false)
@PropertySource("classpath:config/config.properties")
@Component
public class ConfigProperties {

    private String snowflakeSystemCodeId;
    private String snowflakeWorkCodeId;

    public String getSnowflakeSystemCodeId() {
        return snowflakeSystemCodeId;
    }

    public void setSnowflakeSystemCodeId(String snowflakeSystemCodeId) {
        this.snowflakeSystemCodeId = snowflakeSystemCodeId;
    }

    public String getSnowflakeWorkCodeId() {
        return snowflakeWorkCodeId;
    }

    public void setSnowflakeWorkCodeId(String snowflakeWorkCodeId) {
        this.snowflakeWorkCodeId = snowflakeWorkCodeId;
    }
}
