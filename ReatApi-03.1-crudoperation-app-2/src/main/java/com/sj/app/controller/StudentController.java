package com.sj.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sj.app.binding.Student;
import com.sj.app.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService ssr;
	
	
	@PostMapping("/course")
	public ResponseEntity<String> addStudent(@RequestBody Student student) {
		String status = ssr.upsert(student);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/course/{sid}")
	public ResponseEntity<Student> getStudentById(@PathVariable Integer sid) {
		Student status = ssr.getById(sid);
		return new ResponseEntity<>(status ,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/courses")
	public ResponseEntity<List<Student>> getStudents() {
		List<Student> status = ssr.getAllStudent();
		return new ResponseEntity<>(status ,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/courses/{sid}")
	public ResponseEntity<String> deleteStudents(@PathVariable  Integer sid) {
		String deleteByid = ssr.deleteByid(sid);
		return new ResponseEntity<>(deleteByid ,HttpStatus.CREATED);
	}

}
