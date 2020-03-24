<%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/19
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/jquery.js"></script>
</head>
<body>
<form action="${pageContext.request.contextPath}/day4/upload/image" method="post" enctype="multipart/form-data">
    <input type="file" name="myfile"><br>
    <img src="${src}" style="height: 350px;width: 350px"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
