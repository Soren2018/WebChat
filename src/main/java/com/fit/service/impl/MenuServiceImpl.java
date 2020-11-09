package com.fit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fit.dao.MenuMapper;
import com.fit.entity.Menu;
import com.fit.service.MenuService;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class MenuServiceImpl implements MenuService {
	
	@Autowired
    MenuMapper MenuMapper;

	@Override
	public List<Menu> queryMenu(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Menu> queryObject(Menu obj) {
		return MenuMapper.queryObject(obj);
	}
}
