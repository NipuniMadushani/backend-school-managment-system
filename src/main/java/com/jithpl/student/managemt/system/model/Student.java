package com.jithpl.student.managemt.system.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.transaction.Transactional;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Transactional
@Entity
@Table(name = "STUDENT")
public class Student implements Serializable{
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "student_Id")
	    private Integer studentId;
	    
	    @Column(name = "first_Name")
	    private String firstName;
	    
	    @Column(name = "last_Name")
	    private String lastName;
	    
	    @Column(name = "contact_Number")
	    private String contactNumber;
	    
	    private String email;
	    
	    @Column(name = "parent_Name")
	    private String parentName;
	    
	    @Column(name = "parent_Contact_Number")
	    private String parentContactNumber;
	    
	    @Column(name = "parent_Email")
	    private String parentEmail;
	    
//	    @OneToMany(mappedBy = "student")
	    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	    @JoinColumn(name="fk_student_id",referencedColumnName ="student_Id" )
	    private List<Education> education;

		public Student() {
			super();
		}

		

		public Student(Integer studentId, String firstName, String lastName, String contactNumber, String email,
				String parentName, String parentContactNumber, String parentEmail, List<Education> education) {
			super();
			this.studentId = studentId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.contactNumber = contactNumber;
			this.email = email;
			this.parentName = parentName;
			this.parentContactNumber = parentContactNumber;
			this.parentEmail = parentEmail;
			this.education = education;
		}



		public Integer getStudentId() {
			return studentId;
		}

		public void setStudentId(Integer studentId) {
			this.studentId = studentId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getParentName() {
			return parentName;
		}

		public void setParentName(String parentName) {
			this.parentName = parentName;
		}

		public String getParentContactNumber() {
			return parentContactNumber;
		}

		public void setParentContactNumber(String parentContactNumber) {
			this.parentContactNumber = parentContactNumber;
		}

		

		public String getParentEmail() {
			return parentEmail;
		}



		public void setParentEmail(String parentEmail) {
			this.parentEmail = parentEmail;
		}



		public List<Education> getEducation() {
			return education;
		}

		public void setEducation(List<Education> education) {
			this.education = education;
		}
		
		
		
		
}
