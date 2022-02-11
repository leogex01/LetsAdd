<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<style>
a:hover{ background-color: yellow;}
</style>
<head>
<meta charset="UTF-8">
<title>Sums</title>
</head>
<h1 style="color: blue" > Sums</h1>
<p>${userExpression.getSum()}</p>

<a href="index.jsp">Try another expression.</a>
<body>

</body>
</html>