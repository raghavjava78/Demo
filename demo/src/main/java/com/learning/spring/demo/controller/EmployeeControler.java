package com.learning.spring.demo.controller;

import com.learning.spring.demo.model.Employee;
import com.learning.spring.demo.service.EmployeeService;
import com.learning.spring.demo.service.EmployeeServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeControler {

   @Autowired
   EmployeeService empservice;

    @GetMapping("/{id}")
    public Employee getEmployeeDetails(@PathVariable long id ){

             return empservice.getEmployee(id);
    }

    @GetMapping("")
    public List<Employee>  getEmployees( ){


        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee("raghu",3000,"engineer"));

        return emp;
    }


    @PostMapping()
    public Employee addEmployee(@RequestBody Employee employee){

     Employee emp=   empservice.addEmployee(employee);

       return emp;
    }




}
