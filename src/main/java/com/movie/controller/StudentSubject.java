package com.movie.controller;

import java.util.LinkedList;
import java.util.List;

//import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.trail.Course;
import com.movie.trail.CourseRepository;
import com.movie.trail.Student;
import com.movie.trail.StudentRepo;
import com.movie.trail.Subject;
import com.movie.trail.Teacher;
import com.movie.trail.TeacherRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StudentSubject {

	@Autowired
	StudentRepo studentRepo;
	public StudentSubject() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	TeacherRepository teacherrepo;
	
	@Autowired
	TeacherRepository teacherRepository;
	
	@Autowired
	CourseRepository courseRepository;
	
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
	
	@PostMapping("/saveStudents")
	public Student saveStudent(@RequestBody Student student) {
		System.out.println("StudentDetails:===>> "+student);
		return studentRepo.save(student);
	}
	
	@GetMapping("/getAllTeachers")
	public List<Teacher> getAllTeachers(){
		return (List<Teacher>) teacherrepo.findAll();
	}
	

	@PostMapping("/saveTeachers")
	public Teacher saveTeacher(@RequestBody Teacher teacher) {
//		Teacher dto =new Teacher();
//		Course savedCourses =null;
//		dto.setFirstName(teacher.getFirstName());
		Teacher savedTecher = teacherRepository.save(teacher);
//		Set<Course> courses = teacher.getCourses();
//		for (Course course : courses) {
//			course.setTeacher(savedTecher);
//			 savedCourses = courseRepository.save(course);
//		}
		//savedTecher.setCourses(courses);
		//System.out.println("saveTeacher:===>> "+teacher);
		
		return savedTecher;//teacherRepository.save(teacher);
	}
	
	@PostMapping("/saveCourses")
	public Course saveTeacher(@RequestBody Course course) {
		System.out.println("saveTeacher:===>> "+course);
		return courseRepository.save(course);
	}
}
