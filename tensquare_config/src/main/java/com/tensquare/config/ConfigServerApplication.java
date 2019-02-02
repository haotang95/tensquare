package com.tensquare.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName ConfigServerApplication
 * @auther tangh
 * @date 2019/2/2 0002 23:24
 */
@EnableConfigServer
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class);
    }

}
