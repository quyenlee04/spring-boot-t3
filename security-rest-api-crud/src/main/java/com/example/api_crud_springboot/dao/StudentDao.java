package com.example.api_crud_springboot.dao;

import com.example.api_crud_springboot.entity.Student;

import java.util.List;

public interface StudentDao {
    Student getStudentById(int id);
    List<Student> getAllStudents();

    Student addStudent(Student student);

    void deleteById(int id);

}
