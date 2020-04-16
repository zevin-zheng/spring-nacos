package com.zhengwei.nacos.controller;

import com.zhengwei.nacos.service.FeignProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${description}
 *
 * @author zhengwei 卓望信息(北京)
 * @version 1.0
 * @since 1.0
 * 2019/5/22 11:45
 **/
@RestController
public class ConsumerController {

    @Autowired
    private FeignProductService feignProductService;

    @GetMapping("/hello/{name}")
    public String index(@PathVariable("name") String name){
        return  feignProductService.hello(name);
    }
}
