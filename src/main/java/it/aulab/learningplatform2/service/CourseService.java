package it.aulab.learningplatform2.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.aulab.learningplatform2.dto.CourseDTO;
import it.aulab.learningplatform2.dto.CreateCourseDTO;
import it.aulab.learningplatform2.dto.UpdateCourseDTO;
import it.aulab.learningplatform2.model.Course;
import it.aulab.learningplatform2.repository.CourseRepository;

@Service("courseService")
public class CourseService implements CrudService<CourseDTO,Long,CreateCourseDTO ,UpdateCourseDTO> {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ModelMapper mapper;



    @Override
    public List<CourseDTO> readAll() {
       List<CourseDTO> dtos = new ArrayList<CourseDTO>();
       for(Course c : courseRepository.findAll()){
        dtos.add(mapper.map(c, CourseDTO.class));
       }
       return dtos;
    }

    @Override
    public List<CourseDTO> read() {
          // TODO Auto-generated method stub
          throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    

    @Override
    public CourseDTO create(Long createDTO) {
        Course course = mapper.map(createDTO,Course.class);
        courseRepository.save(course);
        CourseDTO creaCourseDTO = mapper.map(course,CourseDTO.class);
        return creaCourseDTO;
    }

    @Override
    public CourseDTO update(CreateCourseDTO updateDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public CourseDTO delete(UpdateCourseDTO id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }


    
}
