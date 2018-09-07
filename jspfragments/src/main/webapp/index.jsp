<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:jsp="http://java.sun.com/JSP/Page">
<body>
	<jsp:useBean id="beanCtx" beanName="jspfragments.Bean" type="jspfragments.Bean" scope="application">
	</jsp:useBean>
	<jsp:getProperty property="value" name="beanCtx" />
	<jsp:getProperty property="name" name="beanCtx" />

</body>
</html>
