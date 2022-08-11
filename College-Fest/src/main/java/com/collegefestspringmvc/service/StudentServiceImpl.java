package com.collegefestspringmvc.service;

import java.util.List;

import com.collegefestspringmvc.dao.StudentDao;
import com.collegefestspringmvc.model.Student;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

	@Override
	public void addStudent(Student student) {
		studentDao.addStudent(student);

	}

	@Override
	public void deleteStudentById(int studentId) {
		try {
			studentDao.deleteStudentById(studentId);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateStudent(Student student) {
		try {
			studentDao.updateStudent(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
