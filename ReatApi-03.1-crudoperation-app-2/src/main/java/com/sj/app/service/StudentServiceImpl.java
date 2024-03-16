package com.sj.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.app.binding.Student;
import com.sj.app.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private StudentRepo srepo;
	
	@Override
	public String upsert(Student student) {

		srepo.save(student);
		return "sucess";
	}

	@Override
	public Student getById(Integer sid) {
		Optional<Student> status = srepo.findById(sid);
		if(status.isPresent()) {
			return status.get();
		}
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		return srepo.findAll();
	}

	@Override
	public String deleteByid(Integer sid) {

		if(srepo.existsById(sid)) {
			srepo.deleteById(sid);
			return "deleted successfully";
		}else {
			return "no data found";
		}
		
	}

}
