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

<form:form method="post" modelAttribute="cafe">
	<label>카테고리: </label>
	<form:select path="highCateGory">
		<option value="unknown">--선택--</option>
		<c:forEach var="x" items="${javacate}">
			<form:options items="${x.categoryname}"/>
		</c:forEach>
	</form:select><br>
	<label>이름: </label><form:input path="name"/>
	<label>가격: </label><form:input path="price"/>
	<label>개수: </label><form:input path="stock"/>
	<label>카테고리: </label><form:input path="lowCateGory"/>
	<input type="submit" value="카테고리 설정"/>
</form:form>
</body>
</html>

<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.net.URLEncoder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Menu</title>
</head>
<body>
   <h3>메뉴 추가</h3>
         <select name="highCateGory">
            <option value="unknown">--선택--</option>
               <c:forEach var="x" items="${javacate}">
            <option value="${x.cateName}">${x.cateName}</option>
               </c:forEach>  
         </select>
      <button>Add</button>
   </form>
</body>
</html> --%>