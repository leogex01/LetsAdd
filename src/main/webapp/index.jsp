<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add4Fun</title>
</head>
<body>
<h1>Adding is F-F-Fun!!!!!!</h1>
<h3>Only using two terms this time.</h3>
<form action="getTermsServlet" method="post">
	Enter the 1st term: 
	<input type= "text" name="firstTerm" size="10"><br>
	Enter the 2nd term:
	<input type= "text" name="secondTerm" size="10">
	<input type= "submit" value="Enter Terms"/>
	</form>
</body>
</html>