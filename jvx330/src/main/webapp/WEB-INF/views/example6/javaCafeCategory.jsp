<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/default.css'/>"/>
</head>
<body>
<h3>메뉴</h3>
<form:form method="post" modelAttribute="javaCafeCategory">
	<label>coffee</label><form:radiobutton path="coffee"
						<form:option value="coffee"/>/>
	<label>cake</label><form:radiobutton path="cake" value="cake"/>
</form:form>
</body>
</html>