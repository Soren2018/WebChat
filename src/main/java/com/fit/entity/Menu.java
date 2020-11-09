package com.fit.entity;

import java.util.List;

public class Menu {
    private Integer catId;
    private Integer catPid;
    private String catName;
    private Integer catLevel;
    private String catDeleted;
    private String catIcon;
    private List<Menu> children;
    
	public Integer getCatId() {
		return catId;
	}
	public void setCatId(Integer catId) {
		this.catId = catId;
	}
	public Integer getCatPid() {
		return catPid;
	}
	public void setCatPid(Integer catPid) {
		this.catPid = catPid;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public Integer getCatLevel() {
		return catLevel;
	}
	public void setCatLevel(Integer catLevel) {
		this.catLevel = catLevel;
	}
	public String getCatDeleted() {
		return catDeleted;
	}
	public void setCatDeleted(String catDeleted) {
		this.catDeleted = catDeleted;
	}
	public String getCatIcon() {
		return catIcon;
	}
	public void setCatIcon(String catIcon) {
		this.catIcon = catIcon;
	}
	public List<Menu> getChildren() {
		return children;
	}
	public void setChildren(List<Menu> children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "Menu [catId=" + catId + ", catPid=" + catPid + ", catName=" + catName + ", catLevel=" + catLevel
				+ ", catDeleted=" + catDeleted + ", catIcon=" + catIcon + ", children=" + children + "]";
	}
	
}
