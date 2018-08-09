package com.accp.dao.impl;

import java.util.List;

import com.accp.entity.GoodsClass;
import com.accp.util.DbHelper;

public class GoodsClassDaoImpl implements GoodsClassDao {

	@Override
	public List<GoodsClass> selectAll() {
		String sql="select * from goodsClass";
		return DbHelper.Query(GoodsClass.class, sql);
	}

}
