package com.json.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadPhoto {
	
	@RequestMapping(value="/up_old",method=RequestMethod.POST)
	public String up_old(String desc,@RequestParam(value="photo",required=true) MultipartFile uploadFile,HttpSession session) throws IOException{
		
		//��ȡ�ϴ��ļ�������
		String filename = uploadFile.getOriginalFilename();
		String path = session.getServletContext().getRealPath("photo") + File.separator + filename;
		//��ȡ������
		InputStream is = uploadFile.getInputStream();
		//��ȡ�����
		File file = new File(path);
		OutputStream os = new FileOutputStream(file);
		//����һ��
		/*int i=0;
		while((i=is.read())!=-1){
			os.write(i);
		}*/
		
		//��������
		int i=0;
		byte[] b = new byte[1024];
		while((i=is.read(b))!=-1){
			os.write(b,0,i);
		}
		
		
		os.close();
		is.close();
		return "success";		
	}
	/*
	 * ���Ҫ������ϴ�����MultipartFile[] uploadFile,����forѭ��
	 * */
	@RequestMapping(value="/up",method=RequestMethod.POST)
	public String up(String desc,@RequestParam(value="photo",required=true)MultipartFile uploadFile,HttpSession session) throws IOException{
		String filename = uploadFile.getOriginalFilename();
		String finalfileName = UUID.randomUUID()+filename.substring(filename.lastIndexOf("."));
		String path = session.getServletContext().getRealPath("photo") + File.separator + finalfileName;
		File file = new File(path);
		uploadFile.transferTo(file);
		return "success";
	}
	
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView upload(String desc,@RequestParam(value="photo",required=true) MultipartFile uploadFile){
		String name = uploadFile.getName();
		String filename = uploadFile.getOriginalFilename();
		System.out.println(name+"====="+filename);
		ModelAndView model = new ModelAndView("success");
		return model;
	}
}
