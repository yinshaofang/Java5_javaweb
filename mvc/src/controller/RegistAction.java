package controller;

import constant.Constant;
import entity.Regist;
import mvc.annotation.RequestMapping;
import org.apache.commons.beanutils.BeanUtils;
import service.RegistService;
import util.ObjectFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
//转发器作用：只是进行转发，不做任何的业务处理
@RequestMapping("")
public class RegistAction {
     @RequestMapping("/regist")
    public String register(HttpServletRequest req, HttpServletResponse resp) throws InvocationTargetException, IllegalAccessException {
         System.out.println("register注册方法处理请求");
         Regist r =new Regist();
         //获取请求中的参数
         Map<String,String[]> m= req.getParameterMap();
         //commons-beanutils-1.8.3.jar
         BeanUtils.populate(r,m);//把请求中的参数集合封装为一个对象r
         //调用service层注册方法
         RegistService service = (RegistService) ObjectFactory.getObject("registService");
         int flag=service.registUser(r);
         //判断
         String msg="";
         if(flag== Constant.USER_EXISTS){
             msg="用户名已经存在";
         }else if(flag==Constant.EMAIL_EXISTS){
             msg="邮箱已经存在";
         }else if(flag==Constant.SUCCESS){
             msg="注册成功..";
             //return "redirect:/login.do";//如果注册成功，重定向到登录页面 login.jsp
         }else{
             msg="服务器忙，请稍后再试..";
         }

         //放到请求对象中
         req.setAttribute("msg",msg);
         //转发
       return "regist";
     }
}
