package com.accp.dao.impl;

import java.util.List;

import com.accp.entity.Goods;
import com.accp.util.DbHelper;

public class GoodsDaoImpl implements GoodsDao {

	@Override
	public List<Goods> select() {
		String sql="SELECT a.`goodsId`,a.`goodsName`,a.`goodsType`,a.`goodsClassId`,a.`goodsPrice`,b.`goodsClassName` FROM goods AS a JOIN goodsClass AS b ON a.`goodsClassId`=b.`goodsClassId`";
		return DbHelper.Query(Goods.class,sql);
	}

	@Override
	public int insert(Goods goods) {
		String sql="insert into Goods(goodsName,goodsType,goodsClassId,goodsPrice) values(?,?,?,?)";
		return DbHelper.update(sql,goods.getGoodsName(),goods.getGoodsType(),goods.getGoodsClassId(),goods.getGoodsPrice());
	}

	@Override
	public int update(Goods goods) {
		String sql="update goods set goodsName=?,goodsType=?,goodsClassId=?,goodsPrice=? where goodsId=?";
		return DbHelper.update(sql, goods.getGoodsName(),goods.getGoodsType(),goods.getGoodsClassId(),goods.getGoodsPrice(),goods.getGoodsId());
	}

	@Override
	public int delete(int goodsId) {
		String sql="delete from goods where goodsId=?";
		return DbHelper.update(sql, goodsId);
	}

	@Override
	public Goods selectId(int goodsId) {
		String sql="select * from goods where goodsId=?";
		List<Goods>list=DbHelper.Query(Goods.class, sql, goodsId);
		if(list!=null&&list.size()!=0) {
			return list.get(0);
		}
		return null;
	}

}
