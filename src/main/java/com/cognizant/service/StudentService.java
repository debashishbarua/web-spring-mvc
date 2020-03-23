package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.model.Student;

@Service
public class StudentService {

	private List<Student>  list=new ArrayList<Student>();
	
	public String insert(Student student) {

		return null;
	}

	public String delete(Student student) {

		return null;
	}

	public String update(Student student) {

		return null;
	}

	public List<Student> getAll() {

		List<Student> list = new ArrayList<>();

		list.add(new Student("10", "Mr. X"));
		list.add(new Student("11", "Mr. Y"));

		return list;
	}

}
