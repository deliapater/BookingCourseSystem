package com.codeclan.example.bookingSystem.controllers;

import com.codeclan.example.bookingSystem.models.Course;
import com.codeclan.example.bookingSystem.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;


    @GetMapping(value = "/starRating/{starRating}")
    public List<Course> findCoursesByStarRating(@PathVariable int starRating){
        return courseRepository.findCoursesByStarRating(starRating);
    }

}
