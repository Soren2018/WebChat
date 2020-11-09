package com.fit.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fit.entity.FloorProduct;
import com.fit.entity.ProductType;
import com.fit.service.FloorProductService;
import com.fit.service.ProductTypeService;

@CrossOrigin
@RestController
@RequestMapping("/productType")
public class ProductTypeController {
 
    @Autowired
    private ProductTypeService productTypeService;
    
    @Autowired
    private FloorProductService floorProductService;
 
    @RequestMapping("queryProductType")
    public Map<String, Object> queryProductType(){
    	Map<String, Object> map = new HashMap<String, Object>();
    	
    	List<ProductType> productTypeList = productTypeService.queryProductType();
    	for (ProductType productType : productTypeList) {
    		List<FloorProduct> floorProductList = floorProductService.queryFloorProduct(productType.getTypeCode());
			productType.setFloorProductList(floorProductList);
		}
    	
    	map.put("message", productTypeList);
    	map.put("status", 200);
    	map.put("msg", "获取成功");
        return map;
    }
}
