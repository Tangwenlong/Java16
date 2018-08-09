package com.accp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accp.entity.Goods;
import com.accp.service.impl.GoodsClassService;
import com.accp.service.impl.GoodsClassServiceImpl;
import com.accp.service.impl.GoodsService;
import com.accp.service.impl.GoodsServiceImpl;

@WebServlet("/baseServlet")
public class Servlet extends baseServlet{
	
	private static final long serialVersionUID = 1L;
	GoodsService goodsService=new GoodsServiceImpl();
	GoodsClassService goodsClassService=new GoodsClassServiceImpl();
	
	protected void select(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("goods",this.goodsService.select());
		request.getRequestDispatcher("/WEB-INF/page/cha.jsp").forward(request, response);
	}
	
	protected void insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("goodsClass", this.goodsClassService.selectAll());
		
		request.getRequestDispatcher("/WEB-INF/page/insert.jsp").forward(request, response);
	}
	
	protected void doInsert(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String goodsName=request.getParameter("goodsName");
		String goodsType=request.getParameter("goodsType");
		int goodsClassId=Integer.parseInt(request.getParameter("goodsClassId"));
		double goodsPrice=Double.parseDouble(request.getParameter("goodsPrice"));
		Goods goods=new Goods(goodsName, goodsType, goodsClassId, goodsPrice);
		int i=this.goodsService.insert(goods);
		response.sendRedirect(request.getContextPath()+"/baseServlet");
	}
	
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String goodsId=request.getParameter("goodsId");
		Goods goods=this.goodsService.selectId(Integer.parseInt(goodsId));
		request.setAttribute("goods",goods);
		
		request.setAttribute("goodsClass",this.goodsClassService.selectAll());
		request.getRequestDispatcher("/WEB-INF/page/update.jsp").forward(request, response);
	}
	
	protected void doUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int goodsId=Integer.parseInt(request.getParameter("goodsId"));
		String goodsName=request.getParameter("goodsName");
		String goodsType=request.getParameter("goodsType");
		int goodsClassId=Integer.parseInt(request.getParameter("goodsClassId"));
		double goodsPrice=Double.parseDouble(request.getParameter("goodsPrice"));
		Goods goods=new Goods(goodsId, goodsName, goodsType, goodsClassId, goodsPrice);
		int i=this.goodsService.update(goods);
		response.sendRedirect(request.getContextPath()+"/baseServlet");
	}
	
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String goodsId=request.getParameter("goodsId");
		int i=this.goodsService.delete(Integer.parseInt(goodsId));
		response.sendRedirect(request.getContextPath()+"/baseServlet");
	}
}
