package com.jithpl.student.managemt.system.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jithpl.student.managemt.system.Repositiry.StudentRepositiry;
import com.jithpl.student.managemt.system.model.Student;
import com.jithpl.student.managemt.system.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepositiry studentRepositiry;

	@Override
	@Transactional
	public List<Student> saveStudentDetails(List<Student> student) {
		return studentRepositiry.saveAll(student);
	}

	@Override
	
	public List<Student> getAllStudents() {
		return studentRepositiry.findAll();
	}

	@Override
	public Optional<Student> findById(Integer id) {
		return studentRepositiry.findById(id);
	}

	@Override

	public void deleteStudent(Integer id) {
		studentRepositiry.deleteById(id);
		
	}

}
