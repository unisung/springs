<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<h2>상세 조회</h2>
<c:if test="${msg!=null }">${msg }</c:if>
<table>
	<tr><th>제목</th><td>${board.title}</td></tr>
	<tr><th>작성자</th><td>${board.writer}</td></tr>
	<tr><th>내용</th><td><pre>${board.content}</pre></td></tr>	
	<tr><th>조회수</th><td>${board.hit}</td></tr>	
	<tr><th>작성일</th><td>
		<fmt:formatDate value="${board.regDate}" 
				pattern="yyyy/MM/dd"/></td></tr>
</table>
	<input type="button" value="수정" 
		onclick="location.href='updateForm.do?id=${board.id}'">
	<input type="button" value="삭제" 
		onclick="location.href='delete.do?id=${board.id}'">
	<input type="button" value="목록" 
		onclick="location.href='list.do'">
</body>
</html>