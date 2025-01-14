package com.example.api_crud_springboot.service;

import com.example.api_crud_springboot.dao.StudentDao;
import com.example.api_crud_springboot.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServicelmp implements StudentService {
    private StudentDao studentDao;

    public StudentServicelmp(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
        return studentDao.getAllStudents();
    }

    @Override
    public Student findById(int id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public Student save(Student student) {
        return studentDao.addStudent(student);
    }


    @Override

    public void deleteById(int id) {
        studentDao.deleteById(id);
    }


}
