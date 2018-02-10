<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title></head><body>
<h2>게시글 수정</h2>
<form action="update.do" method="post">
<input type="hidden" name="id" value="${board.id }">
<table>
	<tr><th>제목</th><td><input type="text" name="title" 
		required="required" value="${board.title }"></td></tr>
	<tr><th>작성자</th><td><input type="text" name="writer" 
		required="required" value="${board.writer }"></td></tr>
	<tr><th>내용</th><td><textarea rows="10" cols="50" 
		name="content" required="required">${board.content }</textarea></td></tr>
	<tr><td colspan="2"><input type="submit" value="확인">
		<input type="reset" value="취소"></td></tr>
</table>
</form>
</body>
</html>