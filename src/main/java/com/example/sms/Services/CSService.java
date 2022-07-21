package com.example.sms.Services;

import com.example.sms.Model.StudentCourse;

import java.util.List;

public interface CSService {

    List<StudentCourse> getAllCourseStudents();

    StudentCourse saveCourseStudent(StudentCourse courseStudent);

    StudentCourse getCourseStudentById(Integer id);

    void deleteCourseStudentById(Integer id);
}
