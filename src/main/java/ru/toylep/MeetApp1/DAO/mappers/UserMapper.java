package ru.toylep.MeetApp1.DAO.mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.toylep.MeetApp1.models.UserModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<UserModel> {
    @Override
    public UserModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserModel userModel = new UserModel ();
        userModel.setId(rs.getLong("id"));
        userModel.setLogin(rs.getString("login"));
        userModel.setPassword(rs.getString("password"));
        return userModel;
    }
}
