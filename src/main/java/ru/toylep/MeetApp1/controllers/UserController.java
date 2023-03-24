package ru.toylep.MeetApp1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.toylep.MeetApp1.DAO.UserDAO;
import ru.toylep.MeetApp1.DAO.UserInfoDAO;
import ru.toylep.MeetApp1.DAO.mappers.UserMapper;
import ru.toylep.MeetApp1.models.UserModel;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserDAO userDAO;
    @Autowired
    UserInfoDAO userInfoDAO;
    @GetMapping("/all")
    public List<UserModel> findAll(){
        return userDAO.findAll();
    }
    @GetMapping("/find/{id}")
    public UserModel findUserByLogin(@PathVariable Long id){
        return userDAO.findUserById(id);
    }
    @PostMapping("/add")
    public void addUser(@RequestParam String login,@RequestParam String password ){

        userDAO.addUser(login,password);
        userInfoDAO.addUserInfo();
    }
}
