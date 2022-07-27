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
	<form action="addAccount" method="post">
		<label>계좌 유형: </label>
		<select name = "accType">
			 <option value="S">S</option>
	         <option value="C">C</option>
		</select>
		<label>아이디: </label><input type="text" name="customerId"><br>
		<label>계좌번호 :</label><input type="text" name="accountNum"><br>
		<input type="submit" value="계좌 신청"/>
	</form>
</body>
</html>