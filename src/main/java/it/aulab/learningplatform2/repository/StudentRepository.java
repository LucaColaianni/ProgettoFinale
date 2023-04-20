package it.aulab.learningplatform2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.aulab.learningplatform2.model.Student;

public interface StudentRepository extends JpaRepository<Student , Long>{
    
}
