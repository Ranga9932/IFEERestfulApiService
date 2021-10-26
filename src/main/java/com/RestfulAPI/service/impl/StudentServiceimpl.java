package com.RestfulAPI.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestfulAPI.model.Student;
import com.RestfulAPI.repository.StudentRepository;
import com.RestfulAPI.service.StudentService;

@Service
public class StudentServiceimpl implements StudentService {
	
	
	private StudentRepository studentRepository;
	
	@Autowired
	public StudentServiceimpl(StudentRepository studentRepository)
	{
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public Student saveStudentAssignment(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public List<Student> getAllStudAssignmentlist() {
		
		return studentRepository.findAll();
	}

}
