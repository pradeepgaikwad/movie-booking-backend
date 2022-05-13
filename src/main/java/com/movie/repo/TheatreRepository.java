package com.movie.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.movie.entity.Theatre;

public interface TheatreRepository extends CrudRepository<Theatre,Long>{
	
	//public Theatre findbyTheatrename(String theatreDetails);
	public List<Theatre> findBytheatreName(String str);
	
	/*
	 * @Query("select * from booking.theatre t \r\n" +
	 * "inner join booking.screen s on s.theatreid=t.idtheatre;") public List
	 * getTheatre();
	 */

} 