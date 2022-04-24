package com.movie.trail;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long studentId;
	String name;
	
	@OneToMany(targetEntity=Subject.class,cascade = CascadeType.ALL)
	List<Subject> subjects;

	public Student(Long studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", subjects=" + subjects + "]";
	}

	

}
