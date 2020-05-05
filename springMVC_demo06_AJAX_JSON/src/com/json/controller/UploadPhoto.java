package com.json.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadPhoto {
	
	@RequestMapping(value="/up",method=RequestMethod.POST)
	public String up(String desc,MultipartFile uploadFile){
		String name = uploadFile.getName();
		String filename = uploadFile.getOriginalFilename();
		System.out.println(name+","+filename);
		return "success";
	}
}
