package com.fit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fit.dao.FloorProductMapper;
import com.fit.entity.FloorProduct;
import com.fit.service.FloorProductService;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class FloorProductServiceImpl implements FloorProductService {
	
	@Autowired
    FloorProductMapper floorProductMapper;
	
    public List<FloorProduct> queryFloorProduct(String typeCode){
        return floorProductMapper.queryFloorProduct(typeCode);
    }
}
