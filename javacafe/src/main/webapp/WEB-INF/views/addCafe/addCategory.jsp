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

<form:form method="post" modelAttribute="cate">
	<label>카테고리: </label>
	<form:select path="cateName">
	<option value="unknown">--선택--</option>
	<form:options items="${cateGoryList}"/>
	</form:select><br>
	<input type="submit" value="카테고리 설정"/>
</form:form>

</body>
</html>