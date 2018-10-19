package com.dy.service.impl;

import com.dy.mapper.UsersMapper;
import com.dy.pojo.Users;
import com.dy.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersMapper usersMapper;
    @Override
    public int insRegister(Users users) {
        return usersMapper.insUsers(users);
    }
}
