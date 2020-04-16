package com.zhengwei.nacos.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * TODO
 *
 * @author zevin aibaokeji
 * @version 1.0
 * 2020/4/1117:14
 **/
@Data
@AllArgsConstructor
public class ResponseData implements Serializable {

    private Integer code;

    private String message;
}
