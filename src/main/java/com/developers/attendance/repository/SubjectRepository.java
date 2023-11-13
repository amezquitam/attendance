package com.developers.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developers.attendance.entities.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
