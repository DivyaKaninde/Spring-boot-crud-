package com.main.o2oCrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.main.o2oCrud.model.Student;
import com.main.o2oCrud.servicei.StudentServiceI;


@Controller
public class HomeController 
{ 
	@Autowired
	StudentServiceI ssi;
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";		
	}
	
	@RequestMapping("/register")
	public String preregister()
	{
		return "registration";		
	}
	
	@RequestMapping("/log")
	public String saveInfo(@ModelAttribute Student st,Model m)
	{
		ssi.saveInfo(st);
		
		if(st!=null)
		{
			return "login";	
		}
		else 
		{
			return "registration";
		}
	}
	
	@RequestMapping("/login")
	public String loginCheck(@RequestParam ("uname") String un,@RequestParam ("pword") String pw, Model m)
	{
		System.out.println("Username :"+un);
		System.out.println("Password :"+pw);
		Student id=ssi.loginCheck(un,pw);
	Iterable<Student> list=ssi.displayAll();
		if(id!=null)
		{
			m.addAttribute("stu", list);
			return"success";
		}
		else
		{
			return "login";
		}
						
	}
	
	@RequestMapping("/delete")
	public String deleteStudent(@ModelAttribute Student s,Model m)
	{
		ssi.deleteStudent(s);
		Iterable<Student> list=ssi.displayAll();
		m.addAttribute("stu", list);
		return "success";		
	}
	
	@RequestMapping("/edit")
	public String editData(@RequestParam int sid,Model m)
	{
		Student st=ssi.editStudent(sid);
		
			
		if(st!=null)
		{
			m.addAttribute("stu", st);
			return "update";
		}
		else 
		{
			return "success";
		}
	}
	
	@RequestMapping("/update")
	public String UpdateData(@ModelAttribute Student s,Model m)
	{
		ssi.saveInfo(s);
		Iterable<Student> list=ssi.displayAll();
		m.addAttribute("stu", list);
		
		return "success";		
	}
		
	
	
	@RequestMapping("/*")
	public String error()
	{
		return "error";		
	}
	
	
	

}
