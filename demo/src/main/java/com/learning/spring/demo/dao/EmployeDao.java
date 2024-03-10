package com.learning.spring.demo.dao;

import com.learning.spring.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeDao extends JpaRepository<Employee,Long> {





}
