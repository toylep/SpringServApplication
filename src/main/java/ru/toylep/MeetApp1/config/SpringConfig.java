package ru.toylep.MeetApp1.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import ru.toylep.MeetApp1.DAO.CommentDAO;
import ru.toylep.MeetApp1.DAO.DescriptionDAO;
import ru.toylep.MeetApp1.DAO.UserDAO;
import ru.toylep.MeetApp1.DAO.UserInfoDAO;

import javax.sql.DataSource;

@Configuration
@ComponentScan("ru.toylep.MeetApp1")
@EnableWebMvc
public class SpringConfig {
    @Autowired
    private final ApplicationContext context;

    public SpringConfig(ApplicationContext context) {
        this.context = context;
    }
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/KursachDB2");
        dataSource.setUsername("postgres");
        dataSource.setPassword("228322");
        return dataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }
    @Bean
    public UserDAO userDAO(){
        return new UserDAO(jdbcTemplate());
    }
    @Bean
    public UserInfoDAO userInfoDAO(){return new UserInfoDAO(jdbcTemplate());}
    @Bean
    public CommentDAO commentDAO(){return new CommentDAO(jdbcTemplate());}
    @Bean
    public DescriptionDAO descriptionDAO(){return new DescriptionDAO(jdbcTemplate());}


}
