package com.example.courseapp.dao;

import com.example.courseapp.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course,Integer> {

}
