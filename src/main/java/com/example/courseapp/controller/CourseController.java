package com.example.courseapp.controller;

import com.example.courseapp.dao.CourseDao;
import com.example.courseapp.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CourseController {

    @Autowired
    private CourseDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Course> viewcourse(){
        return(List<Course>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addcourse",consumes = "application/json",produces = "application/json")
    public String addcourse(@RequestBody Course c){
        System.out.println(c.getCourseTitle());
        System.out.println(c.getDescription());
        System.out.println(c.getVenue());
        System.out.println(c.getDuration());
        System.out.println(c.getDate());
        dao.save(c);
        return "Course added successfully";
    }
}
