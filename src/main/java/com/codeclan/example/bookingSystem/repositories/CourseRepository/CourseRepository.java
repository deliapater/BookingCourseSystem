package com.codeclan.example.bookingSystem.repositories.CourseRepository;

import com.codeclan.example.bookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository  extends JpaRepository<Course, Long>, CourseRepositoryCustom {

}
