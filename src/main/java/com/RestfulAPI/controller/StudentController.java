package com.RestfulAPI.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RestfulAPI.model.Student;
import com.RestfulAPI.service.StudentService;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@PostMapping
	public ResponseEntity<Student> saveStudent(@RequestBody Student student)
	{
		return new ResponseEntity<Student>(studentService.saveStudentAssignment(student),HttpStatus.CREATED);
	}
	
	
	//build get all employees Rest API
	@GetMapping("/assignments")
	public List<Student> getAllStudentAssignments()
	{
		return studentService.getAllStudAssignmentlist();
		
	}
	

}
