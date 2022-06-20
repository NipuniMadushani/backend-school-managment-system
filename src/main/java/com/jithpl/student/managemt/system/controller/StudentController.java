package com.jithpl.student.managemt.system.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jithpl.student.managemt.system.model.Student;
import com.jithpl.student.managemt.system.service.StudentService;

@RestController
@CrossOrigin("*")
@RequestMapping("/student")
public class StudentController {
	
	@Autowired 
	private StudentService studentService;
	
	
//	save Student and Educational Details
	@PostMapping("/add")
	public List<Student> saveStudent(@RequestBody List<Student> student) {
		 List<Student> stu= getAllStudents();
	  return studentService.saveStudentDetails(student);
	 
	}
	
//	get All Student Details
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents() {
		List<Student> students=studentService.getAllStudents();
	
//		for (Student s : students) {
//	
//		}
	  return students;
	}


//	findById
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable Integer id) {
		Student stu=new Student();
		Optional<Student> student=studentService.findById(id);
		if(student.isPresent()) {
			 stu= student.get();
		}else {
//			throw new NotFoundException("Student not found with id"+id);
		}
		
	  return stu;
	}
	
	@DeleteMapping("/delete/{studentId}")
	public void delete(@PathVariable("studentId") Integer studentId) {
		Optional<Student> student=studentService.findById(studentId);
		if(student.isPresent()) {
			studentService.deleteStudent(studentId);
		}else {
//			throw new NotFoundException("Student not found with id"+id);
		}
	
	}
	
}
