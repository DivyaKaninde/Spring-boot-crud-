<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">

function edit()
{
 document.fn.action="edit";
 document.fn.submit();
}
function add()
{
 document.fn.action="register";
 document.fn.submit();
}
function deleteData()
{
 document.fn.action="delete";
 document.fn.submit();
}


</script>
</head>
<body>
<h3 align ="center">All Students Data</h3>
<center>
<form name="fn">
<table border="1">
<tr>
<td>Select</td>
<td>Sid</td>
<td>Name</td>
<td>Areaname</td>
<td>Cityname</td>
<td>Username</td>
<td>Password</td>
</tr>
<d:forEach items="${stu}" var="ss"><br>
 <tr>
         <td><input type="radio" name="sid" value="${ss.sid}"></td>
         <td>${ss.sid}</td>
         <td>${ss.name}</td>
         <td>${ss.addr.areaname}</td>
         <td>${ss.addr.cityname}</td>
         <td>${ss.uname}</td>
         <td>${ss.pword}</td>   
</tr>   
     </d:forEach>
</table>
 <%-- ${u}
 ${s} --%>
 
 <%-- ${stu.sid}
 ${stu.name}
 ${stu.address}
 ${stu.uname}
 ${stu.pword} --%>
 <table>
 <tr>
 <td><input type="submit" value="Edit" onclick="edit()"></td>
 <td><input type="submit" value="Add" onclick="add()"></td>
 <td><input type="submit" value="Delete" onclick="deleteData()"></td>
 </tr>
 </table>
 

 
 
</form>

</center>
</body>
</html>