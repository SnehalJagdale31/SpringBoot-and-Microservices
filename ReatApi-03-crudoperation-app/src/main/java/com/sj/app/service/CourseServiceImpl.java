package com.sj.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.app.binding.Course;
import com.sj.app.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	
	@Autowired
	private CourseRepository crp;

	@Override
	public String upsert(Course course) {
		crp.save(course);
		return "success";
	}

	@Override
	public Course getById(Integer cid) {
		
		Optional<Course> findById = crp.findById(cid);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		return crp.findAll();
	}

	@Override
	public String deleteById(Integer cid) {

		if(crp.existsById(cid)) {
			crp.deleteById(cid);
             return "Deleted successfully";
		}else {
		
		return "No Record Found";
		}
	}

}
