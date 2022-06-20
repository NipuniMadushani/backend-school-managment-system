package com.jithpl.student.managemt.system.Repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jithpl.student.managemt.system.model.Student;

@Repository
public interface StudentRepositiry extends JpaRepository<Student, Integer> {

}
