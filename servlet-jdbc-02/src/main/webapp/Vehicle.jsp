<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="veh" method="post">
	<pre>
		REGNO: <input type="text" name="r" >
		BRAND: <input type="text" name="b">
		PRICE: <input type="text" name="p">
		COLOR: <select name="c"> 
			   <option>--select--</option>
			   <option value="red">red</option>
			   <option value="blue">blue</option>
			   <option value="white">white</option>
			   </select>
			   <input type="submit">
	</pre>
	</form>
</body>
</html>