<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head>
<body><h2>게시판</h2>
<a href="writeForm.do">글쓰기</a>
<table>
	<tr><th>번호</th><th>제목</th><th>작성자</th>
		<th>조회수</th><th>작성일</th></tr>
	<c:set var="num" value="${total }"></c:set>
	<c:forEach items="${list }" var="board">
		<tr><td>${num }</td>
		<td><a href="detail.do?id=${board.id}">${board.title}</a></td>
			<td>${board.writer}</td><td>${board.hit}</td>
			<td><fmt:formatDate value="${board.regDate}" 
				pattern="yyyy/MM/dd"/></td></tr>
		<c:set var="num" value="${num - 1 }"></c:set>	
	</c:forEach>
</table>
<form action="search.do" method="post">
	제목 : <input type="text" name="search" required="required">
	<input type="submit" value="검색">	
</form>
</body>
</html>