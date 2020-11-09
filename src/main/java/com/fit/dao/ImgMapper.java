package com.fit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fit.entity.Category;
import com.fit.entity.Img;

/**
 * @Author: wch.wu
 * @Date: 2020/08/15
 */
@Mapper
public interface ImgMapper extends BaseMapper<Img>  {
 
	List<Img> queryImg(int id);
}
