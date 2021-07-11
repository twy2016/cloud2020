package com.twy.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gongpeng
 * @date 2021/7/8 20:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public static CommonResult ok(String message, Object data) {
        return new CommonResult(200, message, data);
    }

    public static CommonResult ok(String message) {
        return new CommonResult(200, message, null);
    }

    public static CommonResult fail(String message) {
        return new CommonResult(500, message);
    }

}
