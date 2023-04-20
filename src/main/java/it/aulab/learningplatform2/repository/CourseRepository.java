package it.aulab.learningplatform2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.aulab.learningplatform2.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
    
}
