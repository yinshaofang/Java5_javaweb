package controller;

import mvc.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//key:路径
//value:方法本身
@RequestMapping("")
public class ServletDemo1 {
    @RequestMapping("/h")
    public String h(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("访问了h方法...");
        //直接转发到WEB-INF/pages/h.jsp
        return "h";
  }
    @RequestMapping("/d") //如果返回值是void 在框架SpringMVC中，设置默认返回页面 hello.jsp
    public void dd(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("访问了h方法...");
        //直接转发到WEB-INF/pages/h.jsp
    }
}
