package com.example.final_project.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "course_ratings")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CourseRating  extends  BaseEntity{


    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "course_id")
    Course course;

    Integer rating;

    String review;
}
