package com.rahultech.springdatajpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahultech.springdatajpa.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	//Note: JpaRepository= CrudRepository + Pagination + sorting
}
