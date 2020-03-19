<%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/17
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <%--jsp中的四大作用域：request<session<application--%>
   <%="新页面中的request对象中的值："+request.getAttribute("u")%>
   <%="新页面中的session对象中的值："+session.getAttribute("u")%>
    <%--jsp内置对象 application 作用域是全局 类型ServletContext--%>
   <%="新页面中的appliction对象中的值："+application.getAttribute("u")%>
</body>
</html>
