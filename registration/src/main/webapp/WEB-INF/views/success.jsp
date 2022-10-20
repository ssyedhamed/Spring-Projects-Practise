<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registered Successful</title>
</head>
<body>
	<h1>"<c:url value="/resources/images/${fileName}"/>"</h1>
	<%
	String name=(String)request.getAttribute("fileName");
	String path=session.getServletContext().getRealPath("/")+"resources/images/"+name;
	
	%>
	<h1><%=path %></h1>
	<img alt="<c:url value="/resources/images/${fileName}" />" src="<%=path%>"/>
</body>
</html>