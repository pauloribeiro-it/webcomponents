<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:jsp="http://java.sun.com/JSP/Page">
<body>
	<!-- scope is used to determine from where the bean will be recovered -->
	<!-- using beanName and type will force to retrieve the bean from one of the possible scopes and if any bean is found then a new instance will be created -->
	<jsp:useBean id="beanCtx" beanName="jspfragments.Bean" type="jspfragments.Bean" scope="application"></jsp:useBean><!-- retrieve from the servletContext, scope="page" will create a new one  -->
	<jsp:getProperty property="value" name="beanCtx" />
	<jsp:getProperty property="name" name="beanCtx" />
	<%--<id="beanCtx" class="jspfragments.Bean" scope="application"></jsp:useBean> will instantiate--%>
	
</body>
</html>
