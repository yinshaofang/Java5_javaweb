package controller;

import com.alibaba.fastjson.JSON;
import com.hzn.jdbc.day02.temp.Temp;
import entity.Data;
import entity.Result;
import mapper.DataMapper;
import mvc.annotation.RequestMapping;
import mvc.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

@RequestMapping("")
public class DataHandle {
  @RequestMapping("/checkKey")
  public void checkKey(HttpServletRequest req, HttpServletResponse  resp) throws Exception {
      String sql="select msg,keyword from t_data where keyword=?";
      String key =req.getParameter("key");
      List<Data> list= Temp.query(sql,new DataMapper(),key);
      //判断
      String msg="";
      if(list.isEmpty()){
          msg="<font color='green'>可正常添加</font>";
      }else{
          msg="<font color='red'>此关键字已存在</font>";
      }
      PrintWriter out =resp.getWriter();
      out.print(msg);//传给前端
  }

    @RequestMapping("/checkKey1")
    public void checkKey2(HttpServletRequest req, HttpServletResponse  resp) throws Exception {
        String sql="select msg,keyword from t_data where keyword=?";
        String key =req.getParameter("key");
        List<Data> list= Temp.query(sql,new DataMapper(),key);
        //判断
        String msg="";
        if(list.isEmpty()){
            msg="<font color='green'>可正常添加</font>";
        }else{
            msg="<font color='red'>此关键字已存在</font>";
        }
        PrintWriter out =resp.getWriter();
        //****用json格式把对象转换为json格式字符串（可以放更多属性）****
        msg= JSON.toJSONString(new Result(msg));
        System.out.println(msg);
        out.print(msg);
    }

    //
    @RequestMapping("/checkKeyJson")
    @ResponseBody //返回json格式 替换三行代码
    public Result checkKey3(HttpServletRequest req, HttpServletResponse  resp) throws Exception {
        String sql="select msg,keyword from t_data where keyword=?";
        String key =req.getParameter("key");
        List<Data> list= Temp.query(sql,new DataMapper(),key);
        //判断
        String msg="";
        if(list.isEmpty()){
            msg="<font color='green'>可正常添加</font>";
        }else{
            msg="<font color='red'>此关键字已存在</font>";
        }
        return new Result(msg);//返回值不是响应对象，通过注解ResponseBody 转换了上面的三行代码的作用，返回值还是json字符串格式
    }
}
