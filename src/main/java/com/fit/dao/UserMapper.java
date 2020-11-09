package com.fit.dao;

import org.apache.ibatis.annotations.Mapper;

import com.fit.entity.User;

/**
 * @Author: wch.wu
 * @Date: 2020/08/15
 */
@Mapper
public interface UserMapper extends BaseMapper<User>  {
 
    User sel(int id);
}
