package com.app.Services;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.CourseDao;
import com.app.entities.Course;

@Service
public class CourseServiceimpl implements CourseServices {
	
	@Autowired
	private CourseDao coursedao;
	

//	List<Course>list;
	
	public CourseServiceimpl() {
//		list=new ArrayList<>();
//		list.add(new Course(1,"Java","Java Tutorials"));
//		list.add(new Course(2,"C++","C++ Tutorials"));
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		//return list;
		return coursedao.findAll();
	}

	@Override
	public Course getcoursebyid(Long Courseid) {
		// TODO Auto-generated method stub
//		Course c=null;;
//		for(Course course : list) {
//			if(course.getCourseid()==Courseid) {
//				c=course;
//				break;
//			}
//		}
//		return c;
		return coursedao.getOne(Courseid);
	}
	
	@Override
	public Course addcourse(Course course) {
//		list.add(course);
//		return course;
		coursedao.save(course);
		return course;
	}

	@Override
	public Course update(Course course) {
		// TODO Auto-generated method stub
//		list.forEach(val->{
//			if(val.getCourseid()==course.getCourseid()) {
//				val.setCoursename(course.getCoursename());
//				val.setCoursedescription(course.getCoursedescription());
//			}
//		});
		coursedao.save(course);
		return course;
	}

	@Override
	public void deletecourseusingid(Long courseid) {
		// TODO Auto-generated method stub
//		list=this.list.stream().filter(e->e.getCourseid()!=courseid).collect(Collectors.toList());
		
		coursedao.deleteById(courseid);
	}
	
}
