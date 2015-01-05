<%@ page language="java" contentType="text/html;charset=utf-8"
	import="java.util.*" pageEncoding="utf-8" errorPage="exception_test.jsp"%>
<%@ page import="java.text.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>我的个人主页</title>
		<meta http-equiv="Content-type" content="text/html;charset=utf-8">
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	</head>

	<body>
		<h1>
			测试异常页面
		</h1>
		<hr>
		<%
			System.out.println(100 / 0);//抛出运行时异常，算术异常
		%>
	</body>
</html>
