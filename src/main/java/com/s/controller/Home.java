package com.s.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.s.entity.Employee;
import com.s.service.IEmployeeService;

@Controller
public class Home {
	@Autowired
	private IEmployeeService service;
	
	@RequestMapping("/")
	public ModelAndView getAll() {
		ModelAndView model = new ModelAndView("home");
		List<Employee> list = service.getAllEmployee();
		model.addObject("list",list );
		return model;
	}

}
