package day1.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Test extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     String contextPath=req.getContextPath();
     String servletPath=req.getServletPath();
     String urlPath=req.getRequestURI();
     System.out.println("应用名路径:" + contextPath + "servlet对象路径：" + servletPath + ",url:" + urlPath);

     //对cookie进行增删改查
      if(urlPath.contains("add")){
          add(req,resp);
      }else if (urlPath.contains("select")){
          select(req,resp);
      }else if (urlPath.contains("delete")){
          delete(req,resp);
      }else if (urlPath.contains("modify")){
           modify(req,resp);
      }

    }
    private void modify(HttpServletRequest req,HttpServletResponse resp){
        Cookie c=new Cookie("name","zhangsan");
        resp.addCookie(c);
    }

    private void delete(HttpServletRequest req,HttpServletResponse resp){
        Cookie c =new Cookie("pass","qqqqq");
        c.setPath("/jsp/day1");//路径相同，否则改不了
        c.setMaxAge(0);//不能存活  等同删除
        resp.addCookie(c);
    }

    private void select(HttpServletRequest req,HttpServletResponse resp){
        //客户端只能接受到服务器端的路径及其直系父类的路径的cookie，其他路径不行
        Cookie[] arr =req.getCookies();
        for (Cookie c:arr){
            System.out.println(c.getName() + "：" + c.getValue());
        }
    }
    //增加
    private void add(HttpServletRequest req,HttpServletResponse resp){
        //创建对象
        Cookie c =new Cookie("name","Tom");
        resp.addCookie(c);//发送给客户端

        c=new Cookie("age","30");
        //设置路径
        c.setPath("/jsp/day1/exception");
        resp.addCookie(c);//其他路径下的cookie 客户端收不到age，请求不了

        c=new Cookie("pass","123456");
        c.setPath("/jsp/day1");//设置父路径下
        resp.addCookie(c);
    }
}
