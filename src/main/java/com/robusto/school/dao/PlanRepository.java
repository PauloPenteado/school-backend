package com.robusto.school.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.robusto.school.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer> {

}
