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
			sessoin内置对象
		</h1>
		<hr>
		<%
			SimpleDateFormat sdf = new SimpleDateFormat(
					"yyyy年-MM月-dd日 HH:mm:ss");
			Date d = new Date(session.getCreationTime());
			session.setAttribute("username", "admin");
			session.setAttribute("password", "123456");
			session.setAttribute("age", "30");
			
			//session.setMaxInactiveInterval(10);
		%>
		Session创建时间：<%=sdf.format(d)%><br>
		Session的ID编号：<%=session.getId()%><br>
		从Session中获取用户名：<%=session.getAttribute("username")%>
		Session中保存的属性有：<%
			String[] names = session.getValueNames();
			for (int i = 0; i < names.length; i++) {
				out.println(names[i] + "&nbsp;");
			}
			//session.invalidate();//销毁当前会话
		%>
		<a href="sessionPage2.jsp" target="_blank">跳转到sessionPage2.jsp</a>
	</body>
</html>
