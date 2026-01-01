package com.rahultech.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rahultech.springdatajpa.entities.Course;
import com.rahultech.springdatajpa.repositories.CourseRepository;

@SpringBootApplication
public class SpringbootSpringdatajpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringbootSpringdatajpaApplication.class, args);
		CourseRepository repo= context.getBean(CourseRepository.class); // the object of proxy class are returned. We can not create object of an interface
//		System.out.println(repo.getClass()); it will print proxy class
		/*
		 * Insert
		Course c1= new Course("UI", "UI Full Stack", "3 months", 18000);
		repo.save(c1);
		
		// count() method
		System.out.println("Numbers of Cources ="+repo.count());
		
		//select operation based on primary key
		Course c= repo.findById("FSJ").get();
		System.out.println(c);
		
		
		//select all records
		Iterable<Course> courses=repo.findAll();
		
		//for (Course course: courses) {
			//System.out.println(course);
		//}
		//or
		//courses.forEach(c-> System.out.println(c));
		//or
		courses.forEach(System.out::println); //method reference
		
		
		// update operation
		Course c= repo.findById("FSJ").get();
		c.setCourseFee(25000);
		repo.save(c);
		
	
		
		//delete operation based on primary key
		if (repo.existsById("FSJ"))
			repo.deleteById("FSJ");
		else
			System.out.println("Course ID does not exists");
				*/
		//Delete all records
		repo.deleteAll();
	}

}
