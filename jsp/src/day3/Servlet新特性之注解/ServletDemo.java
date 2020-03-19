package day3.Servlet新特性之注解;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(value = "/day3/ann/servletdemo",initParams = {@WebInitParam(name = "IP",value = "192.168.0.1"),@WebInitParam(name = "IP",value = "192.168.0.1")})
@WebServlet("/day3/ann/servletdemo")
public class ServletDemo extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("这是我的servlet注解...");
        ServletConfig cfg=this.getServletConfig();
        System.out.println("IP=" + cfg.getInitParameter("IP"));
    }
}
