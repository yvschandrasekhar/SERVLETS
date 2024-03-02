<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="mov" method="get">
	<pre> 
		NAME       :  <input type="text" name="n">
		LANGUAGE   :  <select name="l">
						<option>----select----</option>
						<option value="tel">Telugu</option>
						<option value="eng">English</option>
						<option value="hin">Hindi</option>
					  </select>
		HERO	   :  <input type="text" name="h">
		TYPE       :  A<input type="radio" name="t" value="a"> B<input type="radio" name="t" value="b"> C<input type="radio" name="c" value="t">
				<input type="submit">
	</pre>
	</form>
</body>
</html>