package com.zhengwei.nacos;

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import com.zhengwei.nacos.util.RestTemplateFallBack;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients
public class NacosSentinelFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosSentinelFeignApplication.class, args);
    }

    /**
     * SentinelRestTemplate 开启 Sentinel对RestTemplate的支持
     */
    @Bean
    @LoadBalanced
    @SentinelRestTemplate(blockHandler = "handleException", blockHandlerClass = RestTemplateFallBack.class)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
