package com.example.sms.Model;

import javax.persistence.*;

@Entity
@Table(name = "courseregistration")
public class StudentCourse {

    @Column(name = "courseID", nullable = false)
    private Integer courseID;

    @Column(name = "studentID")
    private Integer studentID;
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getCourseID() {
        return courseID;
    }

    public void setCourseID(Integer courseID) {
        this.courseID = courseID;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "StudentCourse{" +
                "courseID=" + courseID +
                ", studentID=" + studentID +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
