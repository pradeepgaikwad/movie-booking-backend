package com.movie.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.movie.entity.Movie;
import com.movie.entity.MoviesInTheatre;
import com.movie.entity.Screens;
import com.movie.entity.Theatre;

public interface MoviesInTheatreRepository extends CrudRepository<MoviesInTheatre,Long>{
	


} 