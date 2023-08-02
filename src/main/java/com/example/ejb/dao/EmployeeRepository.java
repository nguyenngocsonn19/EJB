package com.example.ejb.dao;

import com.example.ejb.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


    List<Employee> findAllByOrderByNameAsc();


}
