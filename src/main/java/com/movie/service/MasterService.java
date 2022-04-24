package com.movie.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.entity.Theatre;

//@Service
public interface MasterService {
	
	public List login();
	
	public List getMovieDetails() ;
	
	public List<Theatre> addTheatre(String theatreDetails);
	
	//public List getTheatre();

}
