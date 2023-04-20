package it.aulab.learningplatform2.dto;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateCourseDTO {
    
    private String description;
    private String date;
    private List<Long> addedStudentsIds;
    private List<Long> removedStudentsIds;
}
