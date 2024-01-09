package in.snehalJ.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.snehalJ.binding.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
