package com.sj.app.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sj.app.binding.Student;

public interface StudentRepo extends JpaRepository<Student, Serializable> {

}
