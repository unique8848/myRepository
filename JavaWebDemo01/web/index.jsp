<%@ page language="java" contentType="text/html;charset=utf-8"
	import="java.util.*" pageEncoding="utf-8"%>
<%@ page import = "java.text.*" %>
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
			欢迎大家学习JAVAEE开发
		</h1>
		<%!String s = "张三";//表示声明了一个字符串变量

	int add(int x, int y) {//声明了一个返回整型的函数
		return x + y;
	}%>
		<%
			out.println("大家好，欢迎大家学习javaEE开发！");
		%>
		<br>
		你好，<%=s%><br>
		x+y=<%=add(10, 5)%><br>
		<%
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String s = sdf.format(new Date());
		 %>
		 今天是：<%=s %>
	</body>
</html>
