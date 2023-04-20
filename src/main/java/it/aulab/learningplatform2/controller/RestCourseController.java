package it.aulab.learningplatform2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.aulab.learningplatform2.dto.CourseDTO;
import it.aulab.learningplatform2.dto.CreateCourseDTO;
import it.aulab.learningplatform2.model.Course;
import it.aulab.learningplatform2.service.CourseService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Getter
@Setter
@NoArgsConstructor
@RestController
@RequestMapping("api/courses")
public class RestCourseController {

    @Autowired
    private CourseService courseServiceImpl;

    @GetMapping
    public List<CourseDTO> get (@RequestParam Map<String , String> params){
        // for(String p : params.keySet()){
        //     System.out.println("KEY: " + p);
        //     System.out.println("VALUE: " + params.get(p));
        // }
        return courseServiceImpl.readAll();
    }

 }
    
    

