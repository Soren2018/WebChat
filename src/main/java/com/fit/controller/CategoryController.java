package com.fit.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fit.entity.Category;
import com.fit.service.CategoryService;

@CrossOrigin
@RestController
@RequestMapping("/category")
public class CategoryController {
 
    @Autowired
    private CategoryService categoryService;
 
    @RequestMapping("queryCategory/{id}")
    public Map<String, Object> queryImg(@PathVariable int id){
    	Map<String, Object> map = new HashMap<String, Object>();
    	
    	List<Category> categoryList = categoryService.queryCategory(id);
    	map.put("message"	, categoryList);
    	map.put("status"	, 200);
    	map.put("msg"		, "获取成功");
        return map;
    }
}
