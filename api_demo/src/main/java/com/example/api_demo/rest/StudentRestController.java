package com.example.api_demo.rest;



import com.example.api_demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> students;
    @PostConstruct
    public void init() {
        students = new ArrayList<>();
        students.add(new Student(1, "John", "Doe", "john@gmail.com"));
        students.add(new Student(2, "Jane", "Doe", "jane@gmail.com"));
        students.add(new Student(3, "Jack", "Doe", "jack@gmail.com"));
    }
    @RequestMapping("/students")
    public List<Student> getStudents() {

        return students;
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
        return students.get(id);
    }
}
