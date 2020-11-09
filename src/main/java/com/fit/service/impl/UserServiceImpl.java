package com.fit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fit.dao.UserMapper;
import com.fit.entity.User;
import com.fit.service.UserService;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    UserMapper userMapper;
	
    public User sel(int id){
        return userMapper.sel(id);
    }
}
