package com.zhengwei.nacos.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 修改FeignClient增加fallback熔断处理
 *
 * @author zhengwei 卓望信息(北京)
 * @version 1.0
 * @since 1.0
 * 2019/5/24 11:07
 **/
@FeignClient(name = "nacos-product-server")
public interface FeignProductService {

    @GetMapping("hello")
    public String hello(@RequestParam(value = "name") String name);
}
