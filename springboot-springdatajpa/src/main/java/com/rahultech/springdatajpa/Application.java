package com.rahultech.springdatajpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import com.rahultech.springdatajpa.entities.Employee;
import com.rahultech.springdatajpa.repositories.EmployeeRepository;
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		EmployeeRepository repo= context.getBean(EmployeeRepository.class);
		/*
		Employee e1= new Employee(101,"Raj","Manager",90000);
		Employee e2= new Employee(102,"Ramu","Tester",60000);
		Employee e3= new Employee(103,"Smith","Developer",75000);
		Employee e4= new Employee(104,"Ramesh","Tester",50000);
		Employee e5= new Employee(105,"John","HR",55000);
		Employee e6= new Employee(106,"Mary","Developer",70000);
		Employee e7= new Employee(107,"Ramya","HR",65000);
		Employee e8= new Employee(108,"Satish","Developer",80000);
		List<Employee> employees= Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);
		repo.saveAll(employees);
		
		 
		//pagination
		// page number will start from 0
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter page number");
		int pageNum= sc.nextInt();
		int pageSize=3;
		PageRequest pageRequest= PageRequest.of(pageNum-1, pageSize);
		Page<Employee> pages= repo.findAll(pageRequest);
		List<Employee> employees=pages.getContent();
		employees.forEach(System.out::println);
		
		List<Employee> employees =repo.findAll(Sort.by("empName"));
		employees.forEach(System.out::println);
		
		List<Employee> employees =repo.findAll(Sort.by("empName").descending());
		employees.forEach(System.out::println);
		*/
		List<Employee> employees =repo.findAll(Sort.by("empSalary"));
		employees.forEach(System.out::println);
	}

}
