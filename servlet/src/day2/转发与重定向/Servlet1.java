package day2.转发与重定向;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("我是Servlet1..");
        //HttpRequest对象 中setAttribute() getAttribute() 用于服务器端之间来传递数据的
        // HttpRequest对象 是Tomcat服务器创建     作用范围：一次会话  不能共享数据
        req.setAttribute("hello","你好！Servlet2");
       // System.out.println(req.getAttribute("hello"));
        //客户端与服务器端的一次会话指的是：一次请求和响应
        //1、重定向   服务器Servlet1响应给客户端，并且让客户端自动的提交
        resp.sendRedirect("/servlet/day2/s2");

        //2、转发  服务器Servlet1自己转发   /servlet服务器内部知道的应用名
        //req.getRequestDispatcher("/day2/s2").forward(req,resp);


    }
}
