package com.miracle.springbootvue.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.miracle.springbootvue.entity.User;
import com.miracle.springbootvue.mapper.UserMapper;
import com.miracle.springbootvue.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author miracle
 * @since 2020-08-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
