package com.example.demo;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean

		public CommandLineRunner commandLineRunner(StudentDao studentDao) {
			return runner -> {
				System.out.println("Connecting to database");
//				CreateStudent(studentDao);
//				System.out.println("Inserting new student");

//				System.out.println("Viewing student");
//				viewStudent(studentDao);

//				viewAllStudents(studentDao);

//				viewStudentByName(studentDao);
//				updateStudent(studentDao);

//				deleteStudent(studentDao);

				deleteAll(studentDao);
			};
		}

		public void viewStudent(StudentDao studentDao) {
		int id = 1;
			Student students = studentDao.findById(id);

				System.out.println(students);

		}
		public void CreateStudent(StudentDao studentDao) {
			Student tempStudent = new Student("Ngọc", "Lê", "quyenle5184@gmail.com");
			studentDao.save(tempStudent);
		}

		public void viewAllStudents(StudentDao studentDao) {
			List<Student> students = studentDao.findAll();
			for (Student student : students) {
				System.out.println(student);
			}
		}

		public void viewStudentByName(StudentDao studentDao) {
			List<Student> students = studentDao.findByName("Ngoc");
			for (Student student : students) {
				System.out.println(student);
			}
		}

		public void updateStudent(StudentDao studentDao) {
		Student student = studentDao.findById(1);
		student.setFristname("Nhớ");
		student.setLastname("Ngu");
		student.setEmail("nhongu@gmail.com");
		studentDao.update(student);
		}

		public void deleteStudent(StudentDao studentDao) {
			studentDao.delete(1);
		}

		public void deleteAll(StudentDao studentDao) {
			studentDao.deleteAll();
			System.out.println("Deleted all students");
		}
	}


