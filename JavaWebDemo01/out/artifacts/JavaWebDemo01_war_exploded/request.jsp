<%@ page language="java" contentType="text/html;charset=utf-8"
	import="java.util.*" pageEncoding="utf-8"%>
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
			request内置对象
		</h1>
		<%
			request.setCharacterEncoding("utf-8");//用于解决中文乱码问题，但无法解决URL传参问题，需修改TOMCAT配置文件，且修改后还需要重启。
			request.setAttribute("password", "123456");
		%>
		用户名：<%=request.getParameter("username")%>
		爱好：<%
			if (request.getParameterValues("favorite") != null) {
				String[] favorites = request.getParameterValues("favorite");
				for (int i = 0; i < favorites.length; i++) {
					out.println(favorites[i] + "&nbsp;&nbsp;");
				}
			}
		%><br>
		密码：<%=request.getAttribute("password")%><br>
		请求体的MIME类型：<%=request.getContentType()%><br>
		协议类型和版本号：<%=request.getProtocol()%><br>
		服务器的主机名：<%=request.getServerName()%><br>
		服务器对应的端口号：<%=request.getServerPort()%><br>
		请求文件的长度：<%=request.getContentLength()%>byte
		<br>
		请求客户端的IP地址：<%=request.getRemoteAddr()%><br>
		请求的真实路径：<%=request.getRealPath("request.jsp")%><br>
		请求的上下文路径：<%=request.getContextPath()%><br>
	</body>
</html>