package org.example.getpostsbtest.controller;

import org.example.getpostsbtest.model.Student;
import org.example.getpostsbtest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("student")
    public List<Student> getStudent(){
        return studentService.getStd();
    }
    @GetMapping("student/{id}")
    public Student getStudentID(@PathVariable("id") int id)
    {
        return studentService.getStdID(id);
    }
    @PostMapping("student")
    public String addStudent(@RequestBody Student student)
    {
        studentService.addStudent(student);
        return "successfully added a new student";
    }
    @PutMapping("student")
    public String updateStudents(@RequestBody Student student)
    {
        return studentService.updStud(student);
    }


}
