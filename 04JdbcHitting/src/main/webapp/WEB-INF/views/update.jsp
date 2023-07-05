<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./update" method="post">

<label for="id">Id:</label>
<input type="text" name="id" value="${u.id}" readonly="readonly"><br><br>

<label for="name">name:</label>
<input type="text" name="name" value="${u.name}"><br><br>

<label for="salary">salary:</label>
<input type="text" name="salary" value="${u.salary}"><br><br>


<input type="submit" value="update">

</form>

</body>
</html>