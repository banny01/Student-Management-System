package com.example.sms.Controller;

import com.example.sms.Config.Message;
import com.example.sms.Model.Course;
import com.example.sms.Model.Student;
import com.example.sms.Model.StudentCourse;
import com.example.sms.Services.CSService;
import com.example.sms.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.sms.Services.StudentService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SmsController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private CSService regSrevice;

    @GetMapping("/sms")
    public String index() {
        return "index";
    }

    @GetMapping("/sms/students")
    public String students(Model model) {

        model.addAttribute("message", new Message());
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/sms/students/add")
    public String createStudentForm(Model model) {

        Student student = new Student();
        model.addAttribute("student", student);
        return "studentForm";
    }

    @PostMapping("/sms/students")
    public String saveStudent(@ModelAttribute("student") Student student, Model model) {

        try {
            studentService.saveStudent(student);
            model.addAttribute("message", new Message("success","Student added successfuly."));
        } catch (Exception e) {
            model.addAttribute("message", new Message("error","Student adding failed."));
            e.printStackTrace();
        }

        return "redirect:/sms/students";
    }

    @GetMapping("/sms/students/edit/{id}")
    public String editStudentForm(@PathVariable Integer id, Model model) {

        model.addAttribute("student", studentService.getStudentById(id));
        return "studentForm";
    }

    @GetMapping("/sms/students/{id}")
    public String deleteStudent(@PathVariable Integer id, Model model) {
        try {
            model.addAttribute("message", new Message("success", "Record deleted successfuly."));
            studentService.deleteStudentById(id);
        } catch (Exception e) {
            model.addAttribute("message", new Message("error", "Record not deleted."));
            e.printStackTrace();
        }
        return "redirect:/sms/students";
    }

    @GetMapping("/sms/courses")
    public String courses(Model model) {

        model.addAttribute("message", new Message());
        model.addAttribute("courses", courseService.getAllCourses());
        return "courses";
    }

    @GetMapping("/sms/courses/add")
    public String createCourseForm(Model model) {

        Course course = new Course();
        model.addAttribute("course", course);
        return "courseForm";
    }

    @PostMapping("/sms/courses")
    public String saveCourse(@ModelAttribute("course") Course course, Model model) {

        try {
            courseService.saveCourse(course);
            model.addAttribute("message", new Message("success","Course added successfuly."));
        } catch (Exception e) {
            model.addAttribute("message", new Message("error","Course adding failed."));
            e.printStackTrace();
        }

        return "redirect:/sms/courses";
    }

    @GetMapping("/sms/courses/edit/{id}")
    public String editCourseForm(@PathVariable Integer id, Model model) {

        model.addAttribute("course", courseService.getCourseById(id));
        return "courseForm";
    }

    @GetMapping("/sms/courses/{id}")
    public String deleteCourse(@PathVariable Integer id, Model model) {

        try {
            model.addAttribute("message", new Message("success", "Record deleted successfuly."));
            courseService.deleteCourseById(id);
        } catch (Exception e) {
            model.addAttribute("message", new Message("error", "Record not deleted."));
            e.printStackTrace();
        }
        return "redirect:/sms/courses";
    }

    @GetMapping("/sms/courses/registration/{id}")
    public String courseRegForm(@PathVariable Integer id, Model model) {

        StudentCourse registration = new StudentCourse();
        model.addAttribute("registration", registration);
        model.addAttribute("student", studentService.getStudentById(id));
        model.addAttribute("courses", courseService.getAllCourses());
        return "registrationForm";
    }

    @PostMapping("/sms/resigter")
    public String saveCourse(@ModelAttribute("registration") StudentCourse registration, Model model) {

        try {
            regSrevice.saveCourseStudent(registration);
            model.addAttribute("message", new Message("success","Student registerd for a course successfuly."));
        } catch (Exception e) {
            model.addAttribute("message", new Message("error","Registration failed."));
            e.printStackTrace();
        }

        return "redirect:/sms/courses/registration/"+registration.getStudentID();
    }
}
