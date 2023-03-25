package ru.toylep.MeetApp1.DAO.mappers;

import org.springframework.jdbc.core.RowMapper;
import ru.toylep.MeetApp1.models.DescriptionModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DescriptionMapper implements RowMapper<DescriptionModel> {
    @Override
    public DescriptionModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        DescriptionModel dm = new DescriptionModel();
        dm.setId(rs.getLong("id"));
        dm.setDescriptionText(rs.getString("Description_text"));
        dm.setTeacherFIO(rs.getString("teacher_fio"));
        dm.setSubjectName(rs.getString("subject_name"));
        dm.setSpecLinks(rs.getString("spec_links"));
        dm.setCommentID(rs.getLong("Comment_id"));
return dm;
    }
}
