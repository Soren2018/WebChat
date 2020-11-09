package com.fit.entity;

public class Img {
    private Integer goodsId;
    private String imageSrc;
    private String openType;
    private String navigatorUrl;
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public String getImageSrc() {
		return imageSrc;
	}
	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}
	public String getOpenType() {
		return openType;
	}
	public void setOpenType(String openType) {
		this.openType = openType;
	}
	public String getNavigatorUrl() {
		return navigatorUrl;
	}
	public void setNavigatorUrl(String navigatorUrl) {
		this.navigatorUrl = navigatorUrl;
	}
	@Override
	public String toString() {
		return "Img [goodsId=" + goodsId + ", imageSrc=" + imageSrc + ", openType=" + openType + ", navigatorUrl="
				+ navigatorUrl + "]";
	}
	
}
