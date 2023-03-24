package ru.toylep.MeetApp1.models;

import lombok.Data;

@Data
public class UserInfoModel {
    private Long id;
    private String groups;
    private String name;
    private String lastname;
    private Long descriptions;
    private Long comment;
}
