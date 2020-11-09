package com.fit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fit.dao.CategoryMapper;
import com.fit.entity.Category;
import com.fit.service.CategoryService;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
    CategoryMapper categoryMapper;
	
    public List<Category> queryCategory(int id){
        return categoryMapper.queryCategory(id);
    }
}
