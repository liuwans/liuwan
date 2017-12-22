<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
<!-- CSS -->
<link rel="stylesheet" href="css/reset.css">
<link rel="stylesheet" href="css/supersized.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="page-container">
            <h1><img src="img/pageimg/liu.png"></h1>
            <form action="getCountry" method="post">
                <input type="text" name="uname" value="" class="username" placeholder="用户名">
                <input type="password" name="password" value="" class="password" placeholder="密码">
                <button type="submit">登录</button>
            </form>
        </div>

        <!-- Javascript -->
        <script src="js/jquery-1.8.2.min.js"></script>
        <script src="js/supersized.3.2.7.min.js"></script>
        <script src="js/supersized-init.js"></script>
        <script src="js/scripts.js"></script>
</body>
</html>