package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.model.Student;

@Service
public class StudentService {

	public List<Student> getAll() {

		List<Student> list = new ArrayList<>();
		
		list.add(new Student("10", "Mr. X"));
		list.add(new Student("11", "Mr. Y"));
		
		return list;
	}

}
