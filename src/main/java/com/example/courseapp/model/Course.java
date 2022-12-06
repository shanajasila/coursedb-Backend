package com.example.courseapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue

    private int id;
    private String courseTitle;
    private String description;
    private  String venue;
    private String duration;
    private String date;

    public Course() {
    }

    public Course(int id, String courseTitle, String description, String venue, String duration, String date) {
        this.id = id;
        this.courseTitle = courseTitle;
        this.description = description;
        this.venue = venue;
        this.duration = duration;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getDescription() {
        return description;
    }

    public String getVenue() {
        return venue;
    }

    public String getDuration() {
        return duration;
    }

    public String getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
