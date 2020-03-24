package service.impl;

import constant.Constant;
import dao.RegistDao;
import entity.Regist;
import service.RegistService;
import util.ObjectFactory;

import java.sql.SQLException;
//具体实现类是真正处理业务
public class RegistServiceImpl implements RegistService{

    @Override
    public int registUser(Regist r) {
        RegistDao dao = (RegistDao) ObjectFactory.getObject("registDao");
        try {
            //判断用户名是否存在
            Regist uname=dao.selectByName(r.getUsername());
            if (uname!=null){
                return Constant.USER_EXISTS;
            }
            //判断用户邮箱是否存在
            Regist uemail=dao.selectByEmail(r.getEmail());
            if(uemail !=null){
                return Constant.EMAIL_EXISTS;
            }
            //注册
            return dao.insertUser(r)>0?Constant.SUCCESS:Constant.ERROR;
        } catch (SQLException e) {
            e.printStackTrace();
            return Constant.ERROR;
        }
    }
}
