package com.springMVC.Param;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springMVC.bean.User;

@Controller
public class ParamController {
	
	/*
	 * 在springMVC获取客户端传递的数据的方式：
	 * 1、在处理请求的方法中，加入相对应的形参，保证形参参数名和传递的数据的参数名保持一致，就可以自动赋值
	 * @RequestParam
	 * 1、value：当不满足赋值条件时，可以使用value属性，指定映射关系
	 * 2、required：设置形参是否必须被赋值，默认为true，必须赋值，若设置为false，则不必须赋值，因此形参的值为null
	 * 3、defaultValue：若形参所获的值为null，则设置一个默认值，用纸分页和模糊查询中
	 * 
	 * 
	 * */
	
	
//	@RequestMapping(value="/param",method=RequestMethod.POST)
//	public String param(@RequestHeader("Accept-Language") String AcceptLanguage){
//		System.out.println("AcceptLanguage="+AcceptLanguage);
//		return "success";
//	}
	
	
	/*
	 * 可以使用POJO获取客户端数据，要求实体类中属性名要与页面中表单中的name值一致
	 * 
	 * */
	
//	@RequestMapping(value="/param",method=RequestMethod.POST)
//	public String param(User user){
//		System.out.println(user);
//		return "success";
//	}
	
//	@RequestMapping(value="/param",method=RequestMethod.POST)
//	public String servletAPI(HttpServletRequest request){
//		String username=request.getParameter("username");
//		String password=request.getParameter("password");
//		String age=request.getParameter("age");
//		String province=request.getParameter("province");
//		String country=request.getParameter("country");
//		String city=request.getParameter("city");
//		System.out.println("username="+username+",password="+password+",age="+age+",province="+province+",city="+city+",country="+country);
//		return "success";
//	}
	
//	@RequestMapping(value="/param",method=RequestMethod.POST)
//	public ModelAndView modelAndView(User user,HttpServletRequest request){
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("username",user.getUsername());//往request中放值
//		mav.setViewName("success");//设置视图名称，实现页面跳转
//		return mav;		
//	}
//	@RequestMapping(value="/param",method=RequestMethod.POST)
//	public String param(Map<String, Object> map){
//		map.put("username", "root");//向作用域中放值
//		return "success";		//返回试图
//	}
	
	@RequestMapping(value="/param",method=RequestMethod.POST)
	public String param(Model model){
		model.addAttribute("username", "name");
		return "success";		//返回试图
	}
	
	
}
