package com.collegefestspringmvc.controller;

import java.util.List;

import com.collegefestspringmvc.model.Student;
import com.collegefestspringmvc.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/student/list")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@PostMapping("/student/add")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}

	@PostMapping("/student/update")
	public void updateStudent(@RequestBody Student student) {
		studentService.updateStudent(student);
	}

	@DeleteMapping("/student/delete/{studentId}")
	public void deleteStudent(@PathVariable int studetId) {
		studentService.deleteStudentById(studetId);
	}
}
