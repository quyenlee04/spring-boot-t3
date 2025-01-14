package com.example.api_crud_springboot.dao;

import com.example.api_crud_springboot.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class StudentDaoImp implements StudentDao {
    private EntityManager em;

    @Autowired
    public StudentDaoImp(EntityManager em) {
        this.em = em;
    }
    @Override
    public Student getStudentById(int id) {
        return em.find(Student.class, id);
    }
    @Override
    public List<Student> getAllStudents() {
        TypedQuery<Student> query = em.createQuery("select s from Student s", Student.class);
        List<Student> students = query.getResultList();
        return students;
    }

    @Override
    @Transactional
    public Student addStudent(Student student) {
        Student newStudent = em.merge(student);
        return newStudent;
    }
    @Override
    @Transactional
    public void deleteById(int id) {
        em.remove(getStudentById(id));
    }



}
