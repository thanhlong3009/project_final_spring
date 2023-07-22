package com.example.final_project.entity;

import com.example.final_project.statics.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "course")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Course extends  BaseEntity{

    String name;

    String introduce;

    String duration;

    String schedule;

    Double price;

    Status status;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "courses_key_topics",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "key_topic_id "))
    private Set<KeyTopic> keyTopics = new HashSet<>();


}
