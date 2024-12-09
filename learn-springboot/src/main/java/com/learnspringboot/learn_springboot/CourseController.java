package com.learnspringboot.learn_springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/Courses")
	public List<Course> retrieveAllCourses() {
		
		return Arrays.asList(
				
				new Course(1,"AWS DATA ENGINEERING", "in28mintues"),
				new Course(2,"AWS DevOps","in28mintues")
				
				);
	}
}
