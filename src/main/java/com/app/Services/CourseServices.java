package com.app.Services;
import java.util.List;

import com.app.entities.Course;

public interface CourseServices {
	public List<Course>getCourses();
	public Course getcoursebyid(Long Courseid);
	public Course addcourse(Course course);
	public Course update(Course course);
	public void deletecourseusingid(Long courseid);
}
