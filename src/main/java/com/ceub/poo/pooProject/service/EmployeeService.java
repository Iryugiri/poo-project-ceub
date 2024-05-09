package com.ceub.poo.pooProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceub.poo.pooProject.entity.Employee;
import com.ceub.poo.pooProject.entity.dto.EmployeeDto;
import com.ceub.poo.pooProject.repository.EmployeeRepository;
import com.fasterxml.jackson.core.JsonProcessingException;

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
	
}
