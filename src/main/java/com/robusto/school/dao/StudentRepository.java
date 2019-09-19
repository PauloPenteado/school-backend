package com.robusto.school.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.robusto.school.entity.Student;

@CrossOrigin
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
