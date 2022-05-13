package com.movie.trail;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long subjectId;
	
	String subjectName;


	public Subject() {
	}



	public Subject(Long subjectId, String subjectName) {
		this.subjectName = subjectName;
	}



	public Long getSubjectId() {
		return subjectId;
	}


	public String getSubjectName() {
		return subjectName;
	}



	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}



	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + "]";
	}

	
}
