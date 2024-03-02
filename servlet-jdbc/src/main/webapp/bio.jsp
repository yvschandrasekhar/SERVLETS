<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="bbb" method="post">
	<pre>
		NAME  : <input type="text" name="n"></input>
		AGE   : <input type="text" name="a"></input>
		GENDER: MALE<input type="radio" name="g" ></input> FEMALE<input type="radio" name="g" ></input>
		NATION: <select>
				<option>-----select-----</option>
				<option value="ind">India</option>
				<option value="eng">England</option>
				<option value="sou">SouthAfrica</option>
				</select>
				<input type="submit"></input>
	</pre>
	</form>
</body>
</html>