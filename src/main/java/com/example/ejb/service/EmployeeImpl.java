package com.example.ejb.service;

import com.example.ejb.dao.EmployeeRepository;
import com.example.ejb.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImpl implements EmployeeService{

    private  EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeImpl(EmployeeRepository theEmployeeRepository){
        employeeRepository = theEmployeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return  employeeRepository.findAllByOrderByNameAsc();
    }

    @Override
    public void save(Employee theEmployee) {
        employeeRepository.save(theEmployee);
    }
}
