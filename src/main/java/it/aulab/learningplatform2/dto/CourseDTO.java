package it.aulab.learningplatform2.dto;

import java.util.List;

import it.aulab.learningplatform2.model.Lesson;
import it.aulab.learningplatform2.model.Student;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CourseDTO {
    
    private Long id;
    private String name;
    private String description;
    private String teacherFirstName;
    private String teacherLastName;
    private String date;
    private List<Lesson> lessons;
    private List<Student> students;
    //private List<LessonDTO> lessons;
    //private List<StudentDTO> students;

    
}
