package com.example.final_project.entity;

import com.example.final_project.statics.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "classes")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Class extends BaseEntity{


    String name;

    @ManyToOne
    @JoinColumn(name = "course_id")
    Course course;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "location_id")
    Location location;

    Status status;


    @ManyToMany
    @JoinTable(name = "students_classes",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    Set<User> users;
}
