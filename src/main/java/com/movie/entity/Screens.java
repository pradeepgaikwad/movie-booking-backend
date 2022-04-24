package com.movie.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Screens {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long screenId;
	
	String screenname;
	
	String timing;
	
	Long numberofseats;
	
	Integer availableseats;

	
	
	public Screens() {
		super();
	}



	public Screens(String screenname, String timing, Long numberofseats, Integer availableseats) {
		super();
		this.screenname = screenname;
		this.timing = timing;
		this.numberofseats = numberofseats;
		this.availableseats = availableseats;
	}



	public String getScreenname() {
		return screenname;
	}



	public void setScreenname(String screenname) {
		this.screenname = screenname;
	}



	public String getTiming() {
		return timing;
	}



	public void setTiming(String timing) {
		this.timing = timing;
	}



	public Long getNumberofseats() {
		return numberofseats;
	}



	public void setNumberofseats(Long numberofseats) {
		this.numberofseats = numberofseats;
	}



	public Integer getAvailableseats() {
		return availableseats;
	}



	public void setAvailableseats(Integer availableseats) {
		this.availableseats = availableseats;
	}



	public Long getScreenId() {
		return screenId;
	}



	@Override
	public String toString() {
		return "Screens [screenId=" + screenId + ", screenname=" + screenname + ", timing=" + timing
				+ ", numberofseats=" + numberofseats + ", availableseats=" + availableseats + "]";
	}
	
	
}
