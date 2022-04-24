package com.movie.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Operator {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long operatorId;
	
	String name;
	String phone;
	String email;
	String password;
	
	@OneToOne(targetEntity = Theatre.class,cascade = CascadeType.ALL)
	Theatre theatre;

	
	
	public Operator() {
		super();
	}



	public Operator(Long operatorId, String name, String phone, String email, String password, Theatre theatre) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.theatre = theatre;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Theatre getTheatre() {
		return theatre;
	}



	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}



	public Long getOperatorId() {
		return operatorId;
	}
	
	
}
