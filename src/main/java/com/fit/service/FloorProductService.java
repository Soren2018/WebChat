package com.fit.service;

import java.util.List;

import com.fit.entity.FloorProduct;

public interface FloorProductService {
	public List<FloorProduct> queryFloorProduct(String typeCode);
}
