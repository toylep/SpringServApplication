package ru.toylep.MeetApp1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.toylep.MeetApp1.DAO.UserDAO;
import ru.toylep.MeetApp1.DAO.UserInfoDAO;
import ru.toylep.MeetApp1.models.UserInfoModel;

@RestController
@RequestMapping("/user_info")
public class UserInfoController {
    @Autowired
    private UserInfoDAO userInfoDAO;
    @PostMapping("/add")
    public void addInfo( @RequestParam String group, @RequestParam String name, @RequestParam String lastname) {
        userInfoDAO.addUserInfo( group, name, lastname);
        //Long id,String name, String lastname, Long descriptions, Long comments
    }
        @GetMapping("/find/{id}")
        public UserInfoModel findById(@PathVariable Long id){
        return userInfoDAO.findUserInfoById(id);
        }

}
