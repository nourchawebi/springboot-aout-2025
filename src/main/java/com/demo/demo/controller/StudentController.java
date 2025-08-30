package com.demo.demo.controller;

import com.demo.demo.model.Student;
import com.demo.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("student")
public class StudentController {
    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
     @GetMapping
     public Flux<Student> getallstudents() {
        return studentService.getStudents();
     }
    @PostMapping
    public Mono<Student> addstudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }
}

