
package com.developers.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developers.attendance.entities.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
}