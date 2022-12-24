package com.group6.backend.dao;

import com.group6.backend.pojo.Employee;

import java.util.List;

public interface EmployeeDao {
  List<Employee> getEmployeeList(Employee employee);

  boolean selectCardId(String id);

  int addEmployee(Employee employee);

  int countEmployee();
}