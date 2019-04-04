package com.codeclan.example.bookingSystem;

import com.codeclan.example.bookingSystem.models.Booking;
import com.codeclan.example.bookingSystem.models.Course;
import com.codeclan.example.bookingSystem.models.Customer;
import com.codeclan.example.bookingSystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.bookingSystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.bookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createABookingThatHasACourseAndACustomer(){
		Course course = new Course("Java", "Glasgow", 5);
		courseRepository.save(course);
		Customer customer1 = new Customer("Delia", "Glasgow", 25);
		customerRepository.save(customer1);
		Booking booking1 = new Booking("24-05-2019", course, customer1);
		bookingRepository.save(booking1);
	}

//	@Test
//	public void findCoursesByStarRating(){
//		List<Course> found = courseRepository.findCoursesByStarRating(5);
//		assertEquals(5, found.get(0).getStarRating());
//	}


}
