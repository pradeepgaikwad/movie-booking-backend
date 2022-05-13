package com.movie.repo;

import org.springframework.data.repository.CrudRepository;

import com.movie.entity.Movie;

public interface MovieRepository extends CrudRepository<Movie,Long>{
	


} 