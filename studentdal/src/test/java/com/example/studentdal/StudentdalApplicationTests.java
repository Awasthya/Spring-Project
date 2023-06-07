package com.example.studentdal;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.studentdal.entities.Student;
import com.example.studentdal.repos.StudentRepos;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

	@Autowired
	private StudentRepos studentrepository;
	
	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("Ajay");
		student.setCourse("Java");
		student.setFees(200d);
		
		studentrepository.save(student);
	}
	
	@Test 
	public void testFindStudentById() {
		Student st = studentrepository.findById(1l).get(); //.get() is used for getting student value form Optional<student>
		 System.out.print(st);
	}
	

}
