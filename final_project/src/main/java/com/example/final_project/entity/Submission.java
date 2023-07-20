package com.example.final_project.entity;

import com.example.final_project.statics.Score;
import com.example.final_project.statics.StatusSubmission;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "submissions")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Submission extends BaseEntity{
    String content;

    @ManyToOne()
    @JoinColumn(name = "student_id")
    User user;

    @ManyToOne()
    @JoinColumn(name = "assignment_id")
    Assignment assignment;


    Score score;

    String comment;

    StatusSubmission statusSubmission;


}
