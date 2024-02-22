package com.example.rest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.rest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{

	List<Course> list;
	
	
	public CourseServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Course(1, "Secret Seven", "Written by Enid Blyton"));
		list.add(new Course(2, "Let's C","Tutorial for C Language"));
	}


	@Override
	public List<Course> getCourses() {
		
		return list;
	}
	
	
}
