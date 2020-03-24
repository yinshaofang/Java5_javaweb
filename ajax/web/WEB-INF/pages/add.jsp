<%--
  Created by IntelliJ IDEA.
  User: ysf
  Date: 2020/3/24
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script>
        $(function () {
            //失去焦点
            $("#key").blur(function () {

                //方法一
                $.get(
                    //1、url地址
                    "${pageContext.request.contextPath}/checkKey_方法.do",
                    //2、参数
                    {
                        "key":$("#key").val()
                    },
                    //3、回调函数
                    function (data) {  //4且200 收到服务器传来的信息
                        $("#err").html(data);
                        //判断
                        if(data.indexOf("此关键字已存在")==-1){
                           $("#sb").attr("disabled",false);
                        }else{
                           $("#sb").attr("disabled",true);
                        }
                    }
                );
                //获取json格式字符串
                $.get(
                    //1、url地址
                    "${pageContext.request.contextPath}/checkKey1_方法.do",
                    //2、参数
                    {
                        "key":$("#key").val()
                    },
                    //3、回调函数
                    function (data) {  //4且200 收到服务器传来的信息

                        //****把json字符串转化为json对象*****
                        data=JSON.parse(data).info;

                        $("#err").html(data);
                        //判断
                        if(data.indexOf("此关键字已存在")==-1){
                            $("#sb").attr("disabled",false);
                        }else{
                            $("#sb").attr("disabled",true);
                        }
                    }
                );

                //方法二：$.post()方法
                $.post(
                    //1、url地址
                    "${pageContext.request.contextPath}/checkKeyJson.do",
                    //2、参数
                    {
                        "key":$("#key").val()
                    },
                    //3、回调函数
                    function (data) {  //4且200 收到服务器传来的信息

                         //****服务器响应默认是text格式，如果指定json格式，data是object类型对象，则不用写JSON.parse(data)***
                        data= data.info;

                        $("#err").html(data);
                        //判断
                        if(data.indexOf("此关键字已存在")==-1){
                            $("#sb").attr("disabled",false);
                        }else{
                            $("#sb").attr("disabled",true);
                        }
                    },
                    //****4.指定是json格式****
                    "json"
                );


            });

        })


    </script>


</head>
<body>
   <form action="${pageContext.request.contextPath}/addInfo.do">
       <fieldset>
           <legend>查询关键字</legend>
           <input type="text" name="key" id="key" placeholder="输入关键字">
           <span id="err"></span><br>
           <input type="text" name="msg" id="msg" placeholder="详细信息">
           <input type="submit" id="sb" value="添加" disabled="disabled">
       </fieldset>
       <span></span>

   </form>
</body>
</html>
