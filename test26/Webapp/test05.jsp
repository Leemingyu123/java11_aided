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
<title>표현언어의 비교문장</title>
</head>
<body>
<hr>
<c:set scope="application" var="num3" value="30" />
<%
	pageContext.setAttribute("num1", 9);
	pageContext.setAttribute("num2", "10");
	pageContext.setAttribute("nullStr", null);
	pageContext.setAttribute("emptyStr", "");
	pageContext.setAttribute("lengthZero", new Integer[0]);//배열0개
	pageContext.setAttribute("sizeZero", new ArrayList());
	
	session.setAttribute("sid", "lee");	//"lee"란 아이디로 로그인 중
	//"admin"이면 관리자 로그인 중 이 출력됨
%>
<%@ include file="menu.jsp" %>
<h2>표현언어의 비교문장 </h2>
<div>
	<c:if test="${sid.equals('admin') }">		<!-- test조건식 ""안에는 ''을 쓴다-->
		<p>관리자 로그인 중</p>
	</c:if>
	<c:if test="${not empty sid }">		<!-- sid가 비어있지 않으면  -->
		<p>${sid }님 로그인 중</p>
	</c:if>
	<c:if test="${empty sid }">		<!-- sid가 비어있으면  -->
		<p>현재 로그인중이 아닙니다.</p>
	</c:if>
</div>
<hr>
<div>
	<h3>Empty 비교 확인</h3>
	<p>empty nullStr : ${empty nullStr }</p>
	<p>empty emptyStr : ${empty emptyStr }</p>
	<p>empty lengthZero : ${empty lengthZero }</p>
	<p>empty sizeZero : ${empty sizeZero }</p>
</div>
<hr>
<div>
	<h3>삼항 연상자</h3>
	<p>num1 %gt; num2 ? "참" : "거짓" => ${num1 gt num2 ? "num1이 더 크다" : "num2가 더 크다" }</p>
	<!-- %gt; 는 > 랑 같다 -->
</div>
<div>
	<h3>null 연상자</h3>
	<p>null +10 = ${null+10 }</p> <!-- null, nullStr, noVar 은 0으로 -->
	<p>nullStr +10 = ${nullStr+10 }</p>
	<p>param.noVar > 10 = ${param.noVar > 10 }</p>
	<p>num3 = ${num3 }</p>
</div>
</body>
</html>