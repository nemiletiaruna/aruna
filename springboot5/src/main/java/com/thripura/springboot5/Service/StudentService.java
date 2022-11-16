package com.thripura.springboot5.Service;


	import java.util.ArrayList;
import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.thripura.springboot5.Bean.Student;
import com.thripura.springboot5.Repository.StudentRepository;

	
	@RestController
	public class StudentService {
		@Autowired
		StudentRepository studentRepository;  

		public List<Student> getAllStudent()   
		{  
		List<Student> student = new ArrayList<Student>();  
		studentRepository.findAll().forEach(student1 -> student.add(student1));  
		return getAllStudent();  
		}  

		public Student getStudentById(int id)   
		{  
		return studentRepository.findById(id).get();  
		}  

		public void saveOrUpdate(Student student)   
		{  
		studentRepository.save(student);  
		}  

		public void delete(int id)   
		{  
		studentRepository.deleteById(id);  
		}  

		public void update(Student student, int id)   
		{  
		studentRepository.save(student);  
		}  
		}  



