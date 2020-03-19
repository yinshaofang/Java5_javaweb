package day2.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Test extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String username=req.getParameter("username");
         String userpass=req.getParameter("userpass");
         //域对象：一次请求
         req.setAttribute("u",username);
         //获取session对象 默认参数是true 没有session对象，就创建session对象  如果有就获取对象
                          // 参数false 有就获取对象，没有返回null
        HttpSession session =req.getSession();
        //session作用域：一次会话
        session.setAttribute("u",username);
         //获取全局变量ServletContext
        this.getServletContext().setAttribute("u",username);

        //转发
        req.getRequestDispatcher("/day2/session/success.jsp").forward(req,resp);

    }
}
