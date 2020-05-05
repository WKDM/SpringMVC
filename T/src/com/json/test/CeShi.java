package com.json.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CeShi{
	
	@RequestMapping(value="/test")
	public String ceshi(){
		return "success";
	}
}
