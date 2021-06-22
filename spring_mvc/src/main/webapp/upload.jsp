<%--
  Created by IntelliJ IDEA.
  User: huyang
  Date: 2021/6/22
  Time: 上午11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="fileUpload" method="post" enctype="multipart/form-data">
    <input name="username" type="text"/><hr/>
    <input name="file" type="file"/><hr/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
