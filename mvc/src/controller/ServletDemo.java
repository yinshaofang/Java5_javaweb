package controller;

import mvc.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//如果请求，没有优先被MyConfig类处理，如果没有匹配的路径，tomcat会扫描其他类，进行处理
//map集合
// key:/c/regHandle路径   value：处理请求方法本身

@RequestMapping("/c")
public class ServletDemo {

    @RequestMapping("/regHandle")
    public String m(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("访问了m方法...");
        //直接转发到WEB-INF/pages/c.jsp
       return "c";
    }
    @RequestMapping("/loginHandle")
    public String login(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("访问了登录方法...");
        /**
         * 情况一:内部转发
         * return "/h.do";
         *1、被dispatchServlet进行拦截，让MyConfig优先进行转发到h.jsp
         *2、如果MyConfig没有路径/h,则重新找其他的类下的路径/h,再次进行处理
         *
         * 情况二:重定向：
         *  return "redirect:/h.do";
         *1、客户端进行二次请求:(被dispatchServlet进行拦截)让MyConfig优先进行转发到h.jsp
         *2、如果MyConfig没有路径/h,则重新找其他的类下的路径/h,再次进行处理
         */
        return "redirect:/h.do";
    }

}
