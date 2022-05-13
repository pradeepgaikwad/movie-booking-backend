package com.movie.trail;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.movie.entity.Movie;
import com.movie.entity.Theatre;

@Entity
@Table
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long teacherId;
	String firstName;
	
	//@OneToMany(targetEntity = Course.class,mappedBy = "teacher",cascade = CascadeType.ALL)
	//@OneToMany(mappedBy = "teacher",cascade = CascadeType.ALL)
	//@JsonIgnore
	@OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
	Set<Course> courses;
	
	

	public Teacher() {
	}

	public Teacher(String firstName, Set<Course> courses) {
		super();
		this.firstName = firstName;
		this.courses = courses;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public Long getTeacherId() {
		return teacherId;
	}
	
	
	
	
}
