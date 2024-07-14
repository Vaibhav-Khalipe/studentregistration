package com.dockerexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dockerexample.entity.Student;
import com.dockerexample.service.StudentService;

@RestController
public class StudentController {

	
	@Autowired
	StudentService service;
	
	@GetMapping("/get/{id}")
	public Student getStudentById(@PathVariable int id)
	{
		System.out.println("GetStudent() executed");
		return service.getStudentById(id);
	}
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student)
	{
		System.out.println("save Student () executed");
		return service.saveStudent(student);
	}
}
