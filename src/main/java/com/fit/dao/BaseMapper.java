package com.fit.dao;

import java.util.List;

public interface BaseMapper<T> {
	
	List<T> queryObject(T obj);

}
