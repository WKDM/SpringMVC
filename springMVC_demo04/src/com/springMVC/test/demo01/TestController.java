package com.springMVC.test.demo01;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class TestController {
	
	//获取客户端传入的数据
	@RequestMapping(value="/param",method=RequestMethod.POST)
	public String test(HttpServletRequest request,Map<String, Object> map){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		map.put("username",username);
		map.put("password",password);
		System.out.println("username="+username+".password="+password);
		return "success";
	}
}
