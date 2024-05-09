package com.ceub.poo.pooProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.ceub.poo.pooProject.entity.Employee;
import com.ceub.poo.pooProject.entity.dto.EmployeeDto;
import com.ceub.poo.pooProject.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	@Autowired
	private SicknessService service;
	
	public Employee createEmployee(EmployeeDto employeeDto)  {
		Employee employee = new Employee(employeeDto.getName(),employeeDto.getEmail(),employeeDto.getPhone());
		employee = repository.save(employee);
		for (String sick : employeeDto.getSickness()) {
			service.saveSickness(sick, employee);
		}
		return employee;
	}
	
	public Employee findById (Integer id) {
		return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	public List<Employee> findAll () {
		List<Employee> employee = repository.findAll();
		return employee;
	}
	
	public void delete (Integer id) {
		repository.findById(id)
		.map( employee -> {
			repository.delete(employee);
			return Void.TYPE;
		}).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	public void update ( Integer id, Employee updatedEmployee) {
		repository.findById(id)
		.map( employee -> {
			updatedEmployee.setId(employee.getId()) ;
			return repository.save(updatedEmployee);
		})
		.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
}
