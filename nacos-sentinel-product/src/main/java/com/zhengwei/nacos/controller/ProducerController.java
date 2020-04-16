package com.zhengwei.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * RefreshScope 自动刷新配置
 *
 * @author zhengwei 卓望信息(北京)
 * @version 1.0
 * @since 1.0
 * 2019/5/22 11:45
 **/
@RestController
@RefreshScope
public class ProducerController {

    @Value("${server.port}")
    String port;

    @Value("${useLocalCache:false}")
    private String useLocalCache;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "nacos product "+name+"，from "+ port+ " this ["+ useLocalCache +"]";
    }
}
