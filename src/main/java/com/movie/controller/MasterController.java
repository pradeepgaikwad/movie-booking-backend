package com.movie.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

//import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.movie.Employee;
import com.movie.EmployeeRepository;
import com.movie.entity.Theatre;
import com.movie.repo.TheatreRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MasterController {

	/*
	 * @Autowired MasterService service;
	 */

	@Autowired
	TheatreRepository theatreRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@PostMapping("/saveTheatreDetails")
	public Theatre saveTheatreDetails(@RequestBody Theatre details) {
		System.out.println("details"+details);
		return (Theatre) theatreRepository.save(details);
	}
	
	@PostMapping("/saveTheatreDetails1")
	public Theatre saveTheatreDetails1() {
		Theatre t = new Theatre();
		t.setTheatreName("GPQ");
		t.setTheatreLocation("HC");
		t.setTheatreCity("HYD");
		//System.out.println("details"+details);
		return (Theatre) theatreRepository.save(t);
	}
	
	@GetMapping("/getTheatreDetails")
	public List<Theatre> getTheatreDetails() {
		//List<Long> ids=new ArrayList<Long>();
		//ids.add(1L);
		//theatreRepository.deleteAllById(ids);
		//return (List<Theatre>) theatreRepository.findAll();
		return (List<Theatre>) theatreRepository.findAll();
	}
	
	@GetMapping("/getTheatre")
	public Optional<Theatre> getTheatreDetailsById() {
		//List<Long> ids=new ArrayList<Long>();
		//ids.add(1L);
		//theatreRepository.deleteAllById(ids);
		//return (List<Theatre>) theatreRepository.findAll();
		return (Optional<Theatre>) theatreRepository.findById(7L);
	}
	
	@PostMapping("/saveEmp")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return employeeRepository.save(emp);
	}
	
		

	/*
	 * @RequestMapping(value="/test",method=RequestMethod.GET) public List testapi()
	 * {
	 * 
	 * return service.getMovieDetails(); }
	 */
	

	/*********** GET ALL MoviesTest API **********/
	
	/*
	@RequestMapping(value = "/testui", method = RequestMethod.GET)
	public List<Map<String, Object>> testuiapi() {
		System.out.println("Inside test method");

		String loginQuery = "select * from booking.moviedetails m \r\n"
				+ "inner join booking.moviestheatre t on m.Id=t.movieid\r\n"
				+ "inner join booking.theatre th on th.idtheatre=t.theatre\r\n"
				+ "inner join booking.screen s on s.theatreid=th.idtheatre;";
		List<Map<String, Object>> obj = jdbcTemplate.queryForList(loginQuery);
		System.out.println("Result==>> " + obj);
		return obj;
	}*/

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<?> loginWeb(@RequestBody String loginForm) {
		// JSONObjec jsonObj;
		// jsonObj = new JSONObject();
		Map<String, Object> obj = new HashMap<String, Object>();
		obj.put("Output", "Success");
		System.out.println("FormDetails  " + loginForm);
		// return new ResponseEntity<>(jsonObj.toString("Logged
		// Successfully"),HttpStatus.OK);
		// return jsonObj.valueToString("Logged Successfully");
		//session.setAttribute("isLoggedIn", "Pradeep");
		return new ResponseEntity<>(obj, HttpStatus.OK);
	}
/*
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public ResponseEntity<?> logoutWeb(@RequestBody String logoutDetails) {
		System.out.println("session  " + session.getAttributeNames());
		// JSONObject jsonObj;
		// jsonObj = new JSONObject();
		Map<String, Object> obj = new HashMap<String, Object>();
		obj.put("Output", "Success");
		System.out.println("session  " + session.getAttributeNames());
		// return new ResponseEntity<>(jsonObj.toString("Logged
		// Successfully"),HttpStatus.OK);
		// return jsonObj.valueToString("Logged Successfully");
		return new ResponseEntity<>(obj, HttpStatus.OK);
	}

	@RequestMapping(value = "/getMovies", method = RequestMethod.GET)
	public List getMovieDetails() {
		System.out.println("Inside getMovieDetails----");
		// return "Hello";
		return service.getMovieDetails();
	}

	@GetMapping("/addTheatre")
	public List<Theatre> addTheatre(@RequestParam String theatreDetails) {
		System.out.println(service);
		return service.addTheatre(theatreDetails);
	}

	@GetMapping("/addTheatre1")
	public List<Theatre> test1Hello(@RequestParam String name) {
		return theatreRepository.findByTheatrename(name);
	}
	
	@GetMapping("/getTheatre")
	public List test1Hello() {
		//return theatreRepository.getTheatre();
		return null;
	}
	*/

}
