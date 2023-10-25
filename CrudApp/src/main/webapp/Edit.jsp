<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h3>Edit data</h3>
</head>
<body>
<form action="update">
<table border="1">
<input type="hidden" name="id" value="${data.id}">

<tr>
<td>Name:-</td>
<td><input type="text" name="name" value="${data.name}"></td>
</tr>

<tr>
<td>Address:-</td>
<td><input type="text" name="address" value="${data.address}"></td>
</tr>
<tr>

<tr>
<td>Username:-</td>
<td><input type="text" name="username" value="${data.username}"></td>
</tr>
<tr>

<tr>
<td>Password:-</td>
<td><input type="text" name="password" value="${data.password}"></td>
</tr>

<tr>
<td><input type="submit" value="UPDATE"></td>
</tr>

 </table>
 </form>
</body>
</html>