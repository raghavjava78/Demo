package com.learning.spring.demo.service;


import com.learning.spring.demo.dao.EmployeDao;
import com.learning.spring.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface EmployeeService {

    Employee addEmployee(Employee employee);
    Employee getEmployee(long id);



}
