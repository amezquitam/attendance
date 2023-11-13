package com.developers.attendance.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.developers.attendance.entities.Teacher;
import com.developers.attendance.repository.TeacherRepository;

public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;
    
    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

}
