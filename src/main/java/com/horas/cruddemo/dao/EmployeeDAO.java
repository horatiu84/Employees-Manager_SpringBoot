package com.horas.cruddemo.dao;

import com.horas.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
