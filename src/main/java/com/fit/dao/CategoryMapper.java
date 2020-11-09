package com.fit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fit.entity.Category;

/**
 * @Author: wch.wu
 * @Date: 2020/08/15
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
 
	List<Category> queryCategory(int id);
}
