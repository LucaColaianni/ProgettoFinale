package it.aulab.learningplatform2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.aulab.learningplatform2.model.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long >{
    
}
