<%@ page import="day3.bean.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/19
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <h1>分支</h1>
     <c:set var="age" value="20"></c:set>
     <c:choose>
         <%--if--%>
         <c:when test="${age<14}">上小学</c:when>
         <%--else if--%>
         <c:when test="${age<18}">上初高中</c:when>
         <%--else if--%>
         <c:when test="${age<22}">上大学</c:when>
         <%--else--%>
         <c:otherwise>工作</c:otherwise>
     </c:choose>
     <hr>

     <h1>循环</h1>
     <%--int sum=0--%>
     <c:set var="sum" value="0"></c:set>
     <%--for(int i=0;i<20;i++)--%>
     <c:forEach var="i" begin="0" end="20" step="1">
         ${i}<br>
         <%--sum=sum+i--%>
         <c:set var="sum" value="${sum+i}"></c:set>
     </c:forEach>
     sum总和为：${sum}
     <hr>

     <h1>遍历数组</h1>
     <%
     String[] arrays={"apple","orange","lemon","pear"};
      request.setAttribute("arrs",arrays);
     %>
     <%--foreach{String str:arrs}--%>
     <c:forEach var="str" items="${arrs}">
        ${str}<br>
     </c:forEach>
     <hr>

     <h1>遍历集合</h1>
     <%
         ArrayList<User> list =new ArrayList<User>();
         User u1=new User(1,"Tom",5000.0);
         User u2=new User(2,"Marry",4000.0);
         list.add(u1);
         list.add(u2);
         pageContext.setAttribute("list",list);
     %>
     <%--foreach{User u:list}--%>
      <c:forEach items="${list}" var="u">
          员工编号:${u.id}<br>
          员工姓名:${u.name}<br>
          员工工资:${u.money}<br>
      </c:forEach>
      <hr>
      <h1>Map集合遍历</h1>
      <%
      Map<Integer,User> map =new HashMap<>();
        map.put(u1.getId(),u1);
        map.put(u2.getId(),u2);
        pageContext.setAttribute("m",map);
      %>
      <%--varStatus:记录迭代相关的信息--%>
      <c:forEach items="${m}" var="e" varStatus="o">
        ${e.key}---${e.value.name}<br>
        ${e.key}---${e.value.money}<br>
        <span style="color: red">索引：${o.index},当前获取到的成员数：${o.count}<br></span>
      </c:forEach>

</body>
</html>
