package com.example.final_project.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "subjects")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subject extends BaseEntity{

    String name;

    String description;

    @ManyToOne(targetEntity = Course.class)
    @JoinColumn(name = "course_id")
    Course course;


}
