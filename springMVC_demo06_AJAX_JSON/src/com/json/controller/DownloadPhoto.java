package com.json.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpSession;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DownloadPhoto {
	@RequestMapping(value="/down")
	public ResponseEntity<byte[]> download(HttpSession session) throws IOException{
		
		//获取下载文件的路径
		String realPath = session.getServletContext().getRealPath("/image");
		System.out.println(realPath);
		String finalPath = realPath + File.separator+"1.jpg";
		System.out.println(finalPath);
		
		InputStream is =new FileInputStream(finalPath);
		
		
		//available():获取输入流所读取的文件最大字节数
		byte[] bys = new byte[is.available()];
		
		is.read();
		
		//设置请求头		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition","attachment;filename=zzz.jpg");
		
		//设置状态码
		HttpStatus statusCode = HttpStatus.OK;
		
		ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(bys,headers,statusCode);
				
		return entity;		
	}
}
