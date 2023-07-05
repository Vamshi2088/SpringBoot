<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>jsp works!!!!</h1>

<%-- ${map} --%>
<table border="1" width="500" align="center">


  <tr bgcolor="">
            <th>person ID</th>
            <th>person NAME</th>
            <th>person salary</th>
            <th>Actions</th>
        </tr>
<c:forEach var="e" items="${map}">

<tr>
<td>${e.id}</td>
<td>${e.name}</td>
<td>${e.salary}</td>
<td><a href="delete?id=${e.id}">delete</a>
    <a href="getbyid?id=${e.id}">update</a></td>
</tr>


</c:forEach>
</table>
<h3 align="center">
<a  href="./form">New Student</a>
</h3>
</body>
</html>