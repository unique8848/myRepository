<%@ page language="java" contentType="text/html;charset=utf-8"
	import="java.util.*,java.text.*" pageEncoding="utf-8"%>
<%@ page import="java.text.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String s = sdf.format(d);
	out.println(s + "<br>");
%>
