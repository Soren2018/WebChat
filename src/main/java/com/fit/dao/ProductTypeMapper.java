package com.fit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fit.entity.ProductType;

/**
 * @Author: wch.wu
 * @Date: 2020/08/15
 */
@Mapper
public interface ProductTypeMapper extends BaseMapper<ProductType>  {
 
	List<ProductType> queryProductType();
}
