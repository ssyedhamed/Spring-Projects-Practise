<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Successfully Registered</title>
</head>
<body>
	<h1><%=request.getParameter("username")  %></h1>
	<h1><%=request.getParameter("password")  %></h1>
	<h1><%=request.getParameter("email")  %></h1>
</body>
</html>