package com.jithpl.student.managemt.system.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Transactional
@Entity
@Table(name = "EDUCATIONAL_DETAILS")
public class Education implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "education_Id")
    private Integer educationId;
	
	 private String qualification;
	    
	 @Column(name = "instituteName")
	 private String instituteName;
	    
	 @Column(name = "startedDate")
	 private String startedDate;
	
	 @Column(name = "end_Date")
	 private String endDate;
	    
	 private String grade;
	 
//	 @ManyToOne
//	 @JoinColumn(name = "fk_student_id")
//	 @JsonIgnore
//	 private Student student;
//	 
	
	public Education() {
		super();
	}
	
    
public Education(Integer educationId, String qualification, String instituteName, String startedDate,
			String endDate, String grade, Student student) {
		super();
		this.educationId = educationId;
		this.qualification = qualification;
		this.instituteName = instituteName;
		this.startedDate = startedDate;
		this.endDate = endDate;
		this.grade = grade;
//		this.student = student;
	}


public Integer getEducationId() {
	return educationId;
}
public void setEducationId(Integer educationId) {
	this.educationId = educationId;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}

public String getInstituteName() {
	return instituteName;
}


public void setInstituteName(String instituteName) {
	this.instituteName = instituteName;
}


public String getStartedDate() {
	return startedDate;
}


public void setStartedDate(String startedDate) {
	this.startedDate = startedDate;
}



public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
//public Student getStudent() {
//	return student;
//}
//public void setStudent(Student student) {
//	this.student = student;
//}

	
}
