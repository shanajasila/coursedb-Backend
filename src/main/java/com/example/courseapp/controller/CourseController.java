package com.example.courseapp.controller;

import com.example.courseapp.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CourseController {
    @GetMapping("/view")
    public String viewcourse(){
        return "Welcome to view page";
    }

    @PostMapping(path = "/addcourse",consumes = "application/json",produces = "application/json")
    public String addcourse(@RequestBody Course c){
        System.out.println(c.getCourseTitle());
        System.out.println(c.getDescription());
        System.out.println(c.getVenue());
        System.out.println(c.getDuration());
        System.out.println(c.getDate());
        return "Course added successfully";
    }
}
