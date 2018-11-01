<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
</head>
<body>
	<%!String param;%>
	<%
		param = request.getParameter("param");
	%>
	Param: <%= param %>
</body>
</html>