package com.example.sms.Services;

import com.example.sms.Model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Integer id);

    void deleteStudentById(Integer id);
}
