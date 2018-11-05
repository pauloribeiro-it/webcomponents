<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
</head>
<body>
	Param: ${param['parametro']}<br/>
	bean.name = ${bean.name} <br/>
	bean[name] = ${bean['name']} <br/>
	applicationScope['bean']['name'] = ${applicationScope['bean']['name']} <br/>
	applicationScope.bean.name = ${applicationScope.bean.name}
</body>
</html>