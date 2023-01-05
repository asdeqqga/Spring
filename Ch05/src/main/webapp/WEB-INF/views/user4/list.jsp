<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>	
		<meta charset="UTF-8">
		<title>user4::list</title>
	</head>
<body>
	<h3>user4 목록</h3>
	<a href="/Ch05">Ch05 메인</a>
	<a href="/Ch05/user4/register">Ch05 user4 등록</a>
	
	<table border="1">
		<tr>
			<th>이름</th>
			<th>성별</th>
			<th>나이</th>
			<th>주소</th>
			<th>관리</th>
		</tr>
		<c:forEach var="user" items="${users}">
		<tr>
			<td>${user.name}</td>
			<td>${user.gender eq 1 ? '남자' : '여자'}</td>
			<td>${user.age}</td>
			<td>${user.addr}</td>
			<td>
				<a href="/Ch05/user4/modify?seq=${user.seq}">수정</a>		
				<a href="/Ch05/user4/delete?seq=${user.seq}">삭제</a>		
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>