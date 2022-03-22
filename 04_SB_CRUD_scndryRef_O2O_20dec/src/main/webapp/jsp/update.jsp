<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Page</title>
</head>
<body>
<form action="update">
<table border="1">
<tr>
<input type="hidden" name="sid" value="${stu.sid}"></td>
</tr>
<tr>
<td>Name : </td><td><input type="name" name="name" value="${stu.name}"></td>
</tr>
<tr>
<td>Areaname : </td><td><input type="name" name="address" value="${stu.addr.areaname}"></td>
</tr>
<tr>
<td>Cityname : </td><td><input type="name" name="address" value="${stu.addr.cityname}"></td>
</tr>
<tr>
<td>Username : </td><td><input type="name" name="uname" value="${stu.uname}"></td>
</tr>
<tr>
<td>Password : </td><td><input type="name" name="pword" value="${stu.pword}"></td>
</tr>
<tr>
<td><input type="submit" value="Save"></td>
</tr>
</table>
</form>
</body>
</html>