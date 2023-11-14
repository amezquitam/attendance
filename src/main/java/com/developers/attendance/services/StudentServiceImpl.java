package com.developers.attendance.services;

import com.developers.attendance.entities.Student;
import com.developers.attendance.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findStudent(String code) {
        return studentRepository.findById(code).orElse(null);
    }
}
