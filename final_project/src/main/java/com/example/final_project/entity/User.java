package com.example.final_project.entity;

import com.example.final_project.statics.StatusUser;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends BaseEntity {

    String email;



    String password;

    String dob;

    String phone;

    String avartar;

    boolean activated;

    @Enumerated(EnumType.STRING)
    StatusUser statusl;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    String avatar;

    LocalDateTime deletedDateTime;

    @OneToOne(mappedBy = "user")
    Teacher teacher;

    @ManyToMany
    @JoinTable(name = "students_classes",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "class_id")
    )
    Set<Class> classes;






}
