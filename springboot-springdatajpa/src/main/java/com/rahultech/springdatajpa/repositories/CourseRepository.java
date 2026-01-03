package com.rahultech.springdatajpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.rahultech.springdatajpa.entities.Course;

public interface CourseRepository extends CrudRepository<Course, String>{
	// custom methods using findBy other than primary key: just add the method here and the CrudRepository of JpaRepository will take care of implementing it
	//findByXXX() methods
	public List<Course> findByCourseDuration(String courseDuration);
	public List<Course> findByCourseFeeLessThanEqual(int courseFee);
	
	//Custom query
	@Query(value="select * from course_datails", nativeQuery=true) //SQL query
	public List<Course> getAllCourse();
	
	@Query("from Course") // HQL -> Hibernate Query Language->database independent but slow due to conversion of HQL to SQL
	public List<Course> getCourses();
	
	@Query(value="select * from course_datails where course_fee <=:fee", nativeQuery=true) //SQL
	List<Course> getCourseFeeLessThanEqual(int fee);

	@Query(value="from Course where courseFee>= :fee") //HQL
	List<Course> getCourseFeeGreaterThanEqual(int fee);
}
// note all the methods (save, findAll etc.) are implemented by proxy class