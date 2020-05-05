package com.springMVC.test.controller;

import java.io.Reader;
import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springMVC.test.bean.Department;
import com.springMVC.test.bean.Employee;
import com.springMVC.test.dao.DepartmentDao;
import com.springMVC.test.dao.EmployeeDao;

@Controller
public class EmpController {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	
	/**
	 * 获取所有员工的信息
	 * @param Map
	 * @return list
	 * */
	@RequestMapping(value="/emps")
	public String getAll(Map<String,Object> map){
		Collection<Employee> emps = employeeDao.getAll();
		map.put("emps",emps);
		return "list";
	}
	
	
	/**
	 * 跳转到添加页面
	 * @return
	 * */
	@RequestMapping(value="/emp",method=RequestMethod.GET)
	public String toAdd(Map<String,Object> map){
		Collection<Department> departs = departmentDao.getDepartments();
		map.put("departs",departs);
		return "add";
	}
	
	
	/**
	 * 添加员工信息
	 * */
	@RequestMapping(value="/emp",method=RequestMethod.POST)
	public String addEmp(Employee employee){
		employeeDao.save(employee);
		return "redirect:/emps"; //一般增删该后用重定向
	}
	
	/**
	 * 获取要回显的数据，跳转到修改页面并回显
	 * */
	
	@RequestMapping(value="/emp/{id}",method=RequestMethod.GET)
	public String toupdate(@PathVariable("id") Integer id,Map<String,Object> map){//@PathVariable("id")用来接受传递过来的参数
		//获取要修改的员工信息
		Employee emp = employeeDao.get(id);
		//获取部门信息，供用户修改选择
		Collection<Department> departs = departmentDao.getDepartments();
		//把获取的数据放到页面上
		map.put("emp", emp);
		map.put("departs",departs);
		return "update";
	}
	
	/**
	 * 修改页面
	 * */
	@RequestMapping(value="/emp",method=RequestMethod.PUT)
	public String update(Employee employee){
		employeeDao.save(employee);//修改
		return "redirect:/emps";
	}
	
	@RequestMapping(value="/emp/{id}",method=RequestMethod.DELETE)
	public String deleteEmp(@PathVariable("id") Integer id){
		employeeDao.delete(id);
		return "redirect:/emps";
	}
	
	
	
	
}
