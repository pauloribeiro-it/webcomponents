<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="jspfragments.Bean"%>
	
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:jsp="http://java.sun.com/JSP/Page">
<body>
	<% pageContext.setAttribute("bean1", new Bean("nome",10)); %>
	<!-- scope is used to determine from where the bean will be recovered -->
	<!-- using beanName and type will force to retrieve the bean from one of the possible scopes and if any bean is found then a new instance will be created -->
	<%--<jsp:useBean id="beanCtx" beanName="jspfragments.Bean" type="jspfragments.Bean" scope="application"></jsp:useBean> --%><!-- retrieve from the servletContext, scope="page" will create a new one  -->
	<%--<jsp:useBean id="beanCtx" type="jspfragments.Bean" scope="application"/> --%> <%-- <jsp:useBean id="beanCtx" type="jspfragments.Bean"/> will cause an error because beanCtx is in application scope--%> 
	<jsp:useBean id="beanCtx" class="jspfragments.Bean"  scope="application"/>
	<jsp:getProperty property="value" name="beanCtx" />
	<%--<jsp:getProperty property="name" name="beanCtx" /><br/> --%>
	<jsp:useBean id="bean1" beanName="jspfragments.Bean" type="jspfragments.Bean"/>
	<jsp:getProperty property="name" name="bean1"/>
	<%--<id="beanCtx" class="jspfragments.Bean" scope="application"></jsp:useBean> will instantiate--%>
	
</body>
</html>
