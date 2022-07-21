package com.example.sms.Services;

import com.example.sms.Model.Course;

import java.util.List;

public interface CourseService {

    List<Course> getAllCourses();

    Course saveCourse(Course course);

    Course getCourseById(Integer id);

    void deleteCourseById(Integer id);
}
