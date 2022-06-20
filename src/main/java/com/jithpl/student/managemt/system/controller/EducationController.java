package com.jithpl.student.managemt.system.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jithpl.student.managemt.system.model.Student;
import com.jithpl.student.managemt.system.model.Education;
import com.jithpl.student.managemt.system.service.EducationService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/education")
public class EducationController {
	
	@Autowired
	private EducationService educationService;
	
//	findById
	@GetMapping("/getEducationDetails/{studentId}")
	public List<Education> getEucationalDetails(@PathVariable Integer studentId) {
		ArrayList<Education> edList=educationService.getEducationDetails(studentId);

//		if(student.isPresent()) {
//			 stu= student.get();
//		}else {
////			throw new NotFoundException("Student not found with id"+id);
//		}
		
	  return edList;
	}

}
