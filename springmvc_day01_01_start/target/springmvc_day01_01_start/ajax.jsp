<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/11/22
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script>
        function a() {
            var mob = $("#moblie").val();
            $.ajax({
                url:"${pageContext.request.contextPath}/ajax/a",
                data:{"moblie":mob},
                success:function (result,testStatus) {
                    if (result=="true"){
                        alert("已存在！注册失败！");
                    }else {
                        alert("注册成功！");
                    }
                }
            })

        }

    </script>
</head>
<body>
     手机号:<input id="moblie" name="moblie" type="text"><br/>
           <input type="submit" value="注册" onclick="a()">
</body>
</html>
