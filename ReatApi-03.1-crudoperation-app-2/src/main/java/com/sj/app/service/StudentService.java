package com.sj.app.service;

import java.util.List;

import com.sj.app.binding.Student;

public interface StudentService {
	
	public String upsert(Student student);
	
	public Student getById(Integer sid);
	
	public List<Student> getAllStudent();
	
	public String deleteByid(Integer sid);

}
