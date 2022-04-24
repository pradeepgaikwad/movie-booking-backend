package com.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MovieBookingApplication {
	

	public static void main(String[] args) {
		
		SpringApplication.run(MovieBookingApplication.class, args);
	}

}
//@ComponentScan("com.movie.config")