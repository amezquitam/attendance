package com.developers.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.developers.attendance.entities.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, String> {
}
