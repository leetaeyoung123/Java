<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<body>
<h3>메뉴 추가</h3>

<form action="addCafe" method="post" enctype=multipart/form-data>  
	<label>카테고리: </label>
	
		<select name="highCateGory">
			<option value="unknown">--선택--</option>
			<c:forEach var="item" items="${javacate}">
				<option value="${item.categoryname}">${item.categoryname}</option>
			</c:forEach>
		</select><br>
		
	<label>이름: </label><input type=text name="name"/><br>
	<label>가격: </label><input type=text name="price"/><br>
	<label>재고: </label><input type=text name="stock"/><br>
	<label>하위 카테고리: </label><input type="text" name="lowCateGory"/><br>
	<label>이미지 선택: </label><input type="file" name="file"><br>
	<input type="submit" value="카테고리 설정"/><br>
</form>
</body>
</html>