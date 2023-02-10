package com.lixuan.community.pojo.DTO;

import lombok.Data;

/**
 * @author z7
 * @version 2023/02/10/10:47
 * @description 注册用户对象
 */
@Data
public class RegisterDTO {

    private String phone;

    private String code;

    private String password;
}
