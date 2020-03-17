<%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/16
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%--isErrorPage="true" 处理异常的跳转到此页面--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <%--九大内置对象之一exception--%>
   <%=exception.getMessage()%>
   <h1>服务器内部崩溃了。。</h1>
</body>
</html>
