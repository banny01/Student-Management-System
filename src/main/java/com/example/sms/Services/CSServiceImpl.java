package com.example.sms.Services;

import com.example.sms.Model.StudentCourse;
import com.example.sms.Dao.CSDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CSServiceImpl implements CSService{

    private final CSDao csDao;

    public CSServiceImpl(CSDao csDao) {
        this.csDao = csDao;
    }


    @Override
    public List<StudentCourse> getAllCourseStudents() {
        return csDao.findAll();
    }

    @Override
    public StudentCourse saveCourseStudent(StudentCourse courseStudent) {
        return csDao.save(courseStudent);
    }

    @Override
    public StudentCourse getCourseStudentById(Integer id) {
        return csDao.findById(id).get();
    }

    @Override
    public void deleteCourseStudentById(Integer id) {
        csDao.deleteById(id);
    }
}
