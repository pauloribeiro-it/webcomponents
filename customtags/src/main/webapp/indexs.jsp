<%@ taglib uri="http://www.garnerpress.com/books/scwcd1.4/mytags" prefix="mysimpletags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import="java.util.*" %>

<html>
<head>
  <title>SCWCD Tags Test</title>
</head>

<body>

<h1>Simple Tags</h1>

<h2>Conditional</h2>

<mysimpletags:if test="true">
  <p>This should display okay</p>
</mysimpletags:if>

<mysimpletags:if test="false">
  <p>This shouldn't display at all</p>
</mysimpletags:if>

<h2>for Loop</h2>


</body>
</html>