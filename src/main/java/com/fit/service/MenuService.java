package com.fit.service;

import java.util.List;

import com.fit.entity.Menu;

public interface MenuService extends BaseService<Menu> {
	public List<Menu> queryMenu(int id);
}
