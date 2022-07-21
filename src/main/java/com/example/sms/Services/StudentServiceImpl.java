package com.example.sms.Services;

import com.example.sms.Model.Student;
import com.example.sms.Dao.StudentDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private final StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentDao.findById(id).get();
    }

    @Override
    public void deleteStudentById(Integer id) {
        studentDao.deleteById(id);
    }
}
