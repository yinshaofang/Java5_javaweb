<%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/16
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%--jsp指令  page指令
  buffer:jsp把一些标签写到缓冲区，写到页面的，默认8k
  isErrorPage='true':表示服务器出现5XX异常问题，指定跳到此标志的页面上
 --%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  import="java.util.*,java.lang.*"
  pageEncoding="utf-8" buffer="8kb" autoFlush="true" isErrorPage="true"
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <%--静态的HTML--%>
   <h1>jsp页面元素</h1>

   <%--客户端看不到jsp注释--%>
   <%--jsp脚本--%>
   <%
       int num=10;
       //打印
       System.out.println("this is myPage!");
   %>

   <%--表达式--%>
   <%= "hello world!"%>
   <%=num%>
   <%--表达式等价于--%>
   <%out.print(num);%>

   <%--jsp声明 --%>
   <%!
    int a=30;
    public static void myMethods(){
        System.out.println("who are you?");
    }
   %>
    <hr>
   <%--举例--%>
   <%
    for(int i=0;i<4;i++){
   %>
     <h1>hello<%=i%></h1>
   <%}%>



</body>
</html>
