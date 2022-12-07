package com.example.courseapp.dao;

import com.example.courseapp.model.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseDao extends CrudRepository<Course,Integer> {

    @Query(value = "SELECT `id`, `course_title`, `date`, `description`, `duration`, `venue` FROM `course` WHERE `course_title` LIKE %:course_title%",nativeQuery = true)
    List<Course>searchCourse(@Param("course_title") String course_title );
}
