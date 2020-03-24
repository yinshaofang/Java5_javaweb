<%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/20
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function f() {
          img.src="${pageContext.request.contextPath}/day4/validcode/show?id="+new Date().getTime();
        }
    </script>
</head>
<body>
    显示验证码：
    <a href="javascript:;">
        <img src="${pageContext.request.contextPath}/day4/validcode/show" onclick="f();" id="img" alt="看不清换一张">
    </a>
</body>
</html>
