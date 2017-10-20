package com.xsis.training125.dao;

import java.util.List;

import com.xsis.training125.model.Employee;

public interface EmployeeDao {

	public void save(Employee employee);

	public List<Employee> getAllEmployees();


}
