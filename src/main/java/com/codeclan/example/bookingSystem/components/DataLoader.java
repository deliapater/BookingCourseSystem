package com.codeclan.example.bookingSystem.components;


import com.codeclan.example.bookingSystem.models.Booking;
import com.codeclan.example.bookingSystem.models.Course;
import com.codeclan.example.bookingSystem.models.Customer;
import com.codeclan.example.bookingSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.bookingSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.bookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader(){

    }


    public void run(ApplicationArguments args) {
        Course course1 = new Course("Java", "Glasgow", 5);
        courseRepository.save(course1);

        Customer customer1 = new Customer("Delia", "Glasgow", 25);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Cleyra", "Glasgow", 29);
        customerRepository.save(customer2);

        Booking booking1 = new Booking("24-05-2019", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("24-05-2019", course1, customer2);
        bookingRepository.save(booking2);
    }
}
