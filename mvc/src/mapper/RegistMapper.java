package mapper;

import com.hzn.jdbc.day02.temp.RowMapper;
import entity.Regist;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegistMapper implements RowMapper<Regist>{
    @Override
    public Regist mapRow(ResultSet rs) throws SQLException {
        Regist r=new Regist();
        r.setId(rs.getInt("id"));
        r.setUsername(rs.getString("username"));
        r.setPassword(rs.getString("password"));
        r.setEmail(rs.getString("email"));
        return r;
    }
}
