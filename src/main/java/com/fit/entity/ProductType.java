package com.fit.entity;

import java.util.List;

public class ProductType {
    private Integer id;
    private String name;
    private String imageSrc;
    private String typeCode;
    private List<FloorProduct> floorProductList;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageSrc() {
		return imageSrc;
	}
	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public List<FloorProduct> getFloorProductList() {
		return floorProductList;
	}
	public void setFloorProductList(List<FloorProduct> floorProductList) {
		this.floorProductList = floorProductList;
	}
	@Override
	public String toString() {
		return "ProductType [id=" + id + ", name=" + name + ", imageSrc=" + imageSrc + ", typeCode=" + typeCode
				+ ", floorProductList=" + floorProductList + "]";
	} 
}
