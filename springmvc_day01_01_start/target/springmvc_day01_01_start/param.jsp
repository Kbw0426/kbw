<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/10/25
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--请求参数的绑定
<a href="param/testParam?username=hehe">请求参数绑定</a>
--%>
<form action="param/saveAccount" method="post">
    姓名：<input type="text" name="username"/><br/>
    密码：<input type="text" name="password"/><br/>
    金额：<input type="text" name="money"/><br/>
    用户的姓名：<input type="text" name="user.uname"/><br/>
    用户的年龄：<input type="text" name="user.age"/><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
