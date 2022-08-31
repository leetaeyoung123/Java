<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">
	<label>아이디 :</label><input type="text" name="rootId">
	<label>비밀번호 :</label><input type="text" name="rootPw">
	<button type="submit">로그인</button>
</form>
</body>
</html>