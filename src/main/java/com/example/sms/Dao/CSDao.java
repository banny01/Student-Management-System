package com.example.sms.Dao;

import com.example.sms.Model.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CSDao extends JpaRepository<StudentCourse, Integer> {
}
