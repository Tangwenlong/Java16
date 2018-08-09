package com.accp.service.impl;

import java.util.List;

import com.accp.dao.impl.GoodsClassDao;
import com.accp.dao.impl.GoodsClassDaoImpl;
import com.accp.entity.GoodsClass;

public class GoodsClassServiceImpl implements GoodsClassService {
	GoodsClassDao goodsclassdao=new GoodsClassDaoImpl();
	@Override
	public List<GoodsClass> selectAll() {
		// TODO Auto-generated method stub
		return this.goodsclassdao.selectAll();
	}

}
