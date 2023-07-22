package com.example.final_project.entity;
import com.example.final_project.statics.StatusAttendance;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "attendances")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Attendance extends BaseEntity  {
    @ManyToOne
    @JoinColumn(name = "student_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    Lesson lesson;

    StatusAttendance statusAttendance;
}
