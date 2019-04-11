package com.wust.sharding.service;

import com.wust.sharding.entity.User;
import com.wust.sharding.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public void insert(User user) {
        userMapper.insert(user);
    }

}
