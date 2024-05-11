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
	
	public EmployeeDto findById (Integer id) {
		Employee employee = repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		List<String> sickList = service.findSicknessOfEmployee(id);
		EmployeeDto employeeDto = new EmployeeDto(employee.getName(),employee.getPhone(),employee.getEmail(),sickList);
		return employeeDto;
	}
	
	public void delete (Integer id) {
		service.delete(id);
		repository.findById(id).map(employee -> {
			repository.delete(employee);
			return Void.TYPE;
		}).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		
	}
	
	public void updateEmployee ( Integer id, Employee updatedEmployee) {
		
		Employee employee = repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
		updatedEmployee.setId(employee.getId());
		repository.save(updatedEmployee);
		
		}
	
	// Fazer sickness add
	
	// Fazer sickness remove by sick
	
	// Exemplo : (remove method) http://localhost:8080/api/employee/remove/sick/Escorbuto
	
}
