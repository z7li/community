package com.lixuan.community.service.impl;

import com.lixuan.community.pojo.entity.User;
import com.lixuan.community.mapper.UserDao;
import com.lixuan.community.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表  服务实现类
 * </p>
 *
 * @author lixuan
 * @since 2023-02-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
