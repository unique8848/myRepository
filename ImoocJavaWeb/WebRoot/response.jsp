<%@ page language="java" contentType="text/html;charset=utf-8"
	import="java.util.*, java.io.*" pageEncoding="utf-8"%>
<%@ page import="java.text.*"%>
<%
	response.setContentType("text/html; charset=utf-8");
	out.println("<h1>resonse内置对象</h1>");
	out.println("<br>");
	
	PrintWriter outer = response.getWriter();
	outer.println("大家好，我是response对象生成的输出流outer对象");
	//response.sendRedirect("login.jsp");//请求重定向
	//response.sendRedirect("request.jsp");//请求重定向，相当于让客户名提交一个新的请求，上次请求的数据就丢了。
	request.getRequestDispatcher("request.jsp").forward(request, response);
%>