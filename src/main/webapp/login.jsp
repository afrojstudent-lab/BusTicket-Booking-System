<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>

<style>
body {
    font-family: Arial;
    background: #f5f6fa;
    text-align: center;
}

.box {
    margin-top: 80px;
}

input {
    padding: 8px;
    margin: 5px;
}
</style>
</head>

<body>

<!-- 🔷 NAVBAR -->
<div style="background:#2f3640;padding:15px;">
    <a href="index.jsp" style="color:white;margin-right:15px;">Home</a>
    <a href="register.jsp" style="color:white;">Register</a>
</div>

<div class="box">

<h2>Login</h2>

<form action="login" method="post">
    Username:<br>
    <input type="text" name="username"><br>

    Password:<br>
    <input type="password" name="password"><br><br>

    <input type="submit" value="Login">
</form>

<p>
Don't have account?
<a href="register.jsp">Register here</a>
</p>

</div>

</body>
</html>