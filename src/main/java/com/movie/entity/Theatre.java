package com.movie.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Theatre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JoinColumn(referencedColumnName = "theatre1")
	Long theatreId;
	
	String theatreName;
	
	String theatreLocation;
	
	String theatreCity;
	
	@OneToOne(targetEntity = Operator.class,cascade = CascadeType.ALL)
	Operator operator;
	
	@OneToMany(targetEntity = Screens.class,cascade = CascadeType.ALL)
	Set<Screens> screens;

//	@OneToMany(mappedBy = "theatre1",cascade = CascadeType.ALL)
//	List<MoviesInTheatre> moviesInTheatres;
//	
	public Theatre() {
		super();
	}

public Theatre(String theatreName, String theatreLocation, String theatreCity, Operator operator,
		Set<Screens> screens) {
	super();
	this.theatreName = theatreName;
	this.theatreLocation = theatreLocation;
	this.theatreCity = theatreCity;
	this.operator = operator;
	this.screens = screens;
}

public String getTheatreName() {
	return theatreName;
}

public void setTheatreName(String theatreName) {
	this.theatreName = theatreName;
}

public String getTheatreLocation() {
	return theatreLocation;
}

public void setTheatreLocation(String theatreLocation) {
	this.theatreLocation = theatreLocation;
}

public String getTheatreCity() {
	return theatreCity;
}

public void setTheatreCity(String theatreCity) {
	this.theatreCity = theatreCity;
}

public Operator getOperator() {
	return operator;
}

public void setOperator(Operator operator) {
	this.operator = operator;
}

public Set<Screens> getScreens() {
	return screens;
}

public void setScreens(Set<Screens> screens) {
	this.screens = screens;
}

public Long getTheatreId() {
	return theatreId;
}

@Override
public String toString() {
	return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", theatreLocation=" + theatreLocation
			+ ", theatreCity=" + theatreCity + ", operator=" + operator + ", screens=" + screens + "]";
}

	
}
