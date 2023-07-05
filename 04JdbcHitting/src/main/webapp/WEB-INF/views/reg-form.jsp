<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>registration form....!</h1>
<form action="./save" method="post">
<table align="center">
<tr>
<td>
Enter ID:
</td>
<td>
<input type="number" name="id" /><br><br>
</td>

</tr>

<tr>
<td>
Enter Name:
</td>
<td>
<input type="text" name="name" /><br><br>
</td>
</tr>

<tr>
<td>
Enter Salary:
</td>
<td>
<input type="number" name="salary" /><br><br>
</td>
</tr>

<tr>
<td>
<input type="submit" value="save">
</td>
</tr>

</table>
</form>
</body>
</html>