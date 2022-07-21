package com.example.sms.dto;

import com.example.sms.Model.Course;
import com.example.sms.Model.Student;

import java.util.List;

public class Registration {
    private Integer courseID;
    private Student student;
    private List<Course> courses;

    public Integer getCourseID() {
        return courseID;
    }

    public void setCourseID(Integer courseID) {
        this.courseID = courseID;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
