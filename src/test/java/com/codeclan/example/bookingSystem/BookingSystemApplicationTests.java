package com.codeclan.example.bookingSystem;

import com.codeclan.example.bookingSystem.models.Course;
import com.codeclan.example.bookingSystem.repositories.CourseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createACourse(){
		Course course = new Course("Java", "Glasgow", 5);
		courseRepository.save(course);
	}

}
