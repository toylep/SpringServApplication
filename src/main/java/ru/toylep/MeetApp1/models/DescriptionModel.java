package ru.toylep.MeetApp1.models;

import lombok.Data;

@Data
public class DescriptionModel {
    private Long id;
    private String subjectName;
    private String teacherFIO;
    private String descriptionText;
    private String specLinks;
    private String CommentID;
}
