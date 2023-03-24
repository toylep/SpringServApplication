package ru.toylep.MeetApp1.DAO.mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.toylep.MeetApp1.models.UserInfoModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInfoMapper implements RowMapper<UserInfoModel> {
    @Override
    public UserInfoModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserInfoModel us = new UserInfoModel();
        us.setId(rs.getLong("id"));
        us.setName(rs.getString("name"));
        us.setName(rs.getString("lastName"));
        us.setDescriptions(rs.getLong("descriptions"));
        us.setComment(rs.getLong("comments"));
        return us;
    }
}
