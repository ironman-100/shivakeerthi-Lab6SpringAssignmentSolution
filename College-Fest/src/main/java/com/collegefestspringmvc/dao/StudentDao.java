package com.collegefestspringmvc.dao;

import java.util.List;

import com.collegefestspringmvc.model.Student;

public interface StudentDao {

	public List<Student> getAllStudents();

	public void addStudent(Student student);

	public void deleteStudentById(int studentId) throws Exception;

	public void updateStudent(Student student) throws Exception;
}
