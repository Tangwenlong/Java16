package com.accp.service.impl;

import java.util.List;

import com.accp.dao.impl.GoodsDao;
import com.accp.dao.impl.GoodsDaoImpl;
import com.accp.entity.Goods;

public class GoodsServiceImpl implements GoodsService {
	GoodsDao goodsdao=new GoodsDaoImpl();
	@Override
	public List<Goods> select() {
		// TODO Auto-generated method stub
		return this.goodsdao.select();
	}

	@Override
	public int insert(Goods goods) {
		// TODO Auto-generated method stub
		return this.goodsdao.insert(goods);
	}

	@Override
	public int update(Goods goods) {
		// TODO Auto-generated method stub
		return this.goodsdao.update(goods);
	}

	@Override
	public int delete(int goodsId) {
		// TODO Auto-generated method stub
		return this.goodsdao.delete(goodsId);
	}

	@Override
	public Goods selectId(int goodsId) {
		// TODO Auto-generated method stub
		return this.goodsdao.selectId(goodsId);
	}

}
