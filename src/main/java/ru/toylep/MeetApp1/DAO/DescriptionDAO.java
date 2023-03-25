package ru.toylep.MeetApp1.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class DescriptionDAO {
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public DescriptionDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
