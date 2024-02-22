package com.example.rest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.rest.entities.Course;

@Service
public interface CourseService {
	
	public List<Course> getCourses();
}
