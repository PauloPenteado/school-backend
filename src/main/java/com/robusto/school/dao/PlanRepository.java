package com.robusto.school.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.robusto.school.entity.Plan;

@CrossOrigin
public interface PlanRepository extends JpaRepository<Plan, Integer> {

}
