package com.movie.controller;

import java.util.LinkedList;
import java.util.List;

//import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.trail.Student;
import com.movie.trail.StudentRepo;
import com.movie.trail.Subject;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StudentSubject {

	@Autowired
	StudentRepo studentRepo;
	
	@GetMapping("/students")
	public List getStudent() {
		Student s = new Student();
		Subject s1=new Subject();
		Subject s2=new Subject();
		s1.setSubjectName("JAVA");
		s2.setSubjectName("C++");
		s.setName("KK");
		LinkedList<Subject> l = new LinkedList<Subject>();
		l.add(s1);
		l.add(s2);
		s.setSubjects(l);
		studentRepo.save(s);
		return (List) studentRepo.findAll();
	}
	
	

}
