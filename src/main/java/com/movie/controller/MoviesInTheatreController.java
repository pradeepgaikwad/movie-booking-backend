package com.movie.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.entity.Movie;
import com.movie.entity.MoviesInTheatre;
import com.movie.entity.Operator;
import com.movie.entity.Screens;
import com.movie.entity.Theatre;
import com.movie.repo.MovieRepository;
import com.movie.repo.MoviesInTheatreRepository;
import com.movie.repo.TheatreRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MoviesInTheatreController {
	
	@Autowired
	MoviesInTheatreRepository moviesInTheatreRepository;
	
	@Autowired
	MovieRepository movieRepository;
	
	@Autowired
	TheatreRepository theatreRepository;
	
	@PostMapping("/saveMoviesInTheatres")
	public MoviesInTheatre saveMovies(@RequestBody MoviesInTheatre details) {	
		System.out.println("Movie Details ==>> "+details);
		return (MoviesInTheatre)moviesInTheatreRepository.save(details);	
		}
	
	@PostMapping("/saveMoviesInTheatres1")
	public MoviesInTheatre saveMovies1(@RequestBody MoviesInTheatre details) {	
		MoviesInTheatre m = new MoviesInTheatre();
		Optional<Movie> mv = movieRepository.findById(1L);
		Movie movie=null;
		if(mv.isPresent()) {
			 movie = mv.get();
		}
		
		Optional<Theatre> th = theatreRepository.findById(2L);
		Theatre t=null;
		if(th.isPresent()) {
			t = th.get();
		}
		m.setMovie1(movie);
		m.setTheatre1(t);
		System.out.println("Movie Details ==>> "+details);
		return (MoviesInTheatre)moviesInTheatreRepository.save(m);	
		}
	
	@PostMapping("/saveMoviesInTheatres2")
	public MoviesInTheatre saveMovies2(@RequestBody MoviesInTheatre details) {	
		MoviesInTheatre m = new MoviesInTheatre();
		Optional<Movie> mv = movieRepository.findById(1L);
		Movie movie=null;
		if(mv.isPresent()) {
			 movie = mv.get();
		}
		
		Optional<Theatre> th = theatreRepository.findById(2L);
		Theatre t=null;
		if(th.isPresent()) {
			t = th.get();
		}
		Operator operator = t.getOperator();
		Set<Screens> screens = t.getScreens();
		m.setMovie1(movie);
		m.setTheatre1(t);
		System.out.println("Movie Details ==>> "+details);
		return (MoviesInTheatre)moviesInTheatreRepository.save(m);	
		}
	
	@GetMapping("/getAllMoviesInTheatre")
	public List<MoviesInTheatre> getAllMovies() {
		return (List<MoviesInTheatre>) moviesInTheatreRepository.findAll();
	}
	
	@GetMapping("/getAllMoviesInTheatre1")
	public Optional<MoviesInTheatre> getMoviesById() {
		return (Optional<MoviesInTheatre>) moviesInTheatreRepository.findById(6L);
	}

}
