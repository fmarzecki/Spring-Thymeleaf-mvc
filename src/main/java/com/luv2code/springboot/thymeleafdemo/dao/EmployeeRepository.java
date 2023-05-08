package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("SELECT e FROM Employee e ORDER BY e.lastName ASC")
	List<Employee> findAllOrderByLastNameAsc();

	//second way to do this, JPA will create appropriate query by reading the function name
	List<Employee> findAllByOrderByLastNameAsc();
}
