<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>In home page index file</h1>

<%
 String name = (String) request.getAttribute("name");

%>
 <h1>
 Name is transfered from Model
 <%= name %>
 </h1>

</body>
</html>