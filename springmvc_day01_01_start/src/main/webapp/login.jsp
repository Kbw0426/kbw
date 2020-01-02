<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/11/22
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script>
        function x() {
            var account = $.trim($("#account").val());
            var password = $.trim($("#password").val());
            if (account == '') {
                alert("请输入用户名");
                return false;
            } else if (password == "") {
                alert("请输入密码");
                return false;
            }
        }
            $.ajax({
                url:"${pageContext.request.contextPath}/ssm/ajax",
                contentType: "application/json",
                data:{"account":$("#account").val()},
                success: function (data) {
                    alert(data);
                }

            });

        <%--}--%>
    </script>


</head>
<body>



      <form action="${pageContext.request.contextPath}/ssm/login"  method="post">
          <p>用户登录</p>
          账号：<input name="account" id="account" type="text"/>
          <br/>
          密码：<input name="password" id="password" type="password"/><br/>
          <input type="submit"  value="提交" onclick="return x()">
      </form>
      <a href="register.jsp">注册</a>
      <button type="submit">注册</button>

 <%--   <%
          if (request.getAttribute("msg")!=null) {
              out.print(request.getAttribute("msg"));
          }
    %>--%>

</body>
</html>
