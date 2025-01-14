package com.example.api_crud_springboot.service;

import com.example.api_crud_springboot.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(int id);
    Student save(Student student);
    void deleteById(int id);
}
