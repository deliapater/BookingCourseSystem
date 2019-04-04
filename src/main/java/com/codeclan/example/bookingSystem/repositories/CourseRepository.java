package com.codeclan.example.bookingSystem.repositories;

import com.codeclan.example.bookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository  extends JpaRepository<Course, Long> {
}
