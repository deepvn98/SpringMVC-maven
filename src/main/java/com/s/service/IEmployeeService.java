package com.s.service;

import java.util.List;

import com.s.entity.Employee;


public interface IEmployeeService {
	 public List<Employee> getAllEmployee();

	    public Employee getEmployee(long id);

	    public void addEmployee(Employee employee);

	    public void deleteEmployee(long id);

}
