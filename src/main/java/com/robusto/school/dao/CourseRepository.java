package com.robusto.school.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robusto.school.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
