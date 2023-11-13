package com.developers.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.developers.attendance.entities.Student;

@Repository 
public interface StudentRepository extends JpaRepository<Student, String> {
}
