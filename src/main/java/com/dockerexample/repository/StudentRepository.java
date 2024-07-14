package com.dockerexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dockerexample.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
