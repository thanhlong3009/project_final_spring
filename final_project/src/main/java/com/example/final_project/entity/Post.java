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
@Table(name = "posts")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Post extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "author_id")
    User user;

    String title;

    String content;

    Status status;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "posts_key_topics",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "key_topic_id "))
    Set<KeyTopic> keyTopics;

}
