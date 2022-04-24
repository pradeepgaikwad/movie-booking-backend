package com.movie.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class MoviesInTheatre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long moviesInTheatreId;
	
	
	@OneToMany(targetEntity = Movie.class,cascade = CascadeType.REFRESH)
	List<Movie> movies;
	
	@OneToMany(targetEntity = Operator.class,cascade = CascadeType.REFRESH)
	List<Operator> operators;
	
	@OneToMany(targetEntity = Theatre.class,cascade = CascadeType.REFRESH)
	List<Theatre> theatres;
	
	@OneToMany(targetEntity = Screens.class,cascade = CascadeType.REFRESH)
	List<Screens> screens;

	
	
	public MoviesInTheatre() {
		super();
	}


	public Long getMoviesInTheatreId() {
		return moviesInTheatreId;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public List<Operator> getOperators() {
		return operators;
	}

	public List<Theatre> getTheatres() {
		return theatres;
	}

	public List<Screens> getScreens() {
		return screens;
	}

	@Override
	public String toString() {
		return "MoviesInTheatre [moviesInTheatreId=" + moviesInTheatreId + ", movies=" + movies + ", operators="
				+ operators + ", theatres=" + theatres + ", screens=" + screens + "]";
	}
	
}
