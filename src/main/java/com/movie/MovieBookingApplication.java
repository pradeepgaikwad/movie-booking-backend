package com.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.movie.controller","com.movie.repo","com.movie.entity","com.movie","com.movie.trail"})
//@EnableJpaRepositories(basePackages = {"com.movie.repo","com.movie.entity","com.movie.trail","com.movie"})
public class MovieBookingApplication {
	public static void main(String[] args) {
		SpringApplication.run(MovieBookingApplication.class, args);
	}

}