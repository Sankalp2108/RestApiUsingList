package com.springrest.springrest.services;

import java.util.*;

import com.springrest.springrest.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseID);
	
	public Course addCourse(Course courses);
	
	public Course deleteCourse(long courseID);
	
	public Course updateCourse(Course courses , long courseID);

}
