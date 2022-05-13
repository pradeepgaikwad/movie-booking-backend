package com.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movie.entity.Movie;
import com.movie.entity.Theatre;
import com.movie.repo.TheatreRepository;

@Service
public class MasterServiceImpl implements MasterService{
		
	@Autowired
	TheatreRepository theatreRepository;

	@Override
	public List login() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> getMovieDetails() {
		return null;
		//return dao.getMovieDetails();
	}

	@Override
	public List<Theatre> addTheatre(String theatreDetails) {
		System.out.println("theatreDetails "+theatreDetails);
		//public Theatre findBytheatrename(String str);
		  Iterable<Theatre> findAll = theatreRepository.findAll();
		  List<Theatre> th = theatreRepository.findBytheatreName(theatreDetails);
		System.out.println("addTheatre "+findAll);
		return th;
	}


	public List getTheatre() {
		// TODO Auto-generated method stub
		//return theatreRepository.getTheatre();
		return null;
	}
}
