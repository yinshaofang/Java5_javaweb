package day2.url重写;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Test extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String name=req.getParameter("username");
        System.out.println("name的值：" + name);
        // 当客户端禁用Cookie 服务器端就获取不到客户端sessionid，在服务器（map集合）端找不到对应的session对象
        // 参数默认true:获取不了就创建session对象
      req.getSession().setAttribute("sname",name);
      //获取sessionid
      String id=req.getSession().getId();
      System.out.println("sessionid=" + id);

      //禁用cookie以后，重定向没作用
      //resp.sendRedirect(req.getContextPath()+"/day2/url/2.jsp");

       //方法一：把sessionid追加到重定向（字符串拼接出问题）
       // resp.sendRedirect(req.getContextPath()+"/day2/url/2.jsp"+";jsessionid="+id);

        //方法二：encodeURL():返回一个新的字符串
        resp.sendRedirect(resp.encodeURL(req.getContextPath()+"/day2/url/2.jsp"));
    }
}
