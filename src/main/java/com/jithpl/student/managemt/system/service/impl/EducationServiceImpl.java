package com.jithpl.student.managemt.system.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jithpl.student.managemt.system.Repositiry.EducationRepository;
import com.jithpl.student.managemt.system.model.Education;
import com.jithpl.student.managemt.system.service.EducationService;

@Service
public class EducationServiceImpl implements EducationService {
	
	@Autowired
	private EducationRepository educationRepository;

	@Override
	public ArrayList<Education> getEducationDetails(Integer id) {
		return educationRepository.findByStudentId(id);
	}

}
