package com.jithpl.student.managemt.system.service;

import java.util.List;
import java.util.Optional;

import com.jithpl.student.managemt.system.model.Student;

public interface StudentService {


List<Student> saveStudentDetails(List<Student> student);

List<Student> getAllStudents();

Optional<Student> findById(Integer id);

void deleteStudent(Integer id);

}
