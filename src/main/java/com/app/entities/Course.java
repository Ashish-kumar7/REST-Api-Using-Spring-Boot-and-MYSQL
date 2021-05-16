package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private Long courseid;
	private String coursename;
	private String coursedescription;
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(Long courseid, String coursename, String coursedescription) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.coursedescription = coursedescription;
	}
	
	public Long getCourseid() {
		return courseid;
	}
	public void setCourseid(Long courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCoursedescription() {
		return coursedescription;
	}
	public void setCoursedescription(String coursedescription) {
		this.coursedescription = coursedescription;
	}

	@Override
	public String toString() {
		return "course [courseid=" + courseid + ", coursename=" + coursename + ", coursedescription=" + coursedescription + "]";
	}
	
}
