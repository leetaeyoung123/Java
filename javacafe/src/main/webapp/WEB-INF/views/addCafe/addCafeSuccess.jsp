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
	<label>메뉴 등록완료 </label><br>
	<label>이름 : ${cafe.name}</label><br>
	<label>가격 : ${cafe.price}</label><br>
	<label>상위 카테고리: ${cafe.highCateGory}</label><br>
	<label>하위 카테고리: ${cafe.lowCateGory}</label><br>
</body>
</html>