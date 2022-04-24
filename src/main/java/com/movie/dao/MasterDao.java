package com.movie.dao;

import java.util.List;

public interface MasterDao {
	
	public List getMovieDetails();
	
	public String addTheatre(String theatreDetails);
}
