package com.RestfulAPI.service;

import java.util.List;

import com.RestfulAPI.model.Student;

public interface StudentService {
	
	Student saveStudentAssignment(Student student);
	
	List <Student> getAllStudAssignmentlist();

}
