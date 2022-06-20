package com.jithpl.student.managemt.system.Dto;

public class CommonStudentDetailsDTO {
	   private Integer studentId;
	    
	    private String firstName;
	    
	    private String lastName;
	    
	    private String contactNumber;
	    
	    private String email;
	    
	    private String parentName;
	    
	    private String parentContactNumber;
	    
	    private String parentEmail;
	    
	    private Integer educationId;
	    
		 private String qualification;
		    
		 private String instituteName;
		    
		 private String startedDate;
		
		 private String endDate;
		    
		 private String grade;

		public CommonStudentDetailsDTO() {
			super();
		}

		public CommonStudentDetailsDTO(Integer studentId, String firstName, String lastName, String contactNumber,
				String email, String parentName, String parentContactNumber, String parentEmail, Integer educationId,
				String qualification, String instituteName, String startedDate, String endDate, String grade) {
			super();
			this.studentId = studentId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.contactNumber = contactNumber;
			this.email = email;
			this.parentName = parentName;
			this.parentContactNumber = parentContactNumber;
			this.parentEmail = parentEmail;
			this.educationId = educationId;
			this.qualification = qualification;
			this.instituteName = instituteName;
			this.startedDate = startedDate;
			this.endDate = endDate;
			this.grade = grade;
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

		
		 
		 
}
