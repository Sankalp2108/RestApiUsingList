package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home()
	{
		return "Hello World";
	}
	
	//get the course
	@GetMapping("/courses")
	public List<Course> getCourse()
	{
		return this.courseService.getCourses();
	}
	
	//Getting Course by Id
	@GetMapping("/courses/{courseID}")
	public Course getCours(@PathVariable long courseID)
	{
		return this.courseService.getCourse(courseID);
	}
	
	//Creating the course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
	}
	
	//Deleting the Course
	@DeleteMapping("/courses/{courseID}")
	public Course deleteCourse(@PathVariable long courseID)
	{
		return this.courseService.deleteCourse(courseID);
	}
	
	//Updating the Course
	@PutMapping("/courses/{courseID}")
	public Course updateCourse(@RequestBody Course courses ,@PathVariable long courseID)
	{
		return this.courseService.updateCourse(courses , courseID);
	}
	
	

}
