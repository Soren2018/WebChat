package com.fit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fit.dao.BaseMapper;
import com.fit.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T> {

	@Autowired
    BaseMapper<T> baseMapper;
	
	@Override
	public List<T> queryObject(T obj) {
		return baseMapper.queryObject(obj);
	}

}
