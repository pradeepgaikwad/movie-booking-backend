package com.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.entity.Movie;
import com.movie.repo.MovieRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MovieController {
	
	@Autowired
	MovieRepository movieRepository;
	
	@PostMapping("/saveMovies")
	public Movie saveMovies(@RequestBody Movie details) {
		System.out.println("Movie Details ==>> "+details);
		return (Movie)movieRepository.save(details);	
		}
	
	@GetMapping("/getAllMovies")
	public List<Movie> getAllMovies() {
		return (List<Movie>) movieRepository.findAll();
	}
}
