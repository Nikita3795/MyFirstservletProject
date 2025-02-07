<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Multiplication Page</title>
</head>
<body>
<div style="text-align:center;">
    <h2>Welcome to the Multiplication Page</h2><br>

    <form action="multwo" method="get">
        Number 1: <input type="text" name="n1"> <br><br>
        Number 2: <input type="text" name="n2"> <br><br>
        <button type="submit">Multiply</button>
    </form>

    <br>
    <h3>Result: ${d3}</h3>
</div>
</body>
</html>
