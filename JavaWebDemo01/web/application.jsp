<%@ page language="java" contentType="text/html;charset=utf-8"
	import="java.util.*,java.text.*" pageEncoding="utf-8"%>
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
			application内置对象
		</h1>
		<%
			application.setAttribute("city", "北京");
			application.setAttribute("postalcode", "10000");
			application.setAttribute("email", "zhangsan@126.com");
		%>
		所在的城市是：<%=application.getAttribute("city") %>
		application中的属性有：<%
			Enumeration attributes = application.getAttributeNames();
			while(attributes.hasMoreElements()){
				out.println(attributes.nextElement() + "&nbsp;&nbsp;");
			}
		 %><br>
		 JSP(Servlet)引擎名及版本号：<%=application.getServerInfo() %>>
	</body>
</html>
