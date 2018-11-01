<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
	<html xmlns="http://www.w3.org/1999/xhtml">
		<head>
			<title>Test JSP Page</title>
		</head>
		<body>
			<jsp:declaration>String param;</jsp:declaration>
			<jsp:scriptlet>param = request.getParameter("param");</jsp:scriptlet>
			<jsp:expression>param</jsp:expression>
		</body>
	</html>	
</jsp:root>
