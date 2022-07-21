package com.example.sms.Services;

import com.example.sms.Model.Course;
import com.example.sms.Dao.CourseDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    private final CourseDao courseDao;

    public CourseServiceImpl(CourseDao courseDao) {
        this.courseDao = courseDao;
    }


    @Override
    public List<Course> getAllCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course saveCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public Course getCourseById(Integer id) {
        return courseDao.findById(id).get();
    }

    @Override
    public void deleteCourseById(Integer id) {
        courseDao.deleteById(id);
    }
}
