package com.fit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fit.dao.ImgMapper;
import com.fit.entity.Img;
import com.fit.service.ImgService;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class ImgServiceImpl implements ImgService {
	
	@Autowired
    ImgMapper imgMapper;
	
    public List<Img> queryImg(int id){
        return imgMapper.queryImg(id);
    }
}
