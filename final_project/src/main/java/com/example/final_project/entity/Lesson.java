package com.example.final_project.entity;

import com.example.final_project.statics.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "lessons")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Lesson extends BaseEntity{
    String content;
    Timestamp date;

    @ManyToOne
    @JoinColumn(name = "class_subject_id")
    ClassSubject classSubject;

    Status status;
}
