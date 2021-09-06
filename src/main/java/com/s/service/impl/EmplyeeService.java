package com.s.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s.entity.Employee;
import com.s.mapper.EmployeeMapper;
import com.s.service.IEmployeeService;


@Service
public class EmplyeeService implements IEmployeeService {
	 @Autowired
	    private EmployeeMapper mapper;

	@Override
	public List<Employee> getAllEmployee() {
	
		return mapper.findAll();
	}

	@Override
	public Employee getEmployee(long id) {
		
		return mapper.findById(id);
	}

	@Override
	public void addEmployee(Employee employee) {
		mapper.add(employee);
		
	}

	@Override
	public void deleteEmployee(long id) {
		mapper.delete(id);
		
	}

	    

}
