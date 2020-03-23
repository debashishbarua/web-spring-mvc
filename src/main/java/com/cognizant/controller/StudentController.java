package com.cognizant.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.model.Student;
import com.cognizant.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value="insert" ,method=RequestMethod.GET)
	public String insertPage() {	
		
		return "insert";
		
	}
	
	@RequestMapping(value="insert" ,method=RequestMethod.POST)
	public String insert(HttpServletRequest request) {
		//Read the request parameter
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		//Create the student
		Student student=new Student(id, name);
		
		System.out.println(student);
		//insert student to db
		
		request.setAttribute("msg", "Record Inserted");
		
		return "insert";
	}
	
	
	
	@RequestMapping(value="update" ,method=RequestMethod.GET)
	public String update() {
		return "update";
	}
	@RequestMapping(value="delete" ,method=RequestMethod.GET)
	public String delete() {
		return "delete";
	}
	@RequestMapping(value="getAll" ,method=RequestMethod.GET)
	public String getAll() {
		return "display";
	}

}
