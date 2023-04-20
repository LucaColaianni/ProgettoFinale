package it.aulab.learningplatform2.dto;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateCourseDTO {
    
    private String name;
    private String description;
    private String teacherFirstname;
    private String teacherLastname;
    private String date;
    private List<Long> studentsIds;

}
