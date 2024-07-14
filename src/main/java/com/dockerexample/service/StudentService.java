package com.dockerexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dockerexample.entity.Student;
import com.dockerexample.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository repository;
	
	public Student getStudentById(int id) {

		return repository.getById(id);
	}

	public Student saveStudent(Student student) {

		return repository.save(student);
	}

}
