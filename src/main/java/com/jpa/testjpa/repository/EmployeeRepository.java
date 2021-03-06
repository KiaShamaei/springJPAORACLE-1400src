package com.jpa.testjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.testjpa.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	public List<Employee> findByFirstNameStartingWithOrLastNameStartingWith(String firstname,String lastname);
	
//	@Query("SELECT e FROM Employee  e WHERE LOWER (e.firstName) LIKE LOWER (:searchword) OR LOWER (e.lastName) LIKE LOWER (:searchword) ")
    public List<Employee> findEmployee (@Param("searchword") String searchword);

	
}
