package com.accp.service.impl;

import java.util.List;

import com.accp.entity.Goods;

public interface GoodsService {
	List<Goods> select();
	
	int insert (Goods goods);
	
	int update (Goods goods);
	
	int delete (int goodsId);
	
	Goods selectId(int goodsId);
}
