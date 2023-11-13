package com.developers.attendance.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Teacher {
    
    @Id
    @Column(name = "teacher_code")
    String code;

    @Column
    String firstName;

    @Column
    String lastName;
    
    @Column
    String password;

}
