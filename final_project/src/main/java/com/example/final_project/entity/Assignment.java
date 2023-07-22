package com.example.final_project.entity;

import com.example.final_project.statics.Score;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "assignments")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Assignment extends  BaseEntity{

    String name;

    String content;

    @Temporal(TemporalType.TIMESTAMP)
    Date deadline;

    @ManyToOne
    @JoinColumn (name = "lesson_id")
    Lesson lesson;



}
