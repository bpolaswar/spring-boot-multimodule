package com.springmultimodule.controller;

import com.springmultimodule.input.EmployeeInput;
import com.springmultimodule.model.Employee;
import com.springmultimodule.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController
{

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/get-employees")
    public List<Employee> getAllEmployees()
    {
        return employeeService.getEmployee();
    }

    @PostMapping(value = "/insert-employee")
    public Employee insertEmployee(@RequestBody EmployeeInput employeeInput)
    {
        return employeeService.addEmployee(employeeInput);
    }
}
