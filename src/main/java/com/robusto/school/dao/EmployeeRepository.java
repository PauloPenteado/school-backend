package com.robusto.school.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.robusto.school.entity.Employee;

@CrossOrigin
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
