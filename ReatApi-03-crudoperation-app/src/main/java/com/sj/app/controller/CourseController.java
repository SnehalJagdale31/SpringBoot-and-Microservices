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

import com.sj.app.binding.Course;
import com.sj.app.service.CourseServiceImpl;

@RestController
public class CourseController {

	@Autowired
	private CourseServiceImpl csi;
	
	
	@PostMapping("/course")
	public ResponseEntity<String> createCourse(@RequestBody Course course){
		String status = csi.upsert(course);
		
		return new ResponseEntity<>(status,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/course/{cid}")
	public ResponseEntity<Course> getCourse(@PathVariable Integer cid){

		Course course = csi.getById(cid);
		return new ResponseEntity<>(course, HttpStatus.OK);
		
	}
	
	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getAllCourse(){

		List<Course> allcourse = csi.getAllCourses();
		return new ResponseEntity<>(allcourse, HttpStatus.OK);
		
	}
	

	@PutMapping("/course")
	public ResponseEntity<String> updateCourse(@RequestBody Course course){
		String status = csi.upsert(course);
		
		return new ResponseEntity<>(status,HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/course/{cid}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer cid){

		 String status = csi.deleteById(cid);
		return new ResponseEntity<>(status, HttpStatus.OK);
		
	}
	
}
