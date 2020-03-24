<%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/19
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/day4/upload/file" method="post" enctype="multipart/form-data">
        <input type="file" name="myfile"><br>
        <input type="submit" value="上传">
    </form>
</body>
</html>
