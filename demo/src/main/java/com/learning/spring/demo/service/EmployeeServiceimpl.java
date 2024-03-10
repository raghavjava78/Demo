package com.learning.spring.demo.service;


import com.learning.spring.demo.dao.EmployeDao;
import com.learning.spring.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceimpl implements EmployeeService {

    @Autowired
    EmployeDao employeDao;



    @Override public Employee addEmployee(Employee emp) {
        Employee savedEmployee = employeDao.save(emp);


        return savedEmployee ;
    }

    @Override
    public Employee getEmployee(long id) {
        return employeDao.findById(id).orElse(null);
    }
}
