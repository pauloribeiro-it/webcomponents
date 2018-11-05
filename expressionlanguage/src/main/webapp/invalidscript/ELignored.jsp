<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="true"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ELignored</title>
</head>
<body>
	Param: ${param['parametro']}<br/>
	<%=  request.getParameter("parametro") %> <!-- an error will be raised because scriptlet is not allowed -->
</body>
</html>