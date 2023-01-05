<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>	
		<meta charset="UTF-8">
		<title>user4::modify</title>
	</head>
<body>
	<h3>user4 수정</h3>
	<a href="/Ch05">Ch05 메인</a>
	<a href="/Ch05/user4/list">user4 목록</a>
	
	<form action="/Ch05/user4/modify?seq=${user.seq}" method="post">
		<table border="1">
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" value="${user.name}"></td>
			</tr>
			<tr>
				<td>성별</td>
				<td>
					<label><input type="radio" name="gender" value="1" ${user.gender eq 1 ? 'checked' : ''}>남</label>
					<label><input type="radio" name="gender" value="2" ${user.gender eq 2 ? 'checked' : ''}>여</label>
				</td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="number" name="age" value="${user.age}"></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="addr" value="${user.addr}"></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="수정"></td>
			</tr>
		</table>
	</form>
</body>
</html>