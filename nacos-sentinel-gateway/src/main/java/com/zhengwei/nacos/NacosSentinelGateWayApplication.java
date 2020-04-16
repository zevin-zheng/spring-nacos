package com.zhengwei.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class NacosSentinelGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosSentinelGateWayApplication.class, args);
    }
}
