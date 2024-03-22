<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹의 객체 전달과 스코프(Scope) 알기</title>
</head>
<body>
<h2>웹의 객체 전달과 스코프(Scope) 알기</h2>
<%
	List<String> lst = new ArrayList<String>();
	lst.add("이민규");
	lst.add("이정희");
	lst.add("이원석");
	lst.add("이예린");
	lst.add("이연정");
	request.setAttribute("lst", lst);
	
	Set<String> set = new HashSet<>();
	set.add("조대신");
	set.add("조우진");
	set.add("최태영");
	set.add("한태역");
	request.setAttribute("set", set);
	
	Map<Integer, String> map = new HashMap<>();
	map.put(1, "김동연");
	map.put(2, "김민식");
	map.put(3, "김민아");
	map.put(4, "김윤정");
	map.put(5, "김응원");
	map.put(6, "김필규");
	request.setAttribute("map", map);
	
	RequestDispatcher rd = request.getRequestDispatcher("test08.jsp"); //목적지 지정
	rd.forward(request, response); //데이터 전달
	response.sendRedirect("test08.jsp");	//데이터 이동(화면이동x) : URL은 test07.jsp이지만, 화면의 내용은 test08.jsp로나온다
%>
<h2>객체 데이터 전달하기(여기 안나오고 테스트 08로 가버림)</h2>

</body>
</html>