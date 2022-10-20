<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
	<h1>Hello
	<%=request.getAttribute("name")%> This is home page</h1>
	<ul>
	<% List<String> friends=(List<String>)request.getAttribute("friends"); 
	for(String friend:(List<String>)request.getAttribute("friends")){
		
	%>
	<li><%=friend %></li>
	<%
	}	
	%>
	
	
	
	</ul>
</body>
</html>