<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
    <%@ page import="org.kh.dto.Member" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST 전송 결과</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<%
	request.setCharacterEncoding("UTF-8");
	/*request.setAttribute("no", request.getParameter("no"));
	request.setAttribute("id", request.getParameter("id"));
	request.setAttribute("pw", request.getParameter("pw"));
	request.setAttribute("name", request.getParameter("name"));
	String[] sports = request.getParameterValues("sports");
	int len = sports.length;*/
%>
<h2>POST 전송 결과1</h2>
<div>
	<p>pname : ${pname }</p>
	<p>rname : ${rname }</p>
	<p>sname : ${sname }</p>
	<p>aname : ${aname }</p>
	<p>tname : ${tname }</p>
</div>
<hr>
<h2>POST 전송 결과2</h2>
<div>
	<p>no : ${param.no }</p>
	<p>id : ${param.id }</p>
	<p>pw : ${param.pw }</p>
	<p>name : ${param.name }</p>
	<!-- 그냥 El은 전송이 안돼서(인식이안됨) request.setAttribue("", request.getParameter("")); 타입으로 해줘야한다 
	param. 을 써준다-->
	<p>좋아하는 스포츠</p>
	<ul>		
		<li>${paramValues.sports[0] }</li>
		<li>${paramValues.sports[1] }</li>	
		<li>${paramValues.sports[2] }</li>	
		<li>${paramValues.sports[3] }</li>	
		<li>${paramValues.sports[4] }</li>	
	</ul>
</div>
</body>
</html>