package com.movie.dao;

public class MasterDaoImpl  {

	/*@Autowired
	private JdbcTemplate jdbcTemplate;

	
	public List<MovieDetails> getMovieDetails() {
		String loginQuery = "select * from booking.moviedetails m \r\n"
				+ "inner join booking.moviestheatre t on m.Id=t.movieid\r\n"
				+ "inner join booking.screen s on t.theatreprimId=s.theatreId;";
		List<Map<String, Object>> allMoviesDetailsList = null;
		allMoviesDetailsList = jdbcTemplate.queryForList(loginQuery);
		List<MovieDetails> m = new ArrayList<MovieDetails>();
		if(allMoviesDetailsList.size()>0) {
			
			for (Map<String, Object> movieDetails : allMoviesDetailsList) {
				System.out.println("movieDetails "+movieDetails);
				MovieDetails movie = new MovieDetails();
				movie.setID((int) movieDetails.get("id"));
				movie.setNAME(String.valueOf(movieDetails.get("name")));
				movie.setNAME(String.valueOf(movieDetails.get("category")));
				movie.setDIMENSION(String.valueOf(movieDetails.get("dimension")));
				movie.setNAME(String.valueOf(movieDetails.get("duration")));
				byte[] b = (byte[]) movieDetails.get("image");
				movie.setIMAGE(b);
				movie.setDIRECTOR(String.valueOf(movieDetails.get("director")));
				movie.setACTOR1(String.valueOf(movieDetails.get("actor1")));
				movie.setACTOR2(String.valueOf(movieDetails.get("actor2")));
				movie.setACTOR3(String.valueOf(movieDetails.get("actor3")));
				movie.setLANGUAGE(String.valueOf(movieDetails.get("language")));
				movie.setNAME(String.valueOf(movieDetails.get("theatreprimId")));
				movie.setTHEATRENAME(String.valueOf(movieDetails.get("theatrename")));
				movie.setLOCATION(String.valueOf(movieDetails.get("location")));
				movie.setMOVIEID((int)movieDetails.get("movieid"));
				movie.setOPERATORID((int)movieDetails.get("operatorid"));
				movie.setSCREENPRIMID((int)movieDetails.get("screenprimId"));
				movie.setSCREENNAME(String.valueOf(movieDetails.get("screenname")));
				movie.setTIMEING(String.valueOf(movieDetails.get("timing")));
				movie.setNUMBEROFSEATS((int)movieDetails.get("numberofseats"));
				movie.setTHEATREID((int)movieDetails.get("theatreid"));
				m.add(movie);
			}
			
		}
		return m;
		
	}

	@Override
	public String addTheatre(String theatreDetails) {
		try {
			String query = "SELECT * FROM booking.theatre where theatrename in (?);";
		} catch(Exception e) {
			
		}
		return null;
	}*/
}
