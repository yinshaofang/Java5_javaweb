package ems.util;

import ems.entity.Emp;

import javax.servlet.http.HttpServletRequest;

public class Util {
    public static Emp getEmp(HttpServletRequest req){
      String sid=req.getParameter("id");
      Integer id=sid==null?null:Integer.valueOf(sid);
      String name=req.getParameter("name");
      String sal =req.getParameter("salary");
      double salary="".equals(sal)?0:Double.parseDouble(sal);
      String gender=req.getParameter("gender");
      String edu=req.getParameter("edu");
      String[] arr=req.getParameterValues("hobbies");
       //把一个数组转换为字符串
      StringBuilder sb =new StringBuilder();
       for(String t:arr){
           sb.append(t+",");
       }
       String hobbies=sb.deleteCharAt(sb.length()-1).toString();
        return new Emp(id,name,salary,gender,edu,hobbies);
    }
}
