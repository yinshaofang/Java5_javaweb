package dao.impl;

import com.hzn.jdbc.day02.temp.Temp;
import dao.RegistDao;
import entity.Regist;
import mapper.RegistMapper;

import java.sql.SQLException;
import java.util.List;

public class RegistDaoImpl implements RegistDao{
    @Override
    public int insertUser(Regist r) throws SQLException {
        String sql="insert into t_regist(username,password,email) value(?,?,?)";
        return Temp.update(sql,r.getUsername(),r.getPassword(),r.getEmail());
    }

    @Override
    public Regist selectByName(String username) throws SQLException {
        String sql ="select id, username,password,email from t_regist where username=?";
        List<Regist> list=Temp.query(sql,new RegistMapper(),username);
        return list.isEmpty()?null:list.get(0);
    }

    @Override
    public Regist selectByEmail(String email) throws SQLException {
        String sql="select id,username,password,email from t_regist where email=?";
        List<Regist> list=Temp.query(sql,new RegistMapper(),email);
        return list.isEmpty()?null:list.get(0);
    }
}
