package com.accp.entity;

public class Goods {
	private int goodsId;
	private String goodsName;
	private String goodsType;
	private int goodsClassId;
	private double goodsPrice;
	private String goodsClassName;
	public String getGoodsClassName() {
		return goodsClassName;
	}
	public void setGoodsClassName(String goodsClassName) {
		this.goodsClassName = goodsClassName;
	}
	public Goods() {
		super();
	}
	public Goods(String goodsName, String goodsType, int goodsClassId, double goodsPrice) {
		super();
		this.goodsName = goodsName;
		this.goodsType = goodsType;
		this.goodsClassId = goodsClassId;
		this.goodsPrice = goodsPrice;
	}
	public Goods(int goodsId, String goodsName, String goodsType, int goodsClassId, double goodsPrice) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsType = goodsType;
		this.goodsClassId = goodsClassId;
		this.goodsPrice = goodsPrice;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	public int getGoodsClassId() {
		return goodsClassId;
	}
	public void setGoodsClassId(int goodsClassId) {
		this.goodsClassId = goodsClassId;
	}
	public double getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
}
