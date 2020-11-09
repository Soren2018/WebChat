package com.fit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fit.dao.ProductTypeMapper;
import com.fit.entity.ProductType;
import com.fit.service.ProductTypeService;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class ProductTypeServiceImpl implements ProductTypeService {
	
	@Autowired
    ProductTypeMapper productTypeMapper;
	
    public List<ProductType> queryProductType(){
        return productTypeMapper.queryProductType();
    }
}
