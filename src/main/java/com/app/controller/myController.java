package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.Services.CourseServices;
import com.app.entities.Course;

@RestController
public class myController {
	
	@Autowired
	private CourseServices courseservice;
	
	@GetMapping("/home")
	public String home() {
		return "This is our home";
	}
	
	//Get the courses
	@GetMapping("/courses")
	public List<Course>getcourse(){
		List<Course>list1=courseservice.getCourses();
		return list1;
	}
	
	//Get the Course by courseId
	@GetMapping("/courses/{courseid}")
	public Course getcoursebyid(@PathVariable Long courseid ) {
		Course Course1=courseservice.getcoursebyid(courseid);
		return Course1;
	}
	
	//Add a new Course
	@PostMapping("/courses")
	public Course addcourse(@RequestBody Course course) {
		Course course1=courseservice.addcourse(course);
		System.out.println(course);
		return course1;
	}
	
	//Update a course
	@PutMapping("/courses")
	public Course updatecourse(@RequestBody Course course) {
		courseservice.update(course);
		return course;
	}
	
	//Delete a Course
	@DeleteMapping("/courses/{courseid}")
	public ResponseEntity<HttpStatus> deletecourse(@PathVariable String courseid){
		try {
			courseservice.deletecourseusingid(Long.parseLong(courseid));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	
}
