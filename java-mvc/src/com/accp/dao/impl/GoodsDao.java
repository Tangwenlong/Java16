package com.accp.dao.impl;

import java.util.List;

import com.accp.entity.Goods;

public interface GoodsDao {
	/**
	 * ��ѯGoods��
	 * @return
	 */
	List<Goods> select();
	/**
	 * ���Goods��
	 * @param goods
	 * @return
	 */
	int insert(Goods goods);
	/**
	 * �޸�Goods��
	 * @param goods
	 * @return
	 */
	int update(Goods goods);
	/**
	 * ɾ��Goods��
	 * @param goodsId
	 * @return
	 */
	int delete(int goodsId);
	/**
	 * ��ѯGoods Id
	 * @param goodsId
	 * @return
	 */
	Goods selectId(int goodsId);
}
