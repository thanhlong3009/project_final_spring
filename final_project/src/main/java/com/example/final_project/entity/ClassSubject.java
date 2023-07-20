package com.example.final_project.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "classes_subjects")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClassSubject extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "class_id")
    Class aClass;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    Subject subject;
}
