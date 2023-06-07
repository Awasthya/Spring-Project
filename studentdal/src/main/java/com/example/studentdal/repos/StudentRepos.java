package com.example.studentdal.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.studentdal.entities.Student;

public interface StudentRepos extends CrudRepository<Student,Long>{
	

}
