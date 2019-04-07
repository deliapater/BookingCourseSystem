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
		Course course2 = new Course("Photoshop", "Glasgow", 5);
		courseRepository.save(course2);

		Customer customer1 = new Customer("Delia", "Glasgow", 25);
		customerRepository.save(customer1);
		Customer customer2 = new Customer("Cleyra", "Glasgow", 29);
		customerRepository.save(customer2);
		Customer customer3 = new Customer("Jose", "Glasgow", 32);
		customerRepository.save(customer3);
		Customer customer4 = new Customer("Juan", "Glasgow", 28);
		customerRepository.save(customer4);
		Customer customer5 = new Customer("Maria", "Glasgow", 32);
		customerRepository.save(customer5);

		Booking booking1 = new Booking("24-05-2019", course, customer1);
		bookingRepository.save(booking1);
		Booking booking2 = new Booking("24-05-2019", course, customer2);
		bookingRepository.save(booking2);
		Booking booking3 = new Booking("24-05-2019", course, customer3);
		bookingRepository.save(booking3);
		Booking booking4 = new Booking("24-05-2019", course, customer4);
		bookingRepository.save(booking4);
		Booking booking5 = new Booking("24-05-2019", course2, customer5);
		bookingRepository.save(booking5);
	}

//	@Test
//	public void findCoursesByStarRating(){
//		List<Course> found = courseRepository.findCoursesByStarRating(5);
//		assertEquals(5, found.get(0).getStarRating());
//	}


}
