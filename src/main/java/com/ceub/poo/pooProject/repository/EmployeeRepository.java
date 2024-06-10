package com.ceub.poo.pooProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.ceub.poo.pooProject.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	@Query(nativeQuery = true, value="SELECT * from Employee WHERE Phone = ?;")
	Employee findByPhone(String phone);
	
	
}
