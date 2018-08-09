package com.accp.entity;

public class GoodsClass {
	private int goodsClassId;
	private String goodsClassName;
	public GoodsClass() {
		super();
	}
	public GoodsClass(int goodsClassId, String goodsClassName) {
		super();
		this.goodsClassId = goodsClassId;
		this.goodsClassName = goodsClassName;
	}
	public int getGoodsClassId() {
		return goodsClassId;
	}
	public void setGoodsClassId(int goodsClassId) {
		this.goodsClassId = goodsClassId;
	}
	public String getGoodsClassName() {
		return goodsClassName;
	}
	public void setGoodsClassName(String goodsClassName) {
		this.goodsClassName = goodsClassName;
	}
}
