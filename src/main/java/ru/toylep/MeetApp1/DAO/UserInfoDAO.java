package ru.toylep.MeetApp1.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.toylep.MeetApp1.DAO.mappers.UserInfoMapper;
import ru.toylep.MeetApp1.models.UserInfoModel;

public class UserInfoDAO {
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public UserInfoDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public void addUserInfo(){
           // Long id = jdbcTemplate.queryForObject("Select max(id) from \"UsersInfo\"");
            jdbcTemplate.update("Insert into public.\"UsersInfo\"  () VALUES ( )");
        }
    public UserInfoModel findUserInfoById (Long id){
    return jdbcTemplate.query("SELECT * FROM public.\"UsersInfo\" where id=?",new Object[]{id},new UserInfoMapper()).stream().findAny().orElse(null);

    }
}
