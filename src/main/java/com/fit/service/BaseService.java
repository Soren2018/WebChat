package com.fit.service;

import java.util.List;

public interface BaseService<T> {
	public List<T> queryObject(T obj);
}
