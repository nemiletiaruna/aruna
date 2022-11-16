package com.thripura.springboot5.Repository;

import org.springframework.data.repository.CrudRepository;

import com.thripura.springboot5.Bean.Student;



public interface StudentRepository extends CrudRepository<Student, Integer> {



}
