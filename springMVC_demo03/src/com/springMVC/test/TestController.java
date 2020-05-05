package com.springMVC.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	/**
	 * http://localhost:8080/springMVC_demo03/testREST?id=1001&name=admin
	 * http://localhost:8080/springMVC_demo03/testREST/1001/admin
	 * */
	
	@RequestMapping(value="testREST/{id}/{name}")
	public String testREST(@PathVariable("id")Integer id,@PathVariable("name")String name){
		System.out.println("id:"+id+"=="+"name:"+name);
		System.out.println("SUCCESS");
		return "success";
	}
}
