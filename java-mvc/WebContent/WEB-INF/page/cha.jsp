<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>名称</td>
				<td>类型</td>
				<td>分类</td>
				<td>价格</td>
				<td>操作</td>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${goods}" var="item">
			<tr>
				<td>${item.goodsName}</td>
				<td>${item.goodsType}</td>
				<td>${item.goodsClassName}</td>
				<td>${item.goodsPrice}</td>
				<td>
					<a href="baseServlet?method=delete&goodsId=${item.goodsId}" onclick="return confirm('确定删除吗?')">删除</a>
					<a href="baseServlet?method=update&goodsId=${item.goodsId}">修改</a>
				</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="baseServlet?method=insert">新增</a>
</body>
</html>