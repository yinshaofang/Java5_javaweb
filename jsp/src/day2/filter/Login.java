package day2.filter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Login extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String name=req.getParameter("username");
         //放到session对象中
         req.getSession().setAttribute("username",name);
         //登录成功，重定向到ProductList的Servlet,在web.xml需要配置路径
        resp.sendRedirect(req.getContextPath()+"/day2/filter/product.do");
    }
}
