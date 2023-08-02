package com.example.ejb.service;


import com.example.ejb.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public void save(Employee theEmployee);
}
