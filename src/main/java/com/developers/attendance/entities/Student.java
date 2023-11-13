package com.developers.attendance.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Student {
    
    @Id
    @Column(name = "student_code")
    String code;

    @Column
    String firstName;

    @Column
    String lastName;

    @Column
    String email;

    @Column
    String phoneNumber;

}
