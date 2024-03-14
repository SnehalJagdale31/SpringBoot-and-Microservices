package com.sj.app.service;

import java.util.List;

import com.sj.app.binding.Course;

public interface CourseService {

	
	public String  upsert(Course course);
	
	public Course getById(Integer cid);
	
	public List<Course> getAllCourses();
	
	public String deleteById(Integer cid);
}
