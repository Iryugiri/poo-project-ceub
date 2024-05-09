package com.ceub.poo.pooProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.ceub.poo.pooProject.entity.Employee;
import com.ceub.poo.pooProject.entity.dto.EmployeeDto;
import com.ceub.poo.pooProject.repository.EmployeeRepository;
import com.ceub.poo.pooProject.service.EmployeeService;
import com.ceub.poo.pooProject.service.SicknessService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repository;
	
	@Autowired
	private EmployeeService serviceEmployee;
	
	@Autowired SicknessService serviceSickness;
	
	/*
	 * @Autowired private SicknessRepository repositorySick;
	 */
	
	public EmployeeController( EmployeeRepository repository) {
		this.repository = repository;
	//	this.repositorySick = repositorySick;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void save(@RequestBody EmployeeDto employeeDto) throws JsonProcessingException {
		serviceEmployee.createEmployee(employeeDto);
	}
	
	@GetMapping("/find/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Employee findById (@PathVariable Integer id) {
		return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	@GetMapping("/findAll")
	@ResponseStatus(HttpStatus.OK)
	public List<Employee> findAll () {
		List<Employee> employee = repository.findAll();
		return employee;
	}
	
	@DeleteMapping("/remove/{id}")
	public void delete (@PathVariable Integer id) {
		repository.findById(id)
		.map( employee -> {
			repository.delete(employee);
			return Void.TYPE;
		}).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	@PutMapping("/update/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void update (@PathVariable Integer id, @RequestBody Employee updatedEmployee) {
		repository.findById(id)
		.map( employee -> {
			updatedEmployee.setId(employee.getId()) ;
			return repository.save(updatedEmployee);
		})
		.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	
	
}
