package com.robusto.school.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robusto.school.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
