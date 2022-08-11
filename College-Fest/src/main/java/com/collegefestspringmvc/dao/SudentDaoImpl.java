package com.collegefestspringmvc.dao;

import java.util.List;

import com.collegefestspringmvc.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class SudentDaoImpl implements StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Student> getAllStudents() {
		return hibernateTemplate.loadAll(Student.class);
	}

	@Override
	public void addStudent(Student student) {
		hibernateTemplate.save(student);

	}

	@Override
	public void deleteStudentById(int studentId) throws Exception {
		Student student = hibernateTemplate.get(Student.class, studentId);
		if (student == null) {
			throw new Exception("Not found");
		}
		hibernateTemplate.delete(student);
	}

	@Override
	public void updateStudent(Student student) throws Exception {
		Student std = hibernateTemplate.get(Student.class, student.getId());
		if (std == null) {
			throw new Exception("Not found");
		}
		hibernateTemplate.update(student);

	}

}
