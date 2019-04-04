package com.codeclan.example.bookingSystem.controllers;

import com.codeclan.example.bookingSystem.models.Booking;
import com.codeclan.example.bookingSystem.repositories.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/bookings")
public class BookingController  {

    @Autowired
    BookingRepository bookingRepository;

//    @GetMapping(value= "/date/{date}")
//    public List<Booking> findAllCoursesThatHaveDate (@PathVariable String date) {
//        return bookingRepository.findAllCoursesThatHaveDate(date);

//    }


}
