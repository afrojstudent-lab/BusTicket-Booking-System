<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>

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
    <a href="login.jsp" style="color:white;">Login</a>
</div>

<div class="box">

<h2>Register</h2>

<form action="register" method="post">
    Username:<br>
    <input type="text" name="username"><br>

    Password:<br>
    <input type="password" name="password"><br><br>

    <input type="submit" value="Register">
</form>

<p>
Already have account?
<a href="login.jsp">Login here</a>
</p>

</div>

</body>
</html>