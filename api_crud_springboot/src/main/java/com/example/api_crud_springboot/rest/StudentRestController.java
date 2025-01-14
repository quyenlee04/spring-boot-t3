package com.example.api_crud_springboot.rest;




import com.example.api_crud_springboot.entity.Student;
import com.example.api_crud_springboot.service.StudentService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private StudentService studentService;

    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/students")
    public List<Student> getStudents() {

        return studentService.findAll();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
        return studentService.findById(id);
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        student.setId(0);
        Student newStudent = studentService.save(student);
        return newStudent;
    }
    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        Student newStudent = studentService.save(student);
        return newStudent;
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {
       studentService.deleteById(id);
       return "Deleted student id - " + id;
    }
}
