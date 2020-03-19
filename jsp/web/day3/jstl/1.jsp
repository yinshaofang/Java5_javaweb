<%@ page import="day3.bean.User" %><%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/18
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
 <%--
   jstl标签库是el表达式高级用法
   jstl加入两个jar包，jstl.jar  standard.jar
   步骤：1、WEB-INF下建一个lib文件夹并加入jar包
        2、导入jstl标签库 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" preﬁx="c"%>

 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        //模拟servlet后台存入数据，便于前台获取数据
     application.setAttribute("name","Jim");
     pageContext.setAttribute("age",20,PageContext.REQUEST_SCOPE);//指定存在el表达式隐形域request中
     User u=new User();
     u.setName("张三");
     u.setMoney(555.0);
     request.setAttribute("user",u);
     request.removeAttribute("money");//删除
    %>
     <%--jstl标签库中的赋值语句
      scope:标志在哪个作用域中取数据
      向4个域对象中存入值： var:类似key   value:类似value
     --%>
    <h1>jstl标签库中的赋值语句</h1>
    <c:set scope="request" var="i" value="hello"/>

     <h1>在el表达式中取值</h1>
        ${name}<br>
        ${age}<br>
        ${user}<br>
        ${user.name}<br>
        ${i}<br>

    <%--修改对象中的值--%>
    <c:set target="${user}" property="name" value="李四"/>
    ${user.name}<br>

    <hr>
    <%
    int a=20;
     if(a>0){
         out.print("a>=20");
     }else{
         out.print("a<20");
     }

    %>
    <%--设置年龄  大于great equal--%>
    <c:set var="age" value="10"></c:set>
     <%--条件判断 第一种写法：--%>
    <c:if test="${requestScope.age ge 18}" scope="application" var="x">

        上大学了。。<br>
    </c:if>

     <%--第二种写法：--%>
     <c:if test="${age>=18}">
       已经成年<br>
     </c:if>

    ${applicationScope.x} ----c:if的结果<br>

</body>
</html>
