package com.movie.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MoviesInTheatre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long moviesInTheatreId;
	
	@ManyToOne
	@JoinColumn(name = "movie",referencedColumnName = "movieId")
	Movie movie1;
	
	@ManyToOne
	@JoinColumn(name = "theatre",referencedColumnName = "theatreId")
	Theatre theatre1;
	
	public MoviesInTheatre() {
	}

	public MoviesInTheatre(Set<Operator> operator1, Theatre theatre1) {
		this.movie1 = movie1;
		this.theatre1 = theatre1;
	}

	public Movie getMovie1() {
		return movie1;
	}

	public void setMovie1(Movie movie1) {
		this.movie1 = movie1;
	}


	public Theatre getTheatre1() {
		return theatre1;
	}

	public void setTheatre1(Theatre theatre1) {
		this.theatre1 = theatre1;
	}


	public Long getMoviesInTheatreId() {
		return moviesInTheatreId;
	}

	@Override
	public String toString() {
		return "MoviesInTheatre [moviesInTheatreId=" + moviesInTheatreId + ", movie1=" + movie1 + ", theatre1="
				+ theatre1 + "]";
	}


}
