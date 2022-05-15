package com.movie.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class MoviesInTheatre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long moviesInTheatreId;
	
	//@JsonIgnore
	@ManyToOne
	//@OneToMany(targetEntity = Movie.class ,cascade = CascadeType.ALL)
	@JoinColumn(name = "movie",referencedColumnName = "movieId")
	Movie movie1;
	
	//@JsonIgnore
	//@ManyToOne
	@OneToMany(targetEntity = Operator.class ,mappedBy = "operatorId",cascade = CascadeType.ALL)
	//@JoinColumn(name = "operator",referencedColumnName = "operatorId")
	Set<Operator> operator1;
	
	//@JsonIgnore
	@ManyToOne
	//@OneToMany(targetEntity = Theatre.class ,mappedBy = "theatreId",cascade = CascadeType.ALL)
	@JoinColumn(name = "theatre",referencedColumnName = "theatreId")
	Theatre theatre1;
	
	//@JsonIgnore
	//@ManyToOne
	@OneToMany(targetEntity = Screens.class ,mappedBy = "screenId",cascade = CascadeType.ALL)
	//@JoinColumn(name = "screen",referencedColumnName = "screenId")
	Set<Screens> screen1;

	public MoviesInTheatre() {
	}

	public MoviesInTheatre(Movie movie1, Set<Operator> operator1, Theatre theatre1, Set<Screens> screen1) {
		this.movie1 = movie1;
		this.operator1 = operator1;
		this.theatre1 = theatre1;
		this.screen1 = screen1;
	}

	public Movie getMovie1() {
		return movie1;
	}

	public void setMovie1(Movie movie1) {
		this.movie1 = movie1;
	}

	public Set<Operator> getOperator1() {
		return operator1;
	}

	public void setOperator1(Set<Operator> operator1) {
		this.operator1 = operator1;
	}

	public Theatre getTheatre1() {
		return theatre1;
	}

	public void setTheatre1(Theatre theatre1) {
		this.theatre1 = theatre1;
	}

	public Set<Screens> getScreen1() {
		return screen1;
	}

	public void setScreen1(Set<Screens> screen1) {
		this.screen1 = screen1;
	}

	public Long getMoviesInTheatreId() {
		return moviesInTheatreId;
	}

	@Override
	public String toString() {
		return "MoviesInTheatre [moviesInTheatreId=" + moviesInTheatreId + ", movie1=" + movie1 + ", operator1="
				+ operator1 + ", theatre1=" + theatre1 + ", screen1=" + screen1 + "]";
	}

	

}
