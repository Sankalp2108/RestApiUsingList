package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new Course(145,"Java","Good Course"));
		list.add(new Course(4343,"MongoDB" , "Greate Course"));
		
	}
	
	
	@Override
	public List<Course> getCourses() {
		return list;
	}


	@Override
	public Course getCourse(long courseID) {
		
		Course c = null;
		for(Course course : list)
		{
			if(course.getId()==courseID)
			{
				c = course;
				break;
			}
		}
		return c;
	}


	@Override
	public Course addCourse(Course courses) {
		list.add(courses);
		return courses;
	}


	@Override
	public Course deleteCourse(long courseID) {
		Course c = null;
		for(Course course : list)
		{
			if(course.getId()==courseID)
			{
				c = course;
				list.remove(course);
				break;
			}
		}
		return c;
	}


	@Override
	public Course updateCourse(Course courses,long courseID) {
		Course c = courses;
		for(Course course:list)
		{
			if(course.getId()==courseID)
			{
				course.setId(courses.getId());
				course.setTitle(courses.getTitle());
				course.setDescription(courses.getDescription());
			}
		}
		return c;

	}

}
