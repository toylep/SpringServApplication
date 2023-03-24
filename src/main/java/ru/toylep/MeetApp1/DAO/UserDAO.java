package ru.toylep.MeetApp1.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.toylep.MeetApp1.DAO.mappers.UserMapper;
import ru.toylep.MeetApp1.models.UserModel;

import java.util.List;

public class UserDAO {

    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public UserDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public List<UserModel> findAll(){
        return jdbcTemplate.query("SELECT * FROM public.\"Users\"",new UserMapper());
    }
    public UserModel findUserById(Long id){
        return jdbcTemplate.query("SELECT * FROM public.\"Users\" where id=?",new Object[]{id}, new UserMapper()).stream().findAny().orElse(null);
    }
    public void addUser(String login,String password){
         jdbcTemplate.update("INSERT INTO public.\"Users\"(login, password) VALUES (?,?)",login,password);
    }
}
