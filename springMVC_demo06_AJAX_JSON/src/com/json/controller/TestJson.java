package com.json.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.json.bean.Employee;
import com.json.dao.EmployeeDao;

@Controller
public class TestJson {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping(value="/testJson",method=RequestMethod.POST)
	@ResponseBody
	public Collection<Employee> testJson(){
		Collection<Employee> emps = employeeDao.getAll();
		System.out.println(emps);
		return emps;
	}
}
