package in.snehalJ.service;

import java.util.List;

import in.snehalJ.binding.Course;

public interface CourseService {
	
	public String upsert(Course course);
	public Course getById(Integer cid);
	public List<Course> getAllCourses();
	public String deleteById(Integer cid);
	

}
