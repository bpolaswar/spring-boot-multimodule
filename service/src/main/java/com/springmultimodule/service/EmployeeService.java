package com.springmultimodule.service;

import com.springmultimodule.input.EmployeeInput;
import com.springmultimodule.model.Employee;
import com.springmultimodule.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService
{
    @Autowired
    private EmployeeRepository employeeRepository;

//    @PostConstruct
//    public void addEmp()
//    {
//        Employee employee1 = Employee.builder().id(1L).name("ABC").build();
//        Employee employee2 = Employee.builder().id(2L).name("PQR").build();
//        List<Employee> employees = new ArrayList<>();
//        employees.add(employee1); employees.add(employee2);
//        employeeRepository.saveAll(employees);
//    }

    public Employee addEmployee(EmployeeInput employeeInput)
    {
        Employee employee = Employee.builder().id(employeeInput.getId()).name(employeeInput.getName()).build();
        return employeeRepository.save(employee);
    }
    public List<Employee> getEmployee()
    {
            return employeeRepository.findAll();
    }
}
