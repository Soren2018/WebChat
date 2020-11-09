package com.fit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fit.entity.Category;
import com.fit.entity.FloorProduct;

/**
 * @Author: wch.wu
 * @Date: 2020/08/15
 */
@Mapper
public interface FloorProductMapper extends BaseMapper<FloorProduct>  {
 
	List<FloorProduct> queryFloorProduct(String typeCode);
}
