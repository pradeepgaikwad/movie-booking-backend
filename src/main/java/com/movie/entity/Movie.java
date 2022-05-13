package com.movie.entity;

import java.util.Arrays;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long movieId;
	
	private String name;
	
	private String category;
	
	private String dimension;
	
	private String duration;
	
	private byte[] image;
	
	private String director;
	
	private String actor1;
	
	private String actor2;
	
	private String actor3;
	
	private String language;

	public Movie() {
		super();
	}

	@OneToMany(mappedBy = "movie1",cascade = CascadeType.ALL)
	Set<MoviesInTheatre> moviesInTheatre;





	public Movie(String name, String category, String dimension, String duration, byte[] image, String director,
			String actor1, String actor2, String actor3, String language, Set<MoviesInTheatre> moviesInTheatre) {
		//super();
		this.name = name;
		this.category = category;
		this.dimension = dimension;
		this.duration = duration;
		this.image = image;
		this.director = director;
		this.actor1 = actor1;
		this.actor2 = actor2;
		this.actor3 = actor3;
		this.language = language;
		this.moviesInTheatre = moviesInTheatre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor1() {
		return actor1;
	}

	public void setActor1(String actor1) {
		this.actor1 = actor1;
	}

	public String getActor2() {
		return actor2;
	}

	public void setActor2(String actor2) {
		this.actor2 = actor2;
	}

	public String getActor3() {
		return actor3;
	}

	public void setActor3(String actor3) {
		this.actor3 = actor3;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Long getMovieId() {
		return movieId;
	}






	public Set<MoviesInTheatre> getMoviesInTheatre() {
		return moviesInTheatre;
	}



	public void setMoviesInTheatre(Set<MoviesInTheatre> moviesInTheatre) {
		this.moviesInTheatre = moviesInTheatre;
	}



	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", name=" + name + ", category=" + category + ", dimension=" + dimension
				+ ", duration=" + duration + ", image=" + Arrays.toString(image) + ", director=" + director
				+ ", actor1=" + actor1 + ", actor2=" + actor2 + ", actor3=" + actor3 + ", language=" + language
				+ ", moviesInTheatre=" + moviesInTheatre + "]";
	}



	
	
}
