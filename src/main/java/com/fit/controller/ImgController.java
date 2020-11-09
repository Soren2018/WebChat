package com.fit.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fit.entity.Img;
import com.fit.service.ImgService;

@CrossOrigin
@RestController
@RequestMapping("/img")
public class ImgController {
 
    @Autowired
    private ImgService imgService;
 
    @RequestMapping("queryImg/{id}")
    public Map<String, Object> queryImg(@PathVariable int id){
    	Map<String, Object> map = new HashMap<String, Object>();
    	
    	List<Img> imgList = imgService.queryImg(id);
    	map.put("message", imgList);
    	map.put("status", 200);
    	map.put("msg", "获取成功");
        return map;
    }
}
