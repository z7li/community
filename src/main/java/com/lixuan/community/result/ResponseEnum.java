package com.lixuan.community.result;

import lombok.*;

/**
 * @author z7
 * @version 2023/02/09/19:44
 * @description
 */
@Getter
@AllArgsConstructor
@ToString
public enum ResponseEnum {
    SUCCESS(0, "SUCCESS"),
    ERROR(-1, "ERROR")
    ;

    /**
     * 响应状态码
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String message;
}
