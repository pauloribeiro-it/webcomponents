<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>JSTL</title>
</head>
<body>
	<% List<String> objects = new ArrayList<String>();
		objects.add("first");
		objects.add("second");
		objects.add("third");
		objects.add("fourth");
		int begin = 0;
		int end = 4;
		pageContext.setAttribute("objects",objects);
		pageContext.setAttribute("begin",0);
		pageContext.setAttribute("end",4);
		
		String token = "a;b;c;d;e";
		pageContext.setAttribute("token",token);
	%>
	<h4>Common iteration</h4>
	<c:forEach begin="0" end="5" var="item" varStatus="position">
		Iteration number ${item} <br/>
		stat: ${position.index} <br/>
	</c:forEach>
	
	<h4>Objects iteration</h4>
	<c:forEach items="${objects}" var="obj" varStatus="idx">
		${obj}<br/>
	</c:forEach>
	
	<h4>Tokenization</h4>
	<c:forTokens items="${token}" delims=";" var="current">
		${current}
	</c:forTokens>
</body>
</html>