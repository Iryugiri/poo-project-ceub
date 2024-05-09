package com.ceub.poo.pooProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ceub.poo.pooProject.entity.Employee;
import com.ceub.poo.pooProject.entity.dto.EmployeeDto;
import com.ceub.poo.pooProject.service.EmployeeService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService serviceEmployee;
	
	/*
	 * @Autowired private SicknessRepository repositorySick;
	 */
	
	public EmployeeController( EmployeeService serviceEmployee) {
		this.serviceEmployee = serviceEmployee;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@RequestBody EmployeeDto employeeDto) throws JsonProcessingException {
		serviceEmployee.createEmployee(employeeDto);
	}
	
	@GetMapping("/find/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Employee findById (@PathVariable Integer id) {
		return serviceEmployee.findById(id);
	}
	
	@GetMapping("/findAll")
	@ResponseStatus(HttpStatus.OK)
	public List<Employee> findAll () {
		return serviceEmployee.findAll();
	}
	
	@DeleteMapping("/remove/{id}")
	public void delete (@PathVariable Integer id) {
		serviceEmployee.delete(id);
	}
	
	@PutMapping("/update/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void update (@PathVariable Integer id, @RequestBody Employee updatedEmployee) {
		serviceEmployee.update(id, updatedEmployee);
	}
	
	
	
}
