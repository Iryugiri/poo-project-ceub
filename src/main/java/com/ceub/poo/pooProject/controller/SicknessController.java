package com.ceub.poo.pooProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceub.poo.pooProject.service.SicknessService;

@RestController
@RequestMapping("/api/sickness")
public class SicknessController {

	@Autowired
	private SicknessService service;
	
	@PostMapping("/addSickTo/{phone}")
	public void addSickness(@PathVariable String phone, @RequestBody List<String> sickness) {
		service.addSicknessToEmployee(phone, sickness);
	}
	
	
	// Fazer sickness remove by sick
		
	// Exemplo : (remove method) http://localhost:8080/api/employee/remove/sick/Escorbuto
}
