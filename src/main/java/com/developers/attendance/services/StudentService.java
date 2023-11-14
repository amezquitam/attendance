package com.developers.attendance.services;

import com.developers.attendance.entities.Student;

public interface StudentService {
    public Student saveStudent(Student student);

    public Student findStudent(String code);
}
