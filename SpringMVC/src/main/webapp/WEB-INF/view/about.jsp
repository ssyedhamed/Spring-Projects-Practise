<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About </title>
</head>
<body>
	<h2>Hello this is about page</h2>
	<%
	String name=(String)request.getAttribute("name");
	int number=(Integer)request.getAttribute("rollNumber");
	%>
	<!--  
	<h1>Name = <%=name %></h1>
	<h1>Number = <%=number %></h1>
	-->
	<h1>{name}</h1>
	<h1>{number}</h1>
</body>
</html>