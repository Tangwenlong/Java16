package com.accp.dao.impl;

import java.util.List;

import com.accp.entity.Goods;

public interface GoodsDao {
	/**
	 * 查询Goods表
	 * @return
	 */
	List<Goods> select();
	/**
	 * 添加Goods表
	 * @param goods
	 * @return
	 */
	int insert(Goods goods);
	/**
	 * 修改Goods表
	 * @param goods
	 * @return
	 */
	int update(Goods goods);
	/**
	 * 删除Goods表
	 * @param goodsId
	 * @return
	 */
	int delete(int goodsId);
	/**
	 * 查询Goods Id
	 * @param goodsId
	 * @return
	 */
	Goods selectId(int goodsId);
}
