package com.robusto.school.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.robusto.school.entity.Course;

@CrossOrigin
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
