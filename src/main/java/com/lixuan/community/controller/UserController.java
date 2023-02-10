package com.lixuan.community.controller;

import com.lixuan.community.result.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <p>
 * 用户表  前端控制器
 * </p>
 *
 * @author lixuan
 * @since 2023-02-09
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(path = "", method = RequestMethod.POST)
    public Result sendCode() {

    }
}
