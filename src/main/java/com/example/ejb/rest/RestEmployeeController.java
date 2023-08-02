package com.example.ejb.rest;


import com.example.ejb.dao.EmployeeRepository;
import com.example.ejb.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestEmployeeController {

    private EmployeeRepository employeeRepository;

    @Autowired
    public RestEmployeeController(EmployeeRepository theEmployeeRepository){
       employeeRepository = theEmployeeRepository;
    }


@GetMapping("/emp")
    List<Employee> all(){
        return employeeRepository.findAll();
}

@PostMapping("/emp")
        Employee newEmployee(@RequestBody Employee newEmployee){
            return employeeRepository.save(newEmployee);
    }

}
