 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Addition Page</title>
</head>
<body>
    <div style="text-align:center;">
        <h2>Welcome to the Addition Page</h2><br>

        <form action="add-two" method="get">
        <form action="add-two" method="post">
            Number 1: <input type="text" name="n1"> <br><br>
            Number 2: <input type="text" name="n2"> <br><br>
            <button type="submit">Add</button>
        </form>

        <br>
        <h3>Result: ${d1}</h3>
    </div>
</body>
</html>
 