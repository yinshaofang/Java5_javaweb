package dao;

import entity.Regist;

import java.sql.SQLException;

public interface RegistDao {
    //插入
    public int insertUser(Regist r) throws SQLException;

    //根据用户名查询
   public Regist selectByName(String username) throws SQLException;

   //根据邮箱名查询
   public Regist selectByEmail(String email) throws SQLException;

}
