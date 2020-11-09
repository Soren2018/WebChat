package com.fit.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fit.entity.Menu;
import com.fit.service.MenuService;

@CrossOrigin
@RestController
@RequestMapping("/menu")
public class MenuController {
 
    @Autowired
    private MenuService MenuService;
 
    @RequestMapping("queryMenu")
    public Map<String, Object> queryMenu(Menu menu){
    	Map<String, Object> map = new HashMap<String, Object>();
    	
    	List<Menu> menuList = MenuService.queryObject(menu);
    	setChildren(menuList);
    	map.put("message"	, menuList);
    	map.put("status"	, 200);
    	map.put("msg"		, "获取成功");
        return map;
    }

	private void setChildren(List<Menu> menuList) {
		for (Menu tempMenu : menuList) {
    		Menu menu1 = new Menu();
    		menu1.setCatPid(tempMenu.getCatId());
    		List<Menu> menuList2 = MenuService.queryObject(menu1);
    		tempMenu.setChildren(menuList2);
    		
    		if(tempMenu.getCatLevel() == 2) {
    			return;
    		} else {
    			setChildren(menuList2);
    		}
		}
	}
    
    
}
