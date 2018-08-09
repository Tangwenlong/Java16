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
	<form action="baseServlet?method=doUpdate" method="post">
		<input type="hidden" name="goodsId" value="${goods.goodsId}">
		<table>
			<tr>
				<td>名称</td>
				<td><input name="goodsName" value="${goods.goodsName}"></td>
			</tr>
			<tr>
				<td>类型</td>
				<td><input name="goodsType" value="${goods.goodsType}"></td>
			</tr>
			<tr>
				<td>分类</td>
				<td><select name="goodsClassId">
					<c:forEach items="${goodsClass}" var="item">
						<option value="${item.goodsClassId}" ${goods.goodsClassId==item.goodsClassId?'selected':''}>${item.goodsClassName}</option>
					</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>价格</td>
				<td><input name="goodsPrice" value="${goods.goodsPrice}"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="保存"></td>
			</tr>
		</table>
	</form>
</body>
</html>