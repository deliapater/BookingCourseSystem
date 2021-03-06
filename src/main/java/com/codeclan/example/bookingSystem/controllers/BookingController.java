package com.codeclan.example.bookingSystem.controllers;

import com.codeclan.example.bookingSystem.models.Booking;
import com.codeclan.example.bookingSystem.models.Course;
import com.codeclan.example.bookingSystem.repositories.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController  {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value= "/customers/{id}")
    public List<Booking> findAllCustomersFromCourse (@PathVariable Long id) {
        return bookingRepository.findAllCustomersFromCourse(id);

    }

    @GetMapping(value= "/courses/{id}")
    public List<Booking> findAllCoursesFromCustomer (@PathVariable Long id) {
        return bookingRepository.findAllCoursesFromCustomer(id);

    }

    @GetMapping(value= "/date/{date}")
    public List<Booking> findAllBookingsFromDate (@PathVariable String date) {
        return bookingRepository.findAllBookingsFromDate(date);

    }

}
