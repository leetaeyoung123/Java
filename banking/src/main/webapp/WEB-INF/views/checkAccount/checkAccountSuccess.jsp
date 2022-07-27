<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<body>
<h3>신규계좌</h3>
	<c:forEach var="item" items="${account}">
		<label>아이디: </label>${item.customerId}<br>
		<label>계좌번호: </label>${item.accountNum}<br>
		<label>계좌타입: </label>${item.accType}<br>
		---------------------------------------------<br>
	</c:forEach>
</body>
</html>