package com.rahultech.springdatajpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rahultech.springdatajpa.entities.Course;

public interface CourseRepository extends CrudRepository<Course, String>{

}
// note all the methods (save, findAll etc.) are implemented by proxy class