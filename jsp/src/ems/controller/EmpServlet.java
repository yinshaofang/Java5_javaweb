package ems.controller;

import ems.dao.EmpDao;
import ems.entity.Emp;
import ems.util.Util;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("*.emp")
public class EmpServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         //处理响应乱码
        resp.setContentType("text/html;charset=utf8");
        //处理请求
        req.setCharacterEncoding("utf8");
        String path=req.getRequestURI();
        //判断
        if(path.contains("add")){//增加
            Emp e = Util.getEmp(req);
            //调用dao方法
            EmpDao.insert(e);
        }else if(path.contains("delete")){//删除
            String sid =req.getParameter("id");
            EmpDao.deleteById(Integer.valueOf(sid));
        }else if(path.contains("showModify")){//查询
            String sid =req.getParameter("id");
            Emp e =EmpDao.selectById(Integer.valueOf(sid));
            req.setAttribute("emp",e);
            //转发
            req.getRequestDispatcher("/ems/showModifyEmp.jsp").forward(req,resp);
            return;//一个servlet中不允许同时二次转发
        }else if(path.contains("modify")){//查询
           Emp e =Util.getEmp(req);
           EmpDao.update(e);
        }

        //查询所有员工
        List<Emp> list =EmpDao.selectAll();
        req.setAttribute("list",list);
        System.out.println("servlet中所有的员工：" + list);
        //转发
        req.getRequestDispatcher("/ems/empList.jsp").forward(req,resp);

    }
}
