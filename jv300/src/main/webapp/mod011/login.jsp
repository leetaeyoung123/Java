<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		아이디: <input type="text" name= "userId"/><br>
		비밀번호 : <input type="password" name="passwd"/><br>
		<input type="submit" value="로그인"/>
		<button><a  href='<c:url value="/mod010/signup.jsp"/>'>회원가입</a></button>
	</form>
</body>
</html>