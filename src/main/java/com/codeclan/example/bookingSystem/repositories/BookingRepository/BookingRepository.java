package com.codeclan.example.bookingSystem.repositories.BookingRepository;

import com.codeclan.example.bookingSystem.models.Booking;
import com.codeclan.example.bookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
//    List<Booking> findAllCustomersFromCourse(Course course);
}


