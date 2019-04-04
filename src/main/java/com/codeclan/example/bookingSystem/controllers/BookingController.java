package com.codeclan.example.bookingSystem.controllers;

import com.codeclan.example.bookingSystem.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/bookings")
public class BookingController  {

    @Autowired
    BookingRepository bookingRepository;
}
