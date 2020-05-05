package com.springMVC.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	/**
	 * 假设：localhost:8080/springMVC_demo01/hello
	 * */
	
	@RequestMapping(value="hello")
	public String hello(String username,String password){
		System.out.println(username+"======="+password);
		return "success";//视图名称
	}
	
	
	@RequestMapping(value="test")
	public String hello(){
		System.out.println("test");
		return "test";//视图名称
	}
}
