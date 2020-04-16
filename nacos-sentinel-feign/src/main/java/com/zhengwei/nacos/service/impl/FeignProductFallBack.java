package com.zhengwei.nacos.service.impl;

import com.zhengwei.nacos.service.FeignProductService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Feign 降级处理
 *
 * @author zevin aibaokeji
 * @version 1.0
 * 2020/4/1317:08
 **/
@Component
public class FeignProductFallBack implements FeignProductService {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "sorry "+name+"，product has fail!";
    }
}
