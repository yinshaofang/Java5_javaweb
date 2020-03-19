<%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/17
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <form action="<%=request.getContextPath()%>/day2/filter/login.do">
     <input type="text" name="username"><br>
       <input type="submit">
   </form>
</body>
</html>
