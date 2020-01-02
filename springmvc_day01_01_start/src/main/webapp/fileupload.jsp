<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2019/10/29
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>传统上传文件</h3>
<form action="upload/fileUpload" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"/><br/>
    <input type="submit" value="上传">
</form>

<h3>SpringMvc文件上传</h3>
<form action="upload/fileUpload1" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="upload"/><br/>
    <input type="submit" value="上传">
</form>

</body>
</html>
