<%@ page import="day3.bean.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/18
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
     //jsp四大域对象
     // pageContext.setAttribute("name","admin");
      request.setAttribute("name","zhangs");
      session.setAttribute("name","lisi");
      application.setAttribute("name","wangw");

    %>
    <hr>
    <h1>访问作用域</h1>
    <%--el中11个隐式对象，作用域最小，优先级最高  -->如果pageContext没有设置值，则el表达式直接获取request作用域中的值--%>
     ${name}---pageContext<br>
     ${requestScope.name}---request<br>
     ${sessionScope.name}---session<br>
     ${applicationScope.name}---application<br>

     <h1>访问java对象中的数据</h1>
    <%
     //对象
     User u=new User();
     u.setName("Tom");
     request.setAttribute("user",u);

     //数组
     String[] arr ={"apple","orange","banana"};
     request.setAttribute("arr",arr);

     //集合
    List<String> list=new ArrayList<>();
    list.add("one");
    list.add("two");
    list.add("three");
    request.setAttribute("list",list);

    //Map
     Map<String,String> m =new HashMap<>();
     m.put("one","中国");
     m.put("two","美国");
     request.setAttribute("map",m);
    %>
    ${user}----获取对象本身<br>
    ${user.name}----获取对象属性，很重要<br>
    ${arr[1]}----获取数组元素<br>
    ${list[1]}----获取集合中元素，重要<br>
    ${map.one}或${map["one"]}----获取map集合中元素




</body>
</html>
