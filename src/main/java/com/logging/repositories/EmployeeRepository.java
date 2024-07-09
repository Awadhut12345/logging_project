package com.logging.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logging.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}