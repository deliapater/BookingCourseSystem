package com.codeclan.example.bookingSystem.repositories.BookingRepository;

import com.codeclan.example.bookingSystem.models.Booking;


import java.util.List;

public interface BookingRepositoryCustom {
    List<Booking> findAllCustomersFromCourse (Long id);

    List<Booking> findAllCoursesFromCustomer (Long id);
}
