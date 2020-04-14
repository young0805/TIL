<%@ page contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>

<%
	String uid= request.getParameter("id");
	String str= "출력 아이디: " + uid+ "<br><br>";
	out.print(str);
	
	String date = (new Date()).toString();
%>
로그인 시간: <%= date %>