package com.springMVC.testdemo01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RESTController {
	
	@RequestMapping(value="/testREST/{id}",method=RequestMethod.GET)
	public String getUserById(@PathVariable("id")Integer id){
		System.out.println("GET,id="+id);
		return "success";
	}
	
	@RequestMapping(value="/testREST",method=RequestMethod.POST)
	public String insertUser(){
		System.out.println("POST");
		return "success";
	}
	
	@RequestMapping(value="/testREST/{id}",method=RequestMethod.DELETE)
	public String updateUser(@PathVariable("id")Integer id){
		System.out.println("DELETE,id="+id);
		return "success";
	}
	@RequestMapping(value="/testAJAX_DELETE",method=RequestMethod.DELETE)
	public void testAJAX_DELETE(Integer id){//因为AJAX就是不发生页面跳转，所以不能有返回值
		System.out.println("testAjax_DELETE,id="+id);
	}
	
}
