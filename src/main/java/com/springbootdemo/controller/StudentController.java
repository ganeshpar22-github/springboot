package com.springbootdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdemo.beans.Student;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Ganesh", "Parmar", 24, "Dewas");
	}
	
	
	@GetMapping("/studentlist")
	public List<Student> getStudentList(){
			
		List<Student> students = new ArrayList<>();
		students.add(new Student("Ganesh", "Parmar", 24, "Dewas"));
		students.add(new Student("Yash", "Parmar", 21, "Dewas"));
		students.add(new Student("Aditya", "Namdev", 24, "Pune"));
		students.add(new Student("Rishabh", "Kundal", 25, "Kolkata"));
		students.add(new Student("Priyank", "Vyas", 25, "Mumbai"));
		
		return students;
	}

}
