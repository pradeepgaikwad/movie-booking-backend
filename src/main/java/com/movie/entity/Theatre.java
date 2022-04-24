package com.movie.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Theatre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long theatreId;
	
	String theatrename;
	
	String theatrelocation;
	
	String theatrecity;
	
	@OneToOne(targetEntity = Operator.class,cascade = CascadeType.ALL)
	Operator operator;
	
	@OneToMany(targetEntity = Screens.class,cascade = CascadeType.ALL)
	List<Screens> screens;
	
}
