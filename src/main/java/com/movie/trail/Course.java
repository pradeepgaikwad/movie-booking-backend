package com.movie.trail;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long courseId;
	
	String title;
	
	//@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "TEACHER_ID",referencedColumnName = "teacherId")
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "book_id", nullable = false)
	Teacher teacher;

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}



	public Course() {
	}
	
	
	
	public Course(String title, Teacher teacher) {
		super();
		this.title = title;
		this.teacher = teacher;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Long getCourseId() {
		return courseId;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", teacher=" + teacher + "]";
	}
	
	

}
