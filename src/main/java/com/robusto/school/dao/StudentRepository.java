package com.robusto.school.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robusto.school.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
