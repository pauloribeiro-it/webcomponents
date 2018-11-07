<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>JSTL</title>
</head>
<body>

	<c:forEach begin="0" end="5" var="item" varStatus="position">
		Iteration number ${item} <br/>
		stat: ${position} <br/>
	</c:forEach>
</body>
</html>