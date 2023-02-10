package com.lixuan.community.result;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author z7
 * @version 2023/02/09/19:47
 * @description
 */
@Data
public class Result {

    private Integer code;

    private String message;

    private Map<String, Object> data = new HashMap<>();

    private Result() {}

    /**
     * 返回成功的结果
     * @return
     */
    public static Result success() {
        Result result = new Result();
        result.setCode(ResponseEnum.SUCCESS.getCode());
        result.setMessage(ResponseEnum.SUCCESS.getMessage());
        return result;
    }

    /**
     * 返回失败的结果
     * @return
     */
    public static Result error() {
        Result result = new Result();
        result.setCode(ResponseEnum.ERROR.getCode());
        result.setMessage(ResponseEnum.ERROR.getMessage());
        return result;
    }

    /**
     * 返回特定结果
     * @param responseEnum
     * @return
     */
    public static Result setResult(ResponseEnum responseEnum) {
        Result result = new Result();
        result.setCode(responseEnum.getCode());
        result.setMessage(result.getMessage());
        return result;
    }

    public Result message(String message){
        this.setMessage(message);
        return this;
    }

    public Result code(Integer code){
        this.setCode(code);
        return this;
    }

    public Result data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public Result data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}
