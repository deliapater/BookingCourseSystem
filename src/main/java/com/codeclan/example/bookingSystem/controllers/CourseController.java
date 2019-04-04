package com.codeclan.example.bookingSystem.controllers;

import com.codeclan.example.bookingSystem.models.Course;
import com.codeclan.example.bookingSystem.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name= "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping
    public List<Course> getAllCourses() { return courseRepository.findAll();}

    @GetMapping(value = "/rating/{starRating}")
    public List<Course> findCourseByStarRating (@PathVariable int starRating){
        return courseRepository.findCourseByStarRating(starRating);
    }
}
