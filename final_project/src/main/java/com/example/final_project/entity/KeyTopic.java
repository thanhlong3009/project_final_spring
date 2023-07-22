package com.example.final_project.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "key_topics")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class KeyTopic extends BaseEntity {


    String topic;
}
