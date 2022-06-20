package com.jithpl.student.managemt.system.Repositiry;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jithpl.student.managemt.system.model.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Integer>{

	@Query(value="SELECT * FROM EDUCATIONAL_DETAILS u where u.fk_student_id= :id",
			 nativeQuery=true) 
	ArrayList<Education> findByStudentId(Integer id);

}
