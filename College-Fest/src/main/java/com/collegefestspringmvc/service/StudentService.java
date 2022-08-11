package com.collegefestspringmvc.service;

import java.util.List;

import com.collegefestspringmvc.model.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public void addStudent(Student student);

	public void deleteStudentById(int studentId);

	public void updateStudent(Student student);
}
