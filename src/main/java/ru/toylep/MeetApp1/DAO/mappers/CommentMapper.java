package ru.toylep.MeetApp1.DAO.mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.toylep.MeetApp1.models.CommentModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CommentMapper implements RowMapper<CommentModel> {
    @Override
    public CommentModel mapRow(ResultSet rs, int rowNum) throws SQLException {
       CommentModel cm = new CommentModel();
       cm.setId(rs.getLong("id"));
       cm.setCommentText(rs.getString("text"));
        return cm;
    }
}
